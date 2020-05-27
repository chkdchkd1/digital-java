-- 1. 과목 등록
insert into subject values('MSC001', '대학수학기초' , 2, '3', '사범대학', '수학교육학과');
select * from university.subject;
-- 2. 교수 등록
insert into professor
	values(202011001, '임꺽정', '컴퓨터공학학과', '40','강의실101호','010-123-4567');
select * from university.professor;
-- 3. 강의 등록
insert into course
values('20MSC001011' , 01, '월1, 수2,3' ,'N1-101', 'MSC001', '202011001');
select * from course;
-- 4. 학생등록
-- 5. 수강등록
-- 테이블 초기화하고 넣어줘야 카운트 가 순대로 나온다 
truncate table attend;
insert into attend(at_st_num, at_co_code)
values(2020110011,'20MSC001011');
insert into attend(at_st_num, at_co_code)
values(2020110013,'20MSC001011');
select * from attend;
