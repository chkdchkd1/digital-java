package day53;

import java.util.Scanner;

public class forEx2 {

	public static void main(String[] args) {
		
		/*4. 반복문 : 규칙성, 반복횟수
		 * - for문
		 * for(1.초기화;2.조건식;4.증감연산식){
		 * 			3.실행문;
		 * }
		 * 1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화, 생략가능
		 * 2. 조건식 : 반복문이 실행되기위한 조건으로, 참이면 반복문 실행, 거짓이면 반복문 종료, 생략가능
		 * 4. 증감연산식 : 조건식에서 사용하는 변수를 증가 또는 감소 => 반복횟수를 조정하기 위해, 생략가능*/
		
		//for문 이용하여 문자를 입력받고 입력받은 문자가 y 또는 Y이면 반복문을 종료하는 코드를 작성하세요 
		
				Scanner scan = new Scanner(System.in);
				
				char ch = 'N';
				//입력받은 값 ch가 y가 아니고  Y가 아니면 반복  = 조건식 : 참이면 반복분 실행, 거짓이면 반복문 종료
				for(;ch != 'y' && ch != 'Y';) {
					System.out.print("문자를 입력하세요 : ");
					ch = scan.next().charAt(0);
				}
				
				
//				for(;;) {
//					System.out.print("문자를 입력하세요 :");
//					char word = scan.next().charAt(0);
//						if(word == 'y' || word == 'Y') {
//							System.out.println("종료");
//							 break;
//						}
//					}

				

	}

}
