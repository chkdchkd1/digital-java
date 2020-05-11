package day13;

public class ExceptionEx1 {

	public static void main(String[] args) {
		// catch는 예외가 발생할 때만 실행 (자연적으로 발생하는 예제)
 		try {
			// System.out.println(1/0); //ArithmeticException 예외 발생 
			int arr[] = new int[4];
			arr[4] = 10; //IndexOutOfBoundsException 예외 발생 , 예외가 발생하면 그 이후 코드는 실행 되지 않고 catch로 건너뛴다 (print hello가 실행x)
			System.out.println("Hello");
		} catch (ClassCastException e) { 
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (IndexOutOfBoundsException e ) {
			System.out.println("배열 관련 예외가 발생");
		} catch (Exception e) {
			//Exception e  예외 처리 순서대로 위 캣치에 걸리는게 없으면 , 모든 예외 처리가능, 예외 처리 할 때 마지막에 넣어주는게 좋다  
			System.out.println("예외 발생");
		} 
	}

}
