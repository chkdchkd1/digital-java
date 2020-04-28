package day8;

public class OverridingEx1 {

	public static void main(String[] args) {
		// 오버라이딩 예제
		Duck d = new Duck(); 
		//객체 생성하면서 생성자가 하나도 없으면 기본 생성자 ex)public Duck(){super(); -super 있으나 없으나 결과똑같-} 를 자동으로 생성하고 부모의 클래스껄 받아오고(??) => 객체 생성할 때 본인의 생성자 호출 함
		d.cry();
		
		Sparrow s = new Sparrow();
		s.cry();
		s.cry(2);
		Sparrow s2 = new Sparrow(1);
		System.out.println(s.getWing());
		System.out.println(s2.getWing());

		
	}

}


class Bird{
	protected int wing; //걍 접근 때문에 프로텍티드 한거 
	public void cry(){
		System.out.println("새가 웁니다.");
	}
	public Bird() {
		wing = 2;
	}
	public Bird(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	//  접근제한자가 public이 아니면 항상 겟터 셋터 만드는 버릇을 들일 것 
}
class Duck extends Bird{
	//메서드 오버라이딩
	@Override
	public void cry() {
		super.cry(); //부모클래스의 cry를 불러온다. 또한 cry(); 이렇게 쓸 쑤 도 있다.하지만 오버로딩이 있을때 내것이 아니라 부모의 걸 불러올때 super 
					// 메서드 오버라이딩을 하는데 작업하는 메서드명과 같은 부모 클래스의 메서드를 super 없이 호출하면 부모 클래스의 메서드가 아닌 내 클랫의 메서드로 호출되어서 재귀호출이 된다.
					// 오버로딩 이 잇을 때 cry ();를 하면 duck클래스의 cry()로 호출되어 재귀호출이 된다. 
		System.out.println("오리 : 꽥꽥");
	}
	//public Duck(){super(); = 부모 생성자로 가라 }
}
class Sparrow extends Bird{
	// 메소드 오버로딩
	public void cry(int num) {
		System.out.println("참새 : 짹짹");
	}

	public Sparrow() {
		super(); //부모 클래스의 기본 생성자 호출 
	}

	public Sparrow(int wing) {
		super(wing); //32번ㅉ ㅐ 줄 실행 
	}
	
}