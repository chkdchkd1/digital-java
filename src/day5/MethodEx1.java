package day5;

public class MethodEx1 {

	public static void main(String[] args) {
		// void는 return 값이 없는 경우 쓴다
		// string 이라는 변수 의 이름은 args
		// 메서드 순서는 상관 없다. 
		// main 붙은걸 제일 먼저 실행하고 - sysout은 대기중 - gcd를 만나면 gcd 메서드로 점프 계산후 return 통해 답을 돌려주고 - sysout은 답을 찍고 - 종료  
		// sysout 역시 메서드. 
		int res = sum(1,2);
		
	    // int num = 3;
	    // char res2 = num; 에러 발생 ..? 문자열에 정수를 넣을려고 해서 
		// ch = num1 + num2; 이거 에러 발생 ; 
		// char res2 = sum(1,2) ; 에러 발생 이때 변수 결과 값을 넣었을 때 성립이 되면 넣어도 되고 안되면 넣으면 안됨 
		// char ch = 1 + 2  일때 인트로 형변화 하고 더하는게 아니라 그냥 바로 저장 되는거라서 괜찮다. ->산술연산자관련 페이지 보기 
		
		System.out.println(res);
		System.out.println(gcd(10,15));
		System.out.println(lcm(10,15));
		if(isPrime(343)) {
			System.out.println("343은 소수");
		}else {
			System.out.println("343은 소수가 아님");
		}
	}
	 /* 기능 : 두 정수의 합을 알려주는 메서드
	  * 매개변수 : 두 정수 => int num1, int num2 (변수 선언과 다름 두개를 이어서 쓸 수 없음, 변수를 앞에 다 ㅆㅓ주어야 )
	  * 리턴타입 : 합 => 정수 => int 
	  * 메서드명 : sum
	  */

	public static int sum(int num1, int num2) {
		/* return의 역할 :메서드를 종료하고, 값을 전달하는 역할 */
		return num1 + num2;
		
	}
	
	/* 두 정수의 최대 공약수를 알려주는 매서드 
	 * 매개변수 : 두 정수 => int num3, int num4 
	 * 리턴타입 : 최대공약수 = > 정수 = > int
	 * 메서드명 : gcd
	 */
	

	public static int gcd(int num1, int num2) {
		/* return의 역할 :메서드를 종료하고, 값을 전달하는 역할 */
		int res = 1 ; // 최대 공약수를 저장하는 변수 
		 for(int i= 1; i<=num1; i++) {
			 if(num1%i == 0 && num2%i == 0) {
				 res = i;
			 }
		 }
		 return res;
	}
	
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1,num2); // 두정수와 최대공약수를 통해 최소 공배수를 구하는 공식  
		// 위 메서드 gcd를 재활용한 사례 

	}
	
	/* 기능 : 정수가 소수인지 아닌지 판별하는 메서드
	 * 매개 변수 : 정수 
	 * 리턴타입 : 소수인지 아닌지 => 참, 거짓 =>boolean 
	 * 메소드 명 : isPrime
	 */
	
	public static boolean isPrime(int num1) {
		int cnt = 0; 
		for(int i = 1; i*i<=num1;i++) {
			// 움 이거 더 효율이 좋음, i부터 num 까지 다 안가도 나옴..  ex) 만약 8이 소수인지 아닌지 구한다면 1 2 4 8 , 2까지만 가도 여기서 세트로 4 8 또한  약수인걸 구할 수 있고 cnt가 2면 소수 X
			if(num1%i== 0) {
				cnt++;}
			
		}
		if (cnt == 1) {
		return true;
		}  
		return false; // 리턴을 만나면 아래코드는실행되지 않음
	}
}
