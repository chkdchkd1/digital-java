/* 제품 등록을 하려면 선행되어야 하는 작업은 무엇인가 
1. member 테이블이 회원 정보를 추가
2. product 테이블에 제품 정보 추가 
3

*/

/* 제품 등록을 할 수 있는 회원을 확인하기 위한 SQL문을 작성하세요 */
-- 권한이 USER가 아닌 회원으로 검색 => 추후에 판매자가 등록 될 수도 있기 때문에 
select m_name from shopping.member where m_authority != 'USER';

-- 현재 구입할 수 있는 제품들을 확인하는 SQL문을 작성하세요. 
-- 재고량에 대한 조건도 있어야한다. 
select p_name as '제품명', prl_amount as '재고량'
	from product_registration_list
		join product
			on prl_p_num = p_num
	where prl_amount > 0;
    
/*abcd123 회원이 구매한 제품들을 확인하는 SQL문을 작성하세요 */

select pc_m_id as '구매자' , p_name as'제품명' , pl_amount as'구매량'
	from ( select * from purchase where pc_m_id = 'abc123') as t 
    join purchase_list
    on pc_num = pl_pc_num
    join product
    on pl_p_num = p_num;
    
select m_id as '구매자' , p_name as'제품명' , pl_amount as'구매량'
	from purchase_list
	join product
	on pl_p_num = p_num
	join purchase
    on pc_num = pl_pc_num
    join shopping.member
    on m_id = pc_m_id
    where m_id = 'abc123';
    
    
    
    


/*테이블 A의 기본키 속성을 수정하려면 할 때 에러가 나는 경우
원인 : 테이블 B의 외래키로 테이블 A의 기본키가 설정된 경우
해결 : 
1. 테이블 B의 외래키 해제member
2. 테이블 A의 기본키 속성 변경
3. 테이블 B의 외래키 재설정 */