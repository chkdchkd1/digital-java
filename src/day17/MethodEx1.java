package day17;

import java.util.*;

public class MethodEx1 {

	/*main 메소드부터 실행 줄수를 표현하세요 (단 , 1 / 2 를 입력했다고 가정)
	 * 10 -18 > 69 > 69-78 > 73 > 46-48 > 73 > 16 > 17 > 18 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요 예) 1 + 2 ");
		int num1, num2;
		char op ;
		try {	num1 = scan.nextInt();
				op = scan.next().charAt(0);
				num2 = scan.nextInt();
				System.out.printf("%d %c %d = %.1f", num1, op, num2, cal(num1,op,num2));   
				// 예외가 발 생 할 수 있는 구간에 try 처리 해준다 
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
	
	/* 기능 : 두 정수의 합을 반환하는 메서드 
	 * 매개변수 : 두정수
	 * 리턴타입  : int  
	 * 메서드명 : sum*/ 
	
	public static int sum(int num1, int num2) {
		int res = num1 + num2;
			return res;
	}
	
	/* 기능 : 두 정수의 차을 반환하는 메서드 */ 
	
	public static int sub (int num1, int num2) {
		int res = num1 - num2;
			return res;
	}
	
	/* 기능 : 두 정수의 곱을 반환하는 메서드 */ 
	
	public static int mul (int num1, int num2) {
		int res = num1 * num2;
			return res;
	}
			
	/* 기능 : 정수 a를 정수 b로 나눈 결과를  반환하는 메서드 */ 
	
	public static double div (int num1, int num2) {
		 double res = (double)num1 / num2;
			return res;
	}
	
	/* 기능 : 정수 a를 정수 b로 나눈 나머지를 반환하는 메서드 */ 
	
	public static int mod (int num1, int num2) {
		int res = num1 % num2;
			return res;
	} // 코드 한줄이라더 더 줄이는게 이득이어서 굳이 int res 쓸필요 없고 바로 return = num1%num2 로줘도 댐 
	
	/* 기능 : 정수 a를 정수 b로 산술 연산자 op의 결과를  반환하는 메서드 
	 * 매개변수 : 두 정수, 산술연산자  int num1, int num2 , char op
	 * 리턴타입 : double
	 * 메서드명 : cal*/ 
	
		public static double cal (int num1, char op, int num2) {
			
			switch(op) {
			case '+':
				return sum(num1,num2);
			case '-':
				return sub(num1,num2);
			case '*':
				return mul(num1,num2);
			case '/':
				if(num2 == 0) throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다"); 
				return div(num1,num2);
			case '%':
				if(num2 == 0) throw new ArithmeticException("예외 발생 : 0으로 나눌 수 없습니다"); 
				return 	mod(num1,num2); 
			default :
				throw new ArithmeticException("예외 발생 : " + op+ "는 산술연산자가 아닙니다."); 
		}
			// return 0.0; 이게 계산결과 값인지 입력 산술자 이외의 산술자였는지 알수 없기 때문에 예외처리를 해줘야 한다  이게 없으면 에러나는이유, 위에 스위치문에 해당안되면 돌려줄 값이 없어서 
		}
}



/* 
 * 두 정수와 연산자를 입력하세요 예) 1 + 2 
	1 / 0
	Exception in thread "main" java.lang.ArithmeticException: 예외 발생 : 0으로 나눌 수 없습니다
	at day17.MethodEx1.cal(MethodEx1.java:73)
	at day17.MethodEx1.main(MethodEx1.java:16)
	try catch를 처리 안하면 에러를 만나면 위와 같이 출력되면서 프로그램이 죽는다 ㅇㅇㅇㅇㅇ.
	
	두 정수와 연산자를 입력하세요 예) 1 + 2 
	1 / 0
	예외 발생 : 0으로 나눌 수 없습니다
 	위와 같은 상황이 더 안정적, try catch처리를 해주어야~~ */
