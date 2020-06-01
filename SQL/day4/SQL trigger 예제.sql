use shopping;

 -- 트리거 
 -- 구매리스트 테이블에 구매한 제품을 등록 
 -- >> 제품 등록 리스트 테이블에 있는 재고량을 변경
 -- >> 구매 테이블에 있는 총가격을 변경 
drop trigger if exists insert_purchase_list; 
-- purchase_list에 insert 이벤트가 발생 된 후에 도작하는 트리거
-- 데이터가 추가된 후에 동작하며 추가된 데이터는 new를 통해 접근할 수 있다.
delimiter //
create trigger insert_purchase_list after insert on purchase_list
-- for each row는 update나 delete와 같이 조건에 의해 여러 행이 수정되거나 삭제될때 
-- 변경되는 각행을 의미 
for each row
begin
	-- >> 제품 등록 리스트 테이블에 있는 재고량을 변경
	-- _amount 변수 선언
	declare _amount int default 0; -- 1. 구매 리스트에 추가된 제품의 현재 재고량을 가져와서 _amount에 저장
	declare _total_price int default 0;    -- 1. 현재 구매에 대한 총가격을 가져옴
    declare _price int default 0;
    
    -- new.pl_p_num는 지금 데이터에 추가된 구매리스트와 제품코드
	set _amount = 
		(select prl_amount from product_registration_list where prl_p_num = new.pl_p_num);
    -- 2. 현재 재고량에서 구매한 양을 뺌

    set _amount = _amount - new.pl_amount;
    -- 3. 구매 제품의 제고량을 변경 
    update  product_registration_list
		set prl_amount = _amount
        where prl_p_num = new.pl_p_num;
        
	-- > 구매 테이블에 있는 총 가격을 변경
    -- 1. 현재 구매에 대한 총가격을 가져옴
	-- 2. 추가된 구매제품의 가격을 가져옴
    set _total_price 
	= (select pc_price from purchase where new.pl_pc_num = pc_num);
    -- 3. 추가된 구매제품의 수량을 가져옴
    -- 4. 총가격 = 총가격 + 가격*수량 
	
    set _price 
		= (select p_price from product where p_num = new.pl_p_num ); 
     /* 아싸리 product에서 가져오는 것 
     set _price 
	= ( select p_price  from purchase_list
	join product on p_num = pl_p_num where p_num = new.pl_p_num  limit 0,1); 
    이렇게 하면 purchase_list에서 같은 제품이 구매될 경유 가격값을 여러개 가져와야되서
    중복이 일어남 그래서 limit 처리해서 0번지부터 1개 가져오도록 처리해줘야 */ 
    
        
	set _total_price = _total_price + _price * new.pl_amount;
    
    -- 5. 총가격을 변경 
    update purchase 
     set pc_price = _total_price
     where new.pl_pc_num = pc_num;
end//
delimiter ;
show triggers; 


/*-- 회원이 제품을 구매했을 때 DB에서 일어나는 상황 
1. purchase 테이블 insert 이벤트 발생 
2. purchase_list 테이블 insert 이벤트 구매한 제품 종류만큼 
3. product_registraion_list 테이블에서 update 이벤트 (재고량)
4. purchase 테이블 update 이벤트 (총가격)
   
-- 관리자가 판매글을 등록했을 때 DB에서 일어나는 상황
1. product 테이블에 insert 이벤트 발생  (등록하려는 제품 종류만큼)
2. product_registraiton 테이블에 insert 이벤트 발생
3. product_registration_list 테이블에 insert 이벤트 발생 (등록하려는 제품 종류만큼)

-- 비회원이 판매자로 등록되기 위한 과정
1.memeber 테이블에 insert 이벤트 발생
2 member 테이블에 m_authority 값 변경 (update, 권한부여) 
*/