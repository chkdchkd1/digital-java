package day18;

import java.util.*;

public class Test5 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세요.
		예) 정수를 입력하세요 : 12345
			결과 : 54321  
			12345%10 => 나머지가 5 => 출력
			1234로 줄인다(10으로 나눈 몫) => 그리고 줄인걸로 다시 나머지를 구한다 =>1234%10 => 나머지 4출력
			123로 줄인다. 123%10 => 나머지 3
			12로 줄인다. 12%10 => 나머지2 출력
			1%10 => 1
			- 정수를 하나 입력받아서 그거 하나 내에서 거꾸로 출력하는 것 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		System.out.print("결과 : ");
		while(num>0) {
			System.out.print(num % 10);
			num = num/10;

		}
			
		
		
		
	}

}
