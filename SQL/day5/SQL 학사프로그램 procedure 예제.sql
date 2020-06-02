/*
트리거 : 이벤트가 발생되면 자동실행
프로시저 : 필요할 때 호출, 함수 
*/
/*drop procedure if exists 프로시저명;
delimiter // 
create procedure 프로시저명(
	in 매개변수 자료형,
	in 매개변수 자료형, 
    (여러개 올 수 있다) 
    out 리턴변수 자료형 
)
begin
end//
delimiter;
*/
/*학번이 주어지면 주어진 학번의 학생이름을 반환하는 프로시저*/
drop procedure if exists select_student;
delimiter //
create procedure select_student (
	in student_num int ,
    out student_name varchar(40)
)
begin 
	set student_name = (select st_name from student where st_num = student_num);
end //
delimiter ; 
# @변수는 한번선언되면 끝까지 정보가 유지 되는 변수 
-- 그냥 변수는 그 줄에서만 유효한 변수, 그 이후에는 값이 유효하지않는다. (ex) student_name , @student_name 이렇게 안쓰고 ㅇㅇ) 
call select_student(2019110034, @student_name);
select @student_name; 
-- 값을 보여줌 = select , 이줄은 테이블과 연관이 없기때문에 from 없이 사용 할 수 있다 





