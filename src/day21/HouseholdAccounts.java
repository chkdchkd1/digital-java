package day21;

import java.util.*;

public class HouseholdAccounts {

	public static void main(String[] args) {
		// 어떻게 관리할것인가를 생각하고 클래스 멤버변수를 짜야한다. 
		/* 가계부 프로그램을 작성하시오.
			 메뉴
			 1. 등록
			   - 일시, 내용, 수입/지출, 금액, 분류를 등록
			 2. 수정
			   - 등록된 리스트 중에 수정할 내용을 선택 => 선택한 내용을 수정
			 3. 확인
			   - 일시를 기준으로 확인
			   - 수입/지출을 기준으로 확인
			   - 분류를 기준으로 확인
			 4. 종료*/
		Scanner scan = new Scanner(System.in);
		List<Account> list  = new ArrayList<Account>(); //가계부 
		Account a ; //건당 지출내역정보
		
		//구현만 내일 메인에서 하면 된다~.~ 
		
		a = inputAccount(scan);
		insertAccount(list, a);

		a = inputAccount(scan);
		insertAccount(list, a); 
		
		System.out.println(list);
		
		a = inputAccount(scan);
		modifyAccount(list, a, scan);
		
		System.out.println(list);
		
	}

	
	/*기능 : 스캐너를 통해서 가계부 내용을 입력받아 건당 정보로 반환하는 메서드 
	 * 매개변수 : List<Account> list , Scanner scan
	 * 리턴타입 : void
	 * 매서드명 : inputAccount*/
	
	public static Account inputAccount(Scanner scan) {
		Account a = new Account();
		String tmp ="";
		System.out.print("일시   예)20-05-21 : ");
		a.date = scan.next();
		System.out.print("내용  : ");
		while((tmp = scan.nextLine()).trim().length() == 0);
		a.content = tmp;
		System.out.print("수입/지출  : ");
		tmp = scan.next();
		a.inandout = tmp;
		System.out.print("금액  : ");
		tmp = scan.next();
		a.money = tmp;
		System.out.print("분류  : ");
		while((tmp = scan.nextLine()).trim().length() == 0);
		a.category = tmp;		
	
		return a;
	}
	
	
	
	
	/*기능 :  입력받은 건당 정보들을 가계부에 저장하는 메서드 , 무사히 저장했으면 true, 이미 있는내용이거나 비어있는 값이어서 저장 못했을 댄 false
	 * 매개변수 : List<Account> list (가계부) , Account a (하루치정보)
	 * 리턴타입 :  boolean
	 * 메서드명 : insertAccount
	 * */
	
	public static boolean insertAccount (List<Account> list, Account a) {
		if(list == null || a == null || list.contains(a))
			return false;
		list.add(a);
		return true;
	}
	
	//이거 다시해야한다 .
	/*기능: 등록된 리스트 중에 수정할 내용을 선택 => 선택한 내용을 수정
	 * 수정하려는 건당 정보들을 받고 가계부에 있으면 내용만 따로 설정하기. 가계부에 그 정보가 없으면 false
	 * 매개변수 : 가계부 List<Account> 수정하고싶은 정보 Account a , 새로 설정할 내용 Scanner scan
	 * 리턴타입 : boolean
	 * 메서드명 : modifyAccount */
	
	public static boolean modifyAccount (List<Account> list, Account a, Scanner scan) {
		if(list == null || a == null || !list.contains(a))
		return false;
		for(int i = 0 ; i<list.size();i++) {
			if(list.get(i).equals(a)) {
				System.out.println("변경할 내용을 입력하세요 : ");
				list.get(i).content = scan.next();
			}
		}
		return true;
	}
	
	/* 기능 : 스캐너를 통해 일시를 입력하여 건당 정보로 변환하여 반환하는 메소드  //equals 는 같은 클래스 객체여야지 비교할 수 있음 , 문자 바로 비교 X 
	 * 매개변수 : Scanner scan
	 * 리턴타입 : 일시로 만들어진 건 =>  Account 
	 * 메서드명 : inputSearchDate
	 * */
	
	public static Account inputDate(Scanner scan) {
		System.out.print("검색 일시 : ");
		return new Account(scan.next(),null,null,null,null);
	}
	
	
	/*기능 : 찾고 싶은 일시를 넣어주면 가계부에 동일한 날짜의 건들을 반환해주는 메서드
	 * 매개변수 : 가계부 List<Account> list , 찾고싶은 날짜를 넣은 객체 Account a
	 * 리턴타입 : boolean 
	 * 매서드명 ㅣ searchAccount */
	
	public static boolean searchDate(List<Account> list, Account a ) {
		int cnt = 0;									
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).date.equals(a.date)) {
				System.out.println(list.get(i));	
				cnt++;
			} 
		} 
		if(cnt!=0)
			return true;
		else 
			return false;
	}
	
	
	public static Account inputInAndOut(Scanner scan) {
		System.out.print("검색 (수입/지출) : ");
		return new Account(null,null,scan.next(),null,null);
	}
	
	public static boolean searchInAndOut(List<Account> list, Account a ) {
		int cnt = 0;									
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).inandout.equals(a.inandout)) {
				System.out.println(list.get(i));	
				cnt++;
			} 
		} 
		if(cnt!=0)
			return true;
		else 
			return false;
	}
	
	
	public static Account inputCategory(Scanner scan) {
		System.out.print("분류 검색 : ");
		return new Account(null,null,scan.next(),null,null);
	}
	
	public static boolean searchCategory(List<Account> list, Account a ) {
		int cnt = 0;									
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).category.equals(a.category)) {
				System.out.println(list.get(i));	
				cnt++;
			} 
		} 
		if(cnt!=0)
			return true;
		else 
			return false;
	}
	
	
	

}

class Account {
	
	String date; //일시
	String content; //내용
	String inandout; //수입&지출
	String money; // 금액
	String category; //분류
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((inandout == null) ? 0 : inandout.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (inandout == null) {
			if (other.inandout != null)
				return false;
		} else if (!inandout.equals(other.inandout))
			return false;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return  "\n" + date + "\n" + "수입/지출 : " + inandout  +  " 분류 : " + category + " 금액 : " + money + " 내용 : "+content 
				 ;
	}
	
	
	public Account() {}
	public Account(String date, String content, String inandout, String money, String category) {
		super();
		this.date = date;
		this.content = content;
		this.inandout = inandout;
		this.money = money;
		this.category = category;
	}
	
}