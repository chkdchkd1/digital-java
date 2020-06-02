/*2017110001 학번이 총 이수한 학점을 출력하는 Sql문을 작성하세요 */ 
select at_st_num as '학번' , sum(sub_point) as '이수학점'
	from (select * from attend where at_st_num = 2017110001 and at_complete = 'Y') as t
    join course
    on at_co_code = co_code
    join university.subject
    on co_sub_num = sub_num;
 
/*위 sql문을 트리거로 작성하세요 */
-- 수강(atted) 테이블에서 수강정보가 변경되면 변경된 학생의 이수학점을 변경하는 트리거를 작성하세요 
-- 이벤트 update (수정)
-- 이벤트 발생 테이블 attend 
-- 왜냐면 수강 신청했을때 attend행이 추가되는데 attend에 추가 됐다고 해서 다 이수완료하는건 아니라서

use university;
drop trigger if exists update_attend;
delimiter //
create trigger update_attend after update on attend
-- after  : 이벤트 후에 실행할 것 
for each row
begin
	declare _point int default 0;    
    declare _total int default 0; # total : 업데이트 되기전 총 이수학점을 가져오는 것 
	if new.at_complete = 'Y' then 
    -- then 앞이 조건문 the뒤가 실행문 
    -- 밑에는 처음부터 학점을 계산하는 것기 때문에 처음부터 Y인것만 더하면되서 조건문이 'Y' 하나임 
	set _point 
		= (select ifnull(sum(sub_point),0)
				from (select * from attend where at_st_num = new.at_st_num and at_complete = 'Y') as t
                -- new : 업데이트 된 ~ 
					join course
				on at_co_code = co_code
					join university.subject
				on co_sub_num = sub_num); 
                
	update  student
		set st_point = _point
        where st_num = new.at_st_num;
	end if ;
    
    if old.at_complete = 'Y' and new.at_complete = 'N' then
    -- 학점포기할 때 의 SQl 전체학점에서 변경된 학점을 빼줘야 하기때문에 조건을 이렇게 걸어줌 
		set _total = (select st_point from student where st_num = new.at_st_num);
        # total은 업데이트 되기전 총 이수학점 
        
        # 이시점의 point는 학점 포기한 강의의 학점 
        set _point = (select sub_point
				from (select * from attend where at_st_num = new.at_st_num and new.at_co_code = at_co_code) as t
					join course
				on at_co_code = co_code
					join university.subject
				on co_sub_num = sub_num); 
		# _point는 새로 계산된 총 이수학점 
		set _point = _total - _point; 
        
    update  student
		set st_point = _point
        where st_num = new.at_st_num;
    end if;
	
end//
delimiter ;
show triggers; 


# 트리거 사용시 유의사항 
-- 트리거 실행문 안에서 트리거 이벤트가 발생한 테이블을 수정할 수 없다.
-- ex) 위의 트리거는 attend테이블의 값을 insert , update, delete는 할 수 없다. 
-- 위의 트리거는 attend 테이블에서 이벤트가 발생 할 때 실행되는 테이블이기 때문에 트리거 안에서 attend 테이블을 수정 할 수 없다.
