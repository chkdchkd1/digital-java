-- 성이 '홍'씨인 모든 학생들의 정보를 출력하는 Sql문 
SELECT * FROM student where st_name Like '홍%';

-- 이름에 '홍'이 들어가는 모든 학생들의 정보를 출력하는 Sql문 
SELECT * FROM student where st_name Like '%홍%';

-- 이름 끝자에 '홍'인 모든 학생들의 정보를 출력하는 Sql문 
SELECT * FROM student where st_name Like '%홍';

-- 학번이 2020인 모든 학생들의 정보를 출력하는 sql문
select * from student where st_num like '2020%';

-- < 데이터 삭제 시 유의사항 >
-- 삭제하려는 데이터를 다른 테이블에서 외래키로 참조하고 있는 경우, 삭제가 불가능하다.
-- 1) 참고하고 있는 데이터를 삭제 후 해당(삭제하려던) 데이터를 삭제
-- 2) 참고하고 있는 데이터를 수정 후 해당(삭제하려던) 데이터를 삭제 

-- 학생이 게시글에 첨부파일을 추가하여 게시글을 등록하려고 한다.
-- 이때 게시글이 등록하기 위해서 전제 조건은 무엇이고, 어느 테이블에서 insert가 일어나야 하는가?
-- board에 insert 되기 위한 조건 
-- >> Student, board_type 값이 등록되어 있어야한다.
-- attachments에 insert 되기 위한 조건
-- >> board에 값이 등록 되어있어야한다. board insert후에 해야한다. 

-- 학생의 성이 홍씨이고, 학번이 2020번인 학생들의 모든 정보를 출력하는 sql문
select * from student where st_num like '2020%' and st_name like '홍%';

-- 강의코드가 20MSC001011인 강의를 수강하는 학생들의 중간고사 총점을 출력하는 sql문
 select sum(at_minterm) from attend where at_co_code = '20MSC001011';
-- 강의코드가 20MSC001011인 강의를 수강하는 학생들의 중간고사 평균을 출력하는 sql문
select avg(at_minterm) from attend where at_co_code = '20MSC001011';
-- 강의코드가 20MSC001011인 강의를 수강하는 학생들의 수를 출력하는 sql문
select count(*) from attend where at_co_code = '20MSC001011';
