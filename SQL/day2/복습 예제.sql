-- 등록된 학생들의 학번과 이름이 출력(검색)되도록 SQL문을 작성하세요.
SELECT  st_num, st_name
	FROM university.student;
    
-- 등록된 학생들 중에서 학번이 2020110011인 학생의 모든 정보를 출력하는 sql문을 작성하세요.
select * FROM university.student 
	where st_num = 2020110011;
    
-- 등록된 학생들 중에서 학번이 2020110011이 아닌 학생의 모든 정보를 출력하는 sql문을 작성하세요.
select * From student
	where st_num != 2020110011;
    
 -- 2019학번 학생을 등록하는 Sql문을 작성하세요. (값은 임의로)
 insert into student
	values (2019110034, '둘리', '132459-5412360', '학사', '전기공학');
    
 -- 2020학번 학생들만 출력되도록 SQL문을 작성하세요 
 select * From student 
	where st_num >= 2020000000;
 
SELECT * FROM university.student;