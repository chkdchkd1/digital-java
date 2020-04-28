package day8;

public class ModifierEx1 {

	public static void main(String[] args) {
		// 변수 앞에서 final 붙으면 값을 변경 할 수 없는 상수가 된다 
		final int MAX = 10;
		//MAX = 20;
		//public static final double PI
		System.out.println(Math.PI);
		D d = new D();
		Object o1 = new Object(); // ~ 44줄 Object 클래스의 객체도 가능하지만
		d.print1(o1);
		/* A a = new A();
		d.print(a); */
		d.print1(new A()); // 바로 매개변수로 들어가서 이름이 따로 없는 객체를 익명객체 
	
	
		

	}

}
final class A{ // final 클래스는 부모가 될 수 없다. 
	public int a;
}

class B {
	//final 메서드 오버라이딩을 할  수없 다 
	public final void print() {
		System.out.println("클래스 B입니다.");
	}
	
}

class C extends B{
	public final int num;
	public C() {
		num = 0;
	}
	public C(int num) {
		//final 멤버 변수는 선언과 동시에 초기화하지 않아도 초기화를 생성자에서 할 수 있다 .
		this.num = num;
	}
}

class D{
	//매개변수로 클래스 Object의 객체 obj가 오면 실제 넣어주는 정보는 Object 클래스의 객체도 가능하지만 Object 클래스를 상속 받은 자식 클래스도 가능하다 . = 모든 클래스들이 매개변수로 들어 올 수 있다.
	public void print1(Object obj)	{
		//obj 객체가 클래스 A로 형변환 가능한지 확인하는 연산자 instanceof 
		if (obj instanceof A) {
			System.out.println("A클래스로 형변환 가능합니다 ");
			}else {System.out.println("Object입니다.");
			}
	
	}
	//매개변수로 B 클래스의 객체 obj가 오기 때문에 실제 넣어주는 정보는 B클래스의 객체나 B클래스를 상속 받은 C 객체를 매개변수로 넣어줄 수 있다.
	public void print2(B obj) {
		System.out.println("B입니다.");
	}
}
