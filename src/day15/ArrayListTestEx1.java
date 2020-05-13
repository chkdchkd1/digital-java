package day15;


import java.util.*;

public class ArrayListTestEx1 {

	public static void main(String[] args) {
		/* 오늘의 할일을 리스트에 저장하고 출력하는 코드를 ArrayList를 이용하여 작성하세요 
		 * 예) 
		 * 오늘의 할일을 추가하시겠습니까? (y/n) :y
		 * 오늘의 할일을 입력하세요 : 수업
		 * 오늘의 할일을 추가하시겠습니까? (y/n) : ㅜ
		 * 오눌의 할일을 입력하세요 : 점심
		 * 오늘의 할일을 추가하시겠습니까 ? :n
		 * 오늘의 할일
		 * 1. 수업
		 * 2. 점심
		 * 3. 프로그램을 종료합니다 */
	
		ArrayList<String> list  = new ArrayList<String>(); 
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.print("오늘의 할일을 추가하시겠습니까? (y/n) : ");
			char menu = scan.next().charAt(0);
			scan.nextLine();
			if(menu == 'y') {
				System.out.print("오늘의 할일을 입력하세요 : ");
				String title = scan.nextLine();
				list.add(title);
			} else if (menu == 'n'){
				for (int i = 0; i<list.size(); i++) {
				System.out.println(i+1+"."+ list.get(i));
				}
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}


}
		



