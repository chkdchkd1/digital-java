package day53;

import java.util.*;

public class methodEx1 {

	public static void main(String[] args) {
		// 두  실수와 산술연산자가 주어지면 산술 연산결과를 출력하는 코드를 작성하기 위한 메서드를 만드세요 
		/*
		 * - 매개변수  : 두실수와 산술 연산자 , = double, char
		 * - 리턴타입  : X -> 단순 출력  / 실수 = double 
		 * - 메소드명  : calc  */
		 
		
		Scanner scan = new Scanner(System.in);
		double num1, num2; 
		char ch ;
		System.out.println("두 정수와 연산자를 입력하세요 : ");
		num1 = scan.nextDouble();
		ch = scan.next().charAt(0);
		num2 = scan.nextDouble();
		System.out.printf("%.1f %s %.1f = %.1f\n", num1, ch, num2, calcc(num1,ch,num2));

	}

//	public static void calc(double x, char ch, double y) {
//		switch(ch) {
//		case '+' :
//			System.out.printf("%f %s %f = %f\n",x,ch,y,x+y);
//			break;
//		case '-' :
//			System.out.printf("%f %s %f = %f\n",x,ch,y,(x-y));
//			break;
//		case '*' : 
//			System.out.printf("%f %s %f = %f\n",x,ch,y,(x*y));
//			break;
//		case '/' : 
//			System.out.printf("%f %s %f = %.2f\n",x,ch,y,(x/y));
//			break;
//		case '%' :
//			System.out.printf("%f %s %f = %f\n",x,ch,y,(x%y));
//			break;
//		}
//	}

	public static double calcc(double num1, char ch, double num2) {
		switch(ch) {
		case '+' :
			return num1 + num2;
		case '-' :
			return num1 - num2;
		case '*' : 
			return num1 * num2;
		case '/' : 
			return num1 / num2;
		case '%' :
			return num1 % num2;
		default :
			return 0;
		}
		
	}
}
