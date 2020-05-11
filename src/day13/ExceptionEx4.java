package day13;

public class ExceptionEx4 {

	public static void main(String[] args) {
		//

		try {
			// 예외가 발 생할 수도 있는 
			throw new MyException(100, "예외 상황입니다.");  
			// throw : 예외를 강제로 발생시키는 것 + 객체가 와야함 => 같은 말 my Exception e = new MyException (100, "예외 상황입니다."); 	throw e ; (객체를 던짐 )
		
		} catch(MyException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception 입니다.");
		}
	}

}

/* 이름에 예외가 들어간 MyException이라는 클래스를 만드는 것이 아니라 예외 처리에서 사용할 수 있수 MyException 클래스를 생성*/
class MyException extends Exception{
	private final int ERR_CODE; //상수는 무조건 초기화를 해주어야한다. 
	
	
	public MyException(int err_code, String msg) {
		super(msg);
		ERR_CODE = err_code;
	}
	public MyException() {
		ERR_CODE =-1;
	}
	public MyException(int err_code) {
		ERR_CODE = err_code;
	}
	public MyException(String msg) {
		super(msg);
		ERR_CODE = -1;
	}
	public int getERR_CODE() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "ERR_CODE : " + ERR_CODE + ", MSG : "+super.getMessage();
		
	}
	
	// 이거 다시 복습 super();에 대한 개념도 헷갈리기시작스.. 
}