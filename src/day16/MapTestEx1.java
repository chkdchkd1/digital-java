package day16;

import java.util.*;


public class MapTestEx1 {

	public static void main(String[] args) {
		/* id와 pw를 등록하고, id를 이용하여 pw를 검색하는 코드를 작성하세요  contain은 컬렉션 안의 메소드 라서 map은 쓸 수없다. 이꼴은 오브젝트
		 * 예) 
		 * 메뉴
		 * 1.등록
		 * 2.검색
		 * 3.수정
		 * 4.종료
		 * 메뉴를 선택하세요 :1
		 * id abcd
		 * pw 1234
		 * * 메뉴
		 * 1.등록
		 * 2.검색
		 * 3.수정
		 * 4.종료
		 * 메뉴를 선택하세요 : 2
		 * id abcd
		 * abcd의 pw는 1234 입니다. 
		 * * 메뉴
		 * 1.등록
		 * 2.검색
		 * 3.수정
		 * 4.종료
		 * 메뉴를 선택하세요 : 3 
		 * id :abcde 
		 * abcde는 없는 Id 입니다. 
		 * * * 메뉴
		 * 1.등록
		 * 2.검색
		 * 3.수정
		 * 4.종료
		 * 메뉴를 선택하세요 : 3 
		 * id :abcde 
		 * Pw(now) 1234.
		 * Pw(new) 12345
		 * 비밀번호를 수정했습니다.
		 * 비밀번호 수정에 실패했습니다. (현재 비밀번호랑 일치하지 않을때) 
		 * 종료합니다.
		 * */
		/* map 인터페이스를 이용하여 객체를 만들 수 없지만 (= new Map을 하면 에러가뜸) 
		map 인터페이스를  구현한 클래스 (HashMap)(HashMap은 오버라이딩을 통해서 map의 기능을 쓸 수 있음 )를 통해서 map 인터페이스의 객체 map(이름)에 저장할 수 있다. */
		Map<String, String> map = new HashMap<String, String>(); //앞에 HaspMap으로 고정해놓으면 뒤에 생성되는건 무조건 HashMap이어야 함. Map으로 설정하먄 다른 것들도 뒤에 올수 있다.
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		while (menu!=4) {
		printMenu();
		menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				inputInfo(scan,map);
				break;
				
			case 2 : 
				searchInfo(scan,map);

				break;
			case 3 :
				modifyInfo(scan,map);
				break;
				
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				break;
			
			default :
				System.out.println("잘못된 입력입니다.");
			}
		
		}
	}
	
	
	
	 /* 기능 : 스캐너를 이용해서 id를 입력받고 map 해당하는 id가 없으면 해당하는 아이디가 없다고 출력. 있으면 비밀번호를 입력받고 입력한 비밀번호와 map에 있는 비밀번호가 같을 때 수정, 다르면 
	  * 수정에 실패했습니다 라고 출력
	  * 매개변수 : Scanner scan , Map<string, String> map
	  * 리턴타입 : void 
	  * 메소드명 : modifyInfo  */
	
	 private static void modifyInfo(Scanner scan, Map<String, String> map) {
		
		 System.out.printf("ID : ");
			String id = scan.next();
			if(map.get(id) == null ) {
				System.out.println(id +"는 존재하지 않는 ID입니다.");
				return;
			} 
				System.out.print("PW(now) : ");
				String pw = scan.next();
				if (map.get(id).equals(pw)) { // pw == map.get(id) 로 쓸 면안됨 주소값과 비교하는거라 X  있음 
					System.out.print("PW(new) : ");
					String npw = scan.next();
					map.replace(id, npw);	
				} else {
					System.out.println("비밀번호 수정에 실패했습니다.");
				}
			} 
				
		

	/*기능 : 스캐너를 이용해서 id를 입력받아 map 해당하는 id와 일치하는지 확인하여 있으면 id와 비번을 출력, 없으면 없다고 출력하는 메소드
	  *매개변수 : Scanner scan, Map<String, String>
	  *리턴타입 : void (단순출력)
	  *매소드명 ㅣ searchInfo
	  */
	
	private static void searchInfo(Scanner scan, Map<String, String> map) {
		
		System.out.printf("ID : ");
		String id = scan.next();
		if(map.get(id) == null ) {
			System.out.println(id +"는 존재하지 않는 ID입니다.");
		} else {
			System.out.println(id + "의 pw는 " + map.get(id)+ "입니다.");
		}
		
	} // map.get(id)를 바로 줄 수 도 있지만 이걸 pw로 선언해서 (pw = map.get(id)) pw로 주어도 ㄱㅊ 
	
	
	
	/* 기능 ; 스캐너를 이용하여 id 와 pw를 입력 받아 map 저장하는 메소드
	 * 매개변수 : 스캐너 , -> 스캐너 한테 입력받은걸 매개변수 삼아라 , 내가 지정해준게 아니라 , 맵 => Scanner scan, Map<String, String> 
	 * 리턴타입 : void , 매개변수 map 이 참조변수이므로 원본값이 바뀌기에 돌려줄게없음
	 * 메소드 명 inputInfo
	 */
	
	private static void inputInfo(Scanner scan, Map<String, String> map) {
	
		System.out.print("ID : ");
		String id = scan.next();
		System.out.print("PW :");
		String pw = scan.next();
		map.put(id, pw);
		
	}

	public static void printMenu() {
		System.out.println("==== 메뉴 ====");
		System.out.println(" 1. 등록");
		System.out.println(" 2. 검색");
		System.out.println(" 3. 수정");
		System.out.println(" 4. 종료");
		System.out.println("============");
		System.out.printf("메뉴를 선택하세요 : ");
	}

}
