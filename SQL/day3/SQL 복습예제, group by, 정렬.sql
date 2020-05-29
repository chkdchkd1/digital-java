-- select 속성 
-- from 테이블A 
--    join 테이블B 
--    on 테이블A.속성명 = 테이블B.속성명 
-- where 조건;

-- 기본키가 중복값을 저장하지 않는다 하더라고 외래키 자체가 중복값을 저장할 수 있다 ex)학생 학번과 지도학생의 학번 
-- > >  uq 체크해줘야
-- 홍길동 교수님의 모든 지도 학생을 확인하기 위한 sql문을 작성하세요 
select pf_name as '지도 교수', st_name as '지도 학생' 
	from coach
    join (select * from professor where pf_name = '홍길동') as t
    -- 서브쿼리, 검색해서 그 걸 join 하는거 
    on ch_pf_num = pf_num
    join student
    on ch_st_num = st_num;
    
-- 홍길동 교수님이 강의하거나 했던 모든 과목명을 확인하는 sql문을 작성
-- 폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템 
select co_code, sub_title as'강의명', pf_name as '강의 교수'
	from course
    join (select * from professor where pf_name = '홍길동') as pf
    on co_pf_num = pf_num
    join subject
    on co_sub_num = sub_num;
    
-- 홍길동 교수님이 2020년 1학기에 강의하는 모든 과목명을 확인하는 SQl
-- 2020#_%#_1% 로 조건을걸면 다음과 같은 경우에 검색이되서 잘못됨 =  2020_MCS001_2_1 
-- >> 의도한바는 2020년 1학기가 걸려야 되지만 위 조건은 1분반을 걸린다. MCS001_2까지 중간 '%'로 보는것 
-- 2020#_%#_1_% 로 걸어줘야한다. / -- % : 글자 0개 이상존재 

select co_code, sub_title, pf_name
	from (select * from course where co_code like '20%#_1#_%' escape '#') as s
    join (select * from professor where pf_name = '홍길동') as pf
    on co_pf_num = pf_num
    join subject
    on co_sub_num = sub_num;
  
select co_code, sub_title, pf_name
	from course 
    join professor 
    on co_pf_num = pf_num
    join subject
    on co_sub_num = sub_num
    where pf_name = '홍길동'and co_code like '20%#_1#_%' escape '#' ;
    
    
-- 홍길동 교수가 하거나 했던 강의 이름이 중복된 강의명을 제거 (group by)
 select co_code, sub_title as'강의명', pf_name as '강의 교수'
	from course
    join (select * from professor where pf_name = '홍길동') as pf
    on co_pf_num = pf_num
    join subject
    on co_sub_num = sub_num
    group by sub_title;   

    
-- 정렬 : order by 속성 ASC(오름차순) / DESC(내림차순)
select * from attend order by at_num desc;


    
    

SELECT * FROM coach;

