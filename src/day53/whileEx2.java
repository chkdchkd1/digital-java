package day53;

import java.util.*;

public class whileEx2 {

	public static void main(String[] args) {
		// while문을 이용하여 문자를 계속 입력받고 (실행문) 입력받은 문자가 y 또는 Y이면 반복문을 종료(조건)하는 코드를 작성하세요 
		
		
		Scanner scan = new Scanner(System.in);
		char ch = 'N';
		while(ch != 'Y' && ch !='y') {
			System.out.print("문자를 입력하세요 : ");
			ch = scan.next().charAt(0);
		}
		System.out.println("종료");
		

	}

}
