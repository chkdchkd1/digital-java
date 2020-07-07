package day54;

public class exceptionEx {

	public static void main(String[] args) {
		// RuntimeException의 일종인 arithmeticException이기에 코드상으로는 문제 X 
		
		int num1 = 1;
		int num2 = 0;
		try {
			//예외가 발생 할 수 있는 상황 
			throwException();
			
			System.out.println(num1/num2);
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
	
		
		}catch(Exception e) {
			 // 예외 클래스가 catch() <- 뒤에 와야함
			//  예외처리 할 때 exception이 마지막에 와야함 
			// 예외가 발생 햇을ㄸ ㅐ 
			// 처리하며 일단 프로그램이 죽지 X 
			e.printStackTrace();
			
		}
		System.out.println("프로그램 종료");

	}

		public static void throwException() throws RuntimeException {
			throw new RuntimeException("예외");
		}
}

	