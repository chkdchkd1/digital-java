

/* 과목코드, 강의년도, 강의학기, 분반, 강의실 강의시간, 교수번호가 주어졌을 때 새로운 강의를 등록하는 프로시저를 작성하세요 */
-- concat 함수 : 매개변수들을 이어서 하나의 문자열로 만드는 함수 
-- concat ( 1, 'abc', '-') => '1abc-' 
 

drop procedure if exists insert_course;
delimiter //
create procedure insert_course (
	in subject_num VARCHAR(6) ,  # 과목코드
    in course_year int,			 # 강의년도	
    in course_seasion int,		 # 강의학기
    in course_class int ,		 # 분반
    in course_time VARCHAR(30) , # 강의시간
    in course_room VARCHAR(15) , # 강의실
    in course_pf_num int 		 # 교수번호
)
begin 
	declare _code varchar(16);
	set _code 
    = concat(course_year,subject_num,'_',course_seasion,'_',course_class);
    -- 학기는 1학기,2학기,계절학기-여름(3),계절학기-겨울(4)로 되어있음
    if course_seasion >= 1 and course_seasion <=4
    -- subject_num과 일치하는 과목이 있으면  => 외래키의 값으로 상대방의 기본키 값이 없을 때 
    and (select count(*) from subject where sub_num = subject_num) !=0 
    -- course_pf_num 과 일치하는 교수가 있으면 
	and (select count(*) from professor where pf_num = course_pf_num) !=0 
	-- 학기가 교수번호보다 빠르면 예시 )  2015년 수업을 2019 학번인 교수가 강의하려는 경우 
    and convert(course_pf_num / 100000, signed integer) <= course_year +2000
    -- 강의 코드 중복 체크 
    and (select count(*) from course where co_code = _code) =0 
    then
   
    insert into course
    values (_code,course_class,course_time,course_room,subject_num,course_pf_num);
    end if;
end //
delimiter ; 

call insert_course('MSC810', 20, 1, 3, '월234','N1-305', 202011002);
SELECT * FROM course;
