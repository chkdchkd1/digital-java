package day18;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcd(8, 12));
		System.out.println(lcm(8, 12));

	}

	
	public static int gcd(int num1, int num2) {
		if(num1 < 0 || num2 < 0 ) 
			throw new ArithmeticException("예외발생 : 음수가 입력되었습니다.");
		for (int i = num1; i >=1 ; i--) {
			if ( num1%i == 0 && num2%i == 0 ) 
				return i ;
		}
		return 1 ;
		
	}
	
	public static int lcm (int num1,int num2) {
		return num1 * num2 / gcd(num1,num2);
	}
	
}
