package day10;

public class AbstractEx1 {

	public static void main(String[] args) {
		// 추상메소드 : 부모클래스를 상속 받았을 때 특정 메소드가 자식 클래스에게 자주 오버라이딩 된다면 해당 메소드는 주로 추상 메소드로 작성한다.

	}
}


abstract class A{
	int a;
	public void Print() {
		System.out.println(a);
	}
	public abstract void test();
	
}
class B extends A{
	@Override
	public void test() {// 추상 메소드가 있는클래스를 상속 받으면 반드시 추상 메소드를 구현해야한다. (오버라이딩) 		
	}
}