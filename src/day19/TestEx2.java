package day19;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수를 거꾸로 만들어 원래 정수와 거꾸로한 정수의 합을 출력하는 코드를 작성하세요.
		 * 예 ) 
		 * 정수를 입력하세요 : 12345
		 * 거꾸로한 정수 : 54321 
		 * 결과 : 66666
		 * 
		 */
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		int tmp = num; //백업
		String res = ""; // 12340을 입력했을때 04321 으로 보기위해선 문자열로 저장해야함 int가 아니라 int는 정수라 앞자리 0을 출력할 수 없음 
		while(tmp !=0) {
			res += tmp % 10; //+= : 기존값의 우측항을 더함 
			tmp = tmp / 10; // 12345 -> 1234 까지 
			//list도 이런식으로 하면 된다 
		}
		
		
		if(num!=0)
			System.out.println("거꾸로한 정수 : " + res);
		else 
			System.out.println("거꾸로한 정수 : " + num);
			res = "0";
		
		System.out.println("거꾸로한 정수 : " +res);
		int ires = Integer.parseInt(res);
		
		System.out.println("결과 : " + (ires + num));
		
		

	}

}
