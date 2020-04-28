package day8;

public class InheritanceEx {

	public static void main(String[] args) {
		// 상속 예제 

		Child c1 = new Child(); // 기본생성자 호출
		c1.print(); // 자식 클래스로 객체 생성 했는데 부모 클래스의 메서드 print를 호출 할 수 있음 
		c1.print2();
		c1.setD(12);
		c1.print2();
		
	}

}

class Child extends Parent{
	private int e;
	// Point p1; // child 클래스의 멤버변수로 Point 클래스의 객체 p1이 오는 것 
	Point p1 = new Point();
	public void print2(){
		//print();
		System.out.printf("%d,%d\n", p1.x, p1.y);
		System.out.printf("%d,%d\n", x, y);
		System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %d\n", a,b,c,getD(),e);
	}
}

class Parent{
	public int  a;
	protected int b;
	int c;
	private int d = 10;
	public int x , y;
	public void print () {
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a,b,c,d);
	}
	
	public Parent(){
	}

	public Parent(int a, int b, int c, int d) {
		//super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	/*public Parent(int a, int b, int c, int d) {
		this.a = a; this.b = b; this.c = c; this.d = d;
	}*/
	
	
}
