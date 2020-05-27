/* student 테이블안에 있는 모든 행들의 st_num와 
st_name의 값들을 확인하기 위한 SQL문을 작성하세요. */
select st_num, st_name from university.student;
/* student 테이블안에 있는 모든 행들의 모든 속성 값들을 
확인하기 위한 SQL문을 작성하세요. */
select st_num, st_name, st_identification_num, st_type 
from university.student;
select * from university.student;

insert into 
student(st_num, st_name, st_identification_num, st_degree, st_major)
values(2020110014,'허준','010101-3123456','석사','수학교육');

select * from student;

/* degree가 석사인 학생을 삭제하는 SQL을 작성하세요.*/
delete from student where st_degree='석사';
select * from student;