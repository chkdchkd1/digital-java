package day18;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		coPrime(7,7);
		System.out.println();
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		try {
				if(isPrime(num)) 
					System.out.print(num+"은 소수입니다.");
				else 
					System.out.print(num+"은 합성수입니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(Homework.gcd(1, 1));
	}
	
	// 정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 코드를 작성하세요 단 메소드를 생성하여 작업할 것 
	
	/*기능 :정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 메서드 
	 * 매개변수 : 정수 int num
	 * 리턴타입 : boolean
	 * 메소드명  : isPrimeNumber
	 */
		public static boolean isPrime (int num) {
			if (num < 1 )
				throw new ArithmeticException ("예외발생 : 음수와 0은 소수 판별은 할 수 없습니다.");
			if (num == 1 )
				throw new ArithmeticException("예외발생 : 1은 소수도 합성수도 아닙니다.");
			int cnt = 0;
			for (int i = 1; i<=num; i++) {
				//i가 num의 약수이면, num가 i의 배수이면~ 
				if (num%i == 0) cnt++;
			}
			if (cnt == 2) 
				return true;
			
			return false;
					
		}
		
		/*for (int i = 2 ; i < num; i++)
		if(num%i == 0)
		return flase; 소수는 1과 자기자신 말고는 약수가 있으면 안된다. 그리서 false 
		for ( int i = 2; i*i <=num; i++)
		if (num % i == 0) 
		return flase;
		- 루트씌운값을 기준으로 좌우가 대칭이기에 그 가운데 값까지 구해서 있으면 소수가 아니다  */
	
	
	// 두 정수가 주어졌을 때 두 정수의 최대공약수가 1이면 서로소 라고 출력하고 서로소가 아니면 서로소가 아님이라고 출력하는 코드를 작성하세요. 단 메소드를 생성하여 작업 
	
	/*기능 : 두 정수가 주어졌을 때 두 정수의 최대공약수가 1이면 서로소 라고 추력 서로소가 아니면 서로소가 아님이라구 출력하는 코드 
	 * 매개변수 : 두 정수  int num1, int num2
	 * 리턴타입 : void
	 * 메소드명  : coPrime
	 */

	public static void coPrime(int num1, int num2) {
		if (num1 == num2)
			System.out.print(num1 + " , "+ num2 + " 는 서로소가 아닙니다");
		else if (gcd(num1, num2) == 1) 
			System.out.print(num1 + " , "+ num2 + " 는 서로소 입니다.");
		else 
			System.out.print(num1 + " , "+ num2 + " 는 서로소가 아닙니다. ");
	}
	
	/*
	public static boolean isCoprime (int num1, int num2 ) {
		if(Homework.gcd(num1, num2) ==1 )
			return true;
		return false;
		//return Homework.gcd(num1, num2) ==1? true:false;
	} 이렇게도 쓸 수 있다.*/
	
	
	public static int gcd(int num1, int num2) {
		for (int i = num1; i>=1 ; i--) {
			if ( num1%i == 0 && num2%i == 0 ) 
				return i;
		}
		return 1;
	}
	
}

