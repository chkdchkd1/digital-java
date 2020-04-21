package day3;

import java.util.Scanner;

public class ForEx7 {

	public static void main(String[] args) {
		/* 두 정수 num1 과 num2의 최대 공약수를 구하는 코드를 작성하세요.
		* 최대 공약수 : 공약수 중에서 가장 큰수
		* 공약수 : 두수의 약수 중 공통으로 있는 수 
		* 8의 약수 : 1 2 4 8
		* 12의 약수 1 2 3 4 6 12 
		* 8과 12의 공약수 : 1 2 4
		* 8과 12의 최대 공약수 : 4
		* 1. 반복 횟수 : i는 부터 num1까지 1씩 증가 (num1만 구해도 충분 ㅇㅇ .. 최대 공약수 구하는거라서) 
		* 2. 규칙성 : i는 num1과 num2의 공약수이면 gcd에 i를 저장 
		* 			(ex) 즉 8,12경우 공약수는 1, 2 ,4 인데 차례로 1 저장 - 2저장 (1삭제) 4 저장 (2 삭제) 
		* 			자연스럽게 최대 공약수만 남음)
		* 			i가 num1의 약수이고 i가 num2의 약수이(<면>하나면 조건식 하나) (&&) gcd에 저장
		* 3. 반복문 종료후 : gcd 출력 
		*/
		
		int i = 0;
	    int num1 = 0, num2 = 0;
	    Scanner sca = new Scanner(System.in);
		System.out.print("정수 1 를 입력하세요 : ");
		num1 = sca.nextInt();	
		System.out.print("정수 2 를 입력하세요 : ");
		num2 = sca.nextInt();	
		sca.close();
		int gcd = 0;
		for(i=1;i<=num1;i++) {  
			if (num1 %i == 0 && num2 %i == 0 ) {
				gcd=i;
			}
		}
		
		//System.out.println(num1 + " , " + num2 +" 의 최대 공약수는 " + gcd + " 입니다." );
		System.out.printf("%d와 %d의 최대 공약수는  %d 입니다", num1, num2, gcd);
			
		
		
			
		
		

	}

}
