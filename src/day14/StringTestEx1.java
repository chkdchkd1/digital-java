package day13;

import java.util.Scanner;

public class StringTestEx1 {

	public static void main(String[] args) {
		/* 제목을 입력하고 단어를 입력 후 해당 단어가 제목에 있는지 확인하는 코드를 작성하세요 
		 * 예1) 
		 * 제목을 입력하세요 : Java의 정석
		 * 단어를 입력하세요 : java
		 * java의 정석에는 java라는 단어가 없습니다.
		 * 
		 * 예2)
		 * 제목을 입력하세요 : Java의 정석
		 * 단어를 입력하세요 : Java
		 * java의 정석에는 java라는 단어가 있습니다.
		 *
	
		 */
		
	
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("문제1) ");
			System.out.print("제목을 입력하세요 : ");	
			String s = scan.nextLine();		//공백을 포함하려면~ 
			if(s.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("단어를 입력하세요 : ");
			String s1 = scan.next();
			boolean b = s.contains(s1);  // 이렇게 선언안하고 바로 if 조건문에 (s.contains(s1))로 지정해줘도 ㄱㅊ 
		
			if(b) {
				System.out.printf("%s 에는 %s 라는 단어가 있습니다\n", s, s1);
			}else {
				System.out.printf("%s 에는 %s 라는 단어가 없습니다\n", s, s1);
			} 
		
			if(s.indexOf(s1) == -1) {
				System.out.printf("%s 에는 %s 라는 단어가 없습니다\n", s, s1);
			}else{
				System.out.printf("%s 에는 %s 라는 단어가 있습니다\n", s, s1);
			}
			scan.nextLine();
			}
		
		
		
		

		
	}

}
