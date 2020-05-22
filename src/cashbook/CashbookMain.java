package cashbook;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashbookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Cashbook> list = new ArrayList<Cashbook>();
		Cashbook cashBook;
		char menu = '0';
		do {
			printMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1' :
				//추가
				System.out.println("추가할 가계부내역을 입력하세요");
				cashBook = inputCashBook(scan);
				if(registerCashBook(list, cashBook))
					System.out.println("가계부에 저장하였습니다.");
				else
					System.out.println("가계부 저장에 실패하였습니다.");
				break;
			case '2' :
				//수정
				int cnt = 1 ;
				for(Cashbook tmp : list) {
					System.out.println(cnt+++"."+tmp);
				}
				System.out.print("수정하고싶은 가계부내역의 번호를 입력하세요 : ");
				int index = scan.nextInt();
				System.out.println("수정할 가계부 내역을 입력하세요");
				cashBook = inputCashBook(scan);
				if(modifyCashBook(list, index, cashBook))
					System.out.println("수정을 완료하였습니다");
				else 
					System.out.println("수정에 실패하였습니다.");
				break;
			case '3' :
				//확인
				printSubMenu();
				int kind = scan.nextInt();
				System.out.print("검색어를 입력하세요 : ");
				String search = scan.next();
				System.out.println(searchCashBook(list, kind, search));
				break;
			case '4' :
				//종료
				System.out.println("! 프로그램을 종료합니다.");
				break;
			default  :
				System.out.println("잘못된 입력입니다.");
			}
			
		}while(menu!='4');
		
	
//	registerCashBook(list, new Cashbook(1, "2020-05-22", "식비", "점심", 5000));
//	registerCashBook(list, new Cashbook(1, "2020-05-21", "식비", "점심", 5000));
//	registerCashBook(list, new Cashbook(1, "2020-05-22", "교통비", "버스", 1400));
//	registerCashBook(list, new Cashbook(0, "2020-05-22", "월급", "청주학원", 1400));
//	int cnt = 1 ;
//	for(Cashbook tmp : list) {
//		System.out.println(cnt+++"."+tmp);
//	}
//	
//	modifyCashBook(list, 4, new Cashbook(0, "2020-05-20", "월급", "청주학원", 1400));
//	
//	cnt = 1 ;
//	for(Cashbook tmp : list) {
//		System.out.println(cnt+++"."+tmp);
//	}
	

		
		
		
	}
	
	private static void printMenu() {
		
		System.out.println(" ==== 메 뉴 ==== ");
		System.out.println("   1.가계부 추가");
		System.out.println("   2.가계부 수정");
		System.out.println("   3.가계부 확인");
		System.out.println("   4.종료");
		System.out.println(" ============= ");
		System.out.print("메뉴를 선택하세요 : ");
		
		
	}
	
	private static void printSubMenu() {
		// 3.확인의 서브 메뉴 
		System.out.println(" == 확 인 기 준 == ");
		System.out.println("   1.일시");
		System.out.println("   2.수입/지출");
		System.out.println("   3.분류");
		System.out.println(" ============= ");
		System.out.print("기준을 선택하세요 : ");
		
	}
	

	/*기능 : 주어진 가계부 내역(Cashbook)을 가계부(list) 에 저장하는 메서드  
	 * 매개변수: List<Cashbook> list, Cashbook cashBook
	 * 리턴타입 : void (boolean으로 해서 등록여부를 따져도 된다 ) 
	 * 메서드명 : registerCashBook
	 * ---> 이건 중복을 허용하는 코드 ㅇㅇ 버스를 하루에 두번 탈 수도 있으니깤 */
	
	public static boolean registerCashBook (List<Cashbook> list, Cashbook cashBook) {
		if(list == null || cashBook == null )
			return false;
		list.add(cashBook);
		list.sort(new Comparator<Cashbook>() {
			@Override
			public int compare(Cashbook o1, Cashbook o2) {
//				int year1 = Integer.parseInt(o1.getDate().substring(0,4)); // 년도를 뽑아내서 문자열로 입력받은걸 정수로 바꿔주는 코드 
//				int year2 = Integer.parseInt(o2.getDate().substring(0,4));
//				int month1 = Integer.parseInt(o1.getDate().substring(5,7));
//				int month2 = Integer.parseInt(o2.getDate().substring(5,7));
//				int day1 =  Integer.parseInt(o1.getDate().substring(8,10));
//				int day2 =  Integer.parseInt(o2.getDate().substring(8,10));

				String arr1[] = o1.getDate().split("-"); // '-'를 기준으로 이외의 글자를 추출해서 배열로 만들어주는 코드 , 여기서 3개짜리 배열이 만들어진다 
				String arr2[] = o2.getDate().split("-");
				for ( int i = 0; i<arr1.length; i++) {
					//arr의 0번지는 : 년도 
					//arr의 1번지는 : 월
					//arrd의 2번지는 : 일 
					if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i]))
						return 1; 
					else if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i]))
						return -1;
				}// 이건 옛날거부터 출력되는거 
				return 0;
			}
		});
		return true;
	}
	
	/*기능 : 스캐너를 통해 가계부 내역을 입력받아 가격부 내역을 반환하는 메서드 
	 *매개변수 : Scanner scan
	 *리턴타입 : 가계부 내역 = CashBook CashBook
	 *메서드명 : inputCashBook */
	
	public static Cashbook inputCashBook(Scanner scan) {
	System.out.print("수입 (0), 지출(1) : ");
	int income = scan.nextInt();
	Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
	Matcher m;
	String date;
	//날짜패턴이 다른경우 맞을때까지 입력받음 
	do {
		System.out.print("날짜(예 : 2020-05-22) :");
		date = scan.next();
		m = p.matcher(date);
		} while (!m.matches());
	
	System.out.print("분류 : ");
	String type = scan.next();
	System.out.print("내용 :");
	String content="";
	while((content = scan.nextLine()).trim().length() == 0);
	System.out.print("금액 (원) : ");
	int money = scan.nextInt();
	
	Cashbook cashbook = new Cashbook(income,date,type,content,money);
		return cashbook;
	} 

	/*기능 : 가계부에서 확인하려는 종류에 맞는 검색 결과를 리스트로 반환하는 메소드
	 * 매개변수 : 가계부, 종류, 검색어 => List<Cashbook> list, int kind, String search
	 * 			kind = 1 : 일시기준  분류
	 * 			kind = 2 : 수입/지출 기준 분류
	 * 			kind = 3 : type 기준 분류    
	 * 리턴타입 : 검색결과 = 검색된 가계부 List<Cashbook> list 
	 * 메서드명 : searchCashBook
	 */
	
	public static List<Cashbook> searchCashBook (List<Cashbook> list, int kind, String search){
		List<Cashbook> searchList = new ArrayList<Cashbook>();
		switch(kind) {
		case 1 :
			Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
			Matcher m = p.matcher(search);
			if(!m.matches()) {
				System.out.println("날짜형태의 검색어가 아닙니다.");
				return null;
			}
			for(Cashbook tmp : list) {
				if(tmp.getDate().equals(search))
					searchList.add(tmp);
			}
			return searchList;
		case 2 :
			if(!search.equals("수입") && !search.equals("지출")) {
				System.out.println("검색어는 수입 또는 지출이어야 합니다. ");
				return null;
			}
			boolean isIncome = search.equals("수입");
			for(Cashbook tmp : list) {
				if(tmp.isIncome() == isIncome) 
					searchList.add(tmp);		
			}
			return searchList;
		case 3 :
			for(Cashbook tmp : list) {
				if(tmp.getType().equals(search)) 
					searchList.add(tmp);		
			}
			return searchList;
		}
		return null;
	}
	
	
	
	/*기능 : 가계부에서 수정할 위치를 알려주면 수정항목으로 수정하는 메서드 
	 *매개변수 : 가계부 List<Cashbook> list, 수정할 위치 int index, 수정항목 Cashbook cashBook; 
	 *리턴타입 : 수정여부 boolean
	 *메서드명: modifyCashBook*/
	
	public static boolean modifyCashBook (List<Cashbook> list, int index, Cashbook cashBook) {
		if(list == null || cashBook == null || list.size() < index)
			return false;
		// list.set(index-1, cashBook); // -> 정렬이 안된다.
		list.remove(index-1);
		registerCashBook(list, cashBook); // 그래서 지우고 새로넣으면서 정렬되게끔.
		return true;
		
	}
	
	
	
}
