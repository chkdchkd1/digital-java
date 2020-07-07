package day54;

import java.util.*;

public class exceptionEx2 {

	public static void main(String[] args) {
		//  두  실수와 산술연산자가 주어지면 산술 연산결과를 출력하는 코드를 작성하기 위한 메서드를 만드세요  + 예외처리까지 하세요 
		// calc는 RuntimeException 이 아니고 그냥 exception 이기 때문에 try catch를 해줘야한다.
		Scanner scan = new Scanner(System.in);
		double num1, num2; 
		char ch ;
		try {
			System.out.println("두 정수와 연산자를 입력하세요 : ");
			num1 = scan.nextDouble();
			ch = scan.next().charAt(0);
			num2 = scan.nextDouble();
			System.out.printf("%.1f %s %.1f = %.1f\n", num1, ch, num2, calc(num1,ch,num2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	
	public static double calc(double num1, char ch, double num2) throws Exception {
		

		switch(ch) {
		case '+' :
			return num1 + num2;
		case '-' :
			return num1 - num2;
		case '*' : 
			return num1 * num2;
		case '/' : 
			if(num2 == 0) throw new ArithmeticException("0으로 나눌 수 없음");
			return num1 / num2;
		case '%' :
			if(num2 == 0) throw new ArithmeticException("0으로 나눌 수 없음");
			return num1 % num2;
		default :
			throw new Exception( ch+"는 올바른 연산자가 아닙니다.");
		}
		
	
		
		
	}
}
