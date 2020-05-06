package day10;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		Tv t1 = new CaptionTv();
		/* 자식 객체를 생성하여 부모가 참조하는 경우에는 자식 클래스의 멤버 변수 power, ch, text가 만들어진후 
		 * 부모가 power와 ch만 이용하기 때문에 가능.
		 */
		//CaptionTv ct1 = new Tv();
		/* 부모 객체를 생성하여 자식이 참조하는 경우에는 부모의 클래스 멤버 변수 power, ch만 만듣어진 상태에서 자식이 text를 
		 * 사용하려면 문제가 되기때문에 이 경우는 불 가ㅡ능 */
		 
		 
		 t = ct; //자손타입 -> 조상타입
		// t = new Tv();  // 이 코드가 없는 경우는 아래가 가능하지만 이 코드를 활성화 하면 아래코드는 에러 .
		 /*조상타입 -> 자손타입은 항상 가능한 것이 아니라 조건부로 가능하다 . 상황에 따라서 classCastException이 발생한다. 
		  * 되는 경우는 부모 객체 t가 부모 클래스를 통해 생성된 객체가 아니라 자식 클래스를 통해 생성된 객체와 연결이 된 경우는 가능*/
		ct = (CaptionTv)t; //조상타입 -> 자손타입 (항상 가능 x)
		
		SmartTv st = new SmartTv();
		ct = new CaptionTv();
		Tv.display(st);
		
		Tv.display(ct);
		 

	}

}

class Tv{
	boolean power = false;
	int ch;
	void power() {
		power = !power;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
	public static void display(Tv t) { // 매개변수를 부모의 객체로 한 경우 : 매개변수의 다형성 활용 : 중복작업, 오버라이딩써서 안해도 된다 
		if( t instanceof CaptionTv) {
			System.out.println("캡션TV");
		}
		else if ( t instanceof SmartTv) {
		System.out.println("스마트TV");
		}
	}
}

class CaptionTv extends Tv{
	String text;
	void cation() {
		System.out.println("캡션 : " + text);
	}
}

class SmartTv extends Tv{
	String ip;
}
