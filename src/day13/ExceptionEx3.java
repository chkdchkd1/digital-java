package day13;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// calc 메소드는 예외처리를 하지 않고 예외를 발생만 시킨다. 예외체리는 main 메소드에서 할 것이다. 
		// try 밖에서 예외가 발생하면 강제로 프로그래밍 이 종료된다. 또한 try 안에서 발생하면 예외가 발생하지만 프로그램 정상 실행 
		// 발생한 예외가 RuntimeException이면 메소드 옆에 발생 가능한 예외를 생략해도 되지만 
		// RuntimeException이 아닌 경우에는 메소드 옆에 발생가능한 예외를 써주어야한다. 
		
		 try {
			 System.out.println(calc(1,  '/' , 0));
		 }catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
		 }catch (Exception e ) {
			 System.out.println(e.getMessage());
		 }
	}
	
	public static double calc(int num1, char op, int num2) throws Exception {
		double  res = 0.0;
		switch(op) {
		case '+': 
			System.out.println(num1+num2);
			break;
		case '-': 
			System.out.println(num1-num2);
			break;
		case '*': 
			System.out.println(num1*num2);
			break;
		case '/': 
			if (num2 == 0 ) throw new ArithmeticException("0으로 나눌 수 없습니다");
			System.out.println((double)num1/num2);
			break;
		case '%': 
			if (num2 == 0 ) throw new ArithmeticException("0으로 나눌 수 없습니다");
			System.out.println(num1%num2);
			break;
		default :
			throw new Exception(op+ "는 산술연산자가 아닙니다.");
		
	}
		return res;

}
	
}
