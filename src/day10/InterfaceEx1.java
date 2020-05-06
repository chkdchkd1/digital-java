package day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


interface RemoteController{ //멤버변수가 없다는 사실을 잊지 말긔 
	
	
	public int chUp(int ch);
	public int ChDown(int ch);
	public int VolUp(int vol);
	public int VolDown(int vol);
	/* 인터페이스에서 새로운 추상 메소드를 추가하면 해당 인터페이스를 구현한 모든 클래스에 에러가 발생한다.( 왜냐하면 오버라이딩을 하지 않아서.) 
	 * 이러한 번거로움을 해열하고자 디폴트 메서드를 이용한다.
	 * 디폴트 메서드는 구현된 내용이 없는 메소드로 추상 메소드와의 차이는 추상 메소드는 구현 클래서에서 꼭 오버라이딩을 해야하지만 디폴트는 안해도 된다.*/
	public default void test() {
		
	}
	
}

class TVRemoteController implements RemoteController{ //인터페이스는 자체적으로 사용할 수 없고 인터페이스를 구현한 클래스를 활용한다.(implements)

	@Override
	public int chUp(int ch) {
		return ++ch;
	}

	@Override
	public int ChDown(int ch) {
		return --ch;
	}

	@Override
	public int VolUp(int vol) {
		return ++vol;
	}

	@Override
	public int VolDown(int vol) {
		return --vol;
	}
	
}