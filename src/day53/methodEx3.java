package day53;

public class methodEx3 {

	public static void main(String[] args) {
		// 메서드 오버로딩

	}
	
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	
//	public static int sum(double num1, double num2) {
//		return num1 + num2;
//	}
	// ! 에러발생 
	// 메서드 오버로딩에선 리턴타입이 영향 X 매개변수의 자료형과 갯수가 중요
	
	

	public static double sum(double num1, double num2,double num3) {
		return sum(num1,num2)+num3;
	}
}
