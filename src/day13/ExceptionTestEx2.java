package day13;

import java.util.Scanner;

public class ExceptionTestEx2 {

	public static void main(String[] args) {
		/* 정수 값을 반복적으로 받는 코드에서 실수로 정수 대신 문자를 입력 했을 때 예외를 처리하도록 코드를 작성하세요. > 예외가 아닌 상황에 대한 걸 먼저 작성 
		 * 예) 
		 * 정수를 입력하세요 : 1 
		 * 정수를 입력하세요 : 2 
		 * 정수를 입력하세요 : 100
		 * 정수를 입력하세요 : a
		 * 예외가 발생했습니다 : 문자를 입력했습니다 : a  
		 */
		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
			System.out.print("정수를 입력하세요 : ");
			num = scan.nextInt();
			}

		} catch (Exception e ) {
			 System.out.println("예외가 발생했습니다. : 정수를 입력해야하는데 문자를 입력했습니다." );	
			 e.printStackTrace();
		}
		System.out.println("프로그램 종료했습니다.");
		scan.close();
	}

	}


