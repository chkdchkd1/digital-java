
-- join은 두 테이블을 연결하여 하나의 테이블을 만들때 쓴다, 또한 위치는 자유롭게 쓸 수있다.  
-- 두 테이블을 연결해주는 연결골에 해당하는 부분이 on 다음에 나오는 코드. 
-- on을 통해 연결하는 테이블A와 테이블B에 연결하는 속성명이 서로 다른 경우 테이블명을 생략할 수 있다.
-- on을 통해 연결하는 두개의 속성들은  서로 의미가 같아야한다. 
-- >> professor.pf_num = course.co_pf_num; -> pf_num = co_pf_num;으로 변경 가능 
-- 여러개의 테이블을 join으로 연결할 때, 테이블 연결 순서에 따라 join속도가 달라진다 

select 속성 
	from 테이블A 
    join 테이블B 
    on 테이블A.속성명 = 테이블B.속성명 
where 조건;
select * from course;

-- 강의를 하는 교수명을 확인하기 위한 sql
select co_code, pf_name from course join professor on professor.pf_num = course.co_pf_num;

-- 강의코드와 강의명을 확인하기 위한 sql
select co_code, sub_title
 from course join subject 
 on co_sub_num = sub_num;

-- 강의의 과목명과 교수를 확인하기 위한 sql
select co_code, sub_title, pf_name 
	from course 
    join professor 
    on professor.pf_num = course.co_pf_num
	join subject 
    on co_sub_num = sub_num;

-- 학생이름과 지도 교수이름이 출력 되도록 sql문
select  pf_name, st_name
	from coach
    join professor
    on ch_pf_num = pf_num 
    join student
    on ch_st_num= st_num;
    
-- 홍길동 학생이 수강했거나 하고 있는 과목을 출력하는 sql문 
select sub_title, st_name
	from attend
    join student
    on at_st_num = st_num
    join course
    on at_co_code = co_code
    join subject
    on co_sub_num = sub_num
    where st_name = '홍길동';
    
    -- 위 sql문 보다 검색 속도를 높이는 sql
    select sub_title, st_name
	from attend
		-- student 테이블에서 이름이 홍길동인 학생을 검색하여 검색 결과를 st라는 임시테이블로 생성 
        -- MySQL에서는 as 테이블명을 안붙이면 에러 발생(서브 쿼리 결과에 이름을 안붙이면 에러 발생)
        -- 오라클에서는 as와 st를 안붙여도 가능 
		join (select * from student where st_name = '홍길동') as st
		on at_st_num = st_num
		join course
		on at_co_code = co_code
		join subject
		on co_sub_num = sub_num;
-- 정규화 : 일정규칙에 의해 테이블 나누는 것
-- >> 정규화를 너무 많이 하는 경우에는 join을 해야해서 성능이 떨어질 수 있다(위처럼, 벌써 조인을 3번이나 .. )
-- 반정규화 : join을 피하기 위해 테이블에 일정속성을 추가하는 것. 이때 무결성을 지켜야한다 (ex) 학번과 이름이 일치해야) 
    
-- 현재(2020년 1학기) 개설된 과목명 을 볼 수 있도록 SQl문을 작성하세요
 select sub_title
	from course
    join subject
    on co_sub_num = sub_num
    where co_code like '20%' and co_code like'%_1%' ; 
    
 select co_code, sub_title
	from (select * from course where co_code like '20%_1_%') as t
     join subject on co_sub_num = sub_num;
   

-- 둘리 학생이 현재까지 수강했거나 수강한 과목의 총 학점 (해당수업학점) 을 출력하는 sql문 작성 
-- 일단 둘리학생이 수강한 과목들이 필요함 그럼 수강과목 테이블과와 학생 테이블의 이름이 '둘리'인것의 학번이 동일해야. 
-- < 필요한 정보를 생각해서 그걸연결> 

 select st_name, sum(sub_point)
	from attend
    join (select * from student where st_name = '둘리') as t
    on at_st_num = st_num
    join course
    on at_co_code = co_code
    join subject
    on co_sub_num = sub_num;
    
-- 수강기록에서 총점을 확인하는 sql문 
select at_co_code as 강의코드, at_st_num as 학번,
 (at_midterm+at_finals+at_homework+at_attendance) as 총점  from attend;
 
 -- 2020년 1학기에 대학수학기초 강의 1분반 학생의 수를 확인하는 sql문
 -- 먼저 검색을 하고 붙이긔(join)
 select  sub_title as 과목명, count(*) as '수강 학생 수' 
	from (select * from attend where at_co_code like '20MSC001@_1@_1' escape '@') as t
    join course
    on at_co_code = co_code
    join subject 
    on co_sub_num = sub_num;
-- 바로 이렇게 넣으면 안되는이유가 밖에서 볼땐 20년 1학기 1분반 대학수강기초 강의의 강의코드를 모르기때문에
  
select  sub_title as 과목명, count(*) as '수강 학생 수' 
from (select * from attend where at_co_code like '20%@_1@_%' escape '@') as t2
    join course
    on at_co_code = co_code
    join (select * from subject where sub_title = '대학수학기초') as s
    on co_sub_num = sub_num;
    
-- %의 역할이 문자열이 뒤에 있을수도 있고 없을 수도 있다. 
-- _의 역할은 한자리의 문자열이 있음을 ~
-- 문자열에 '_'나 '%'를 문자로 취급하고 싶으면 앞에 #,@이를 입력해주어야 한다 
-- '20%@_1@_%' escape '@' 로 쳐주어야 한다.  _= 1글자 , % = 여러글자 , 



-- 홍길동 학생이 작성한 게시글 을 확인하는 SQL문 
-- 문제에서 주어진 것들로만 코드를 작성, 검색하고 join하냐 join하고 검색하냐.. 

select bt_type as '분류', bo_title as'제목', bo_content as '내용', st_name as '작성자'
 from (select * from student where st_name ='홍길동') as t
 join board
 on bo_st_num = st_num
 join board_type
 on bo_bt_code = bt_code;
 
 
 
    
    
    
    
