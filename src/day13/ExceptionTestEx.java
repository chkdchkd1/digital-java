package day13;

import java.util.Scanner;

public class ExceptionTestEx {

	public static void main(String[] args) {
		/* 반복문을 통해 문자를 입력받고 입력받은 문자가 1이면 입이니다라는 예외를 발생시키는 코드를 작성하세요
		 * 
		 * 예) 문자를 입력하세요 : a 
		 * 	   문자를 입력하세요 : b
		 *    문자를 입력하세요 : 1 
		 *    예외가 발생했습니다 :. 1 */
		char ch;
		Scanner scan = new Scanner(System.in);
		try {
			for(;;) {
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
			if (ch == '1') throw new Exception("예외가 발생했습니다 : " +ch); //문자 1로 받기 때문에 '1'임  
			}
		 }catch (Exception e ) {
			 System.out.println(e.getMessage());
		 }finally {
			 //예외 발생과 상관없이 무조건 실현되어야하는 코드 
		 }
		
		scan.close();
		
	}

}
