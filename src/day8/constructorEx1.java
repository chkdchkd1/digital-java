package day8;

public class constructorEx1 {

	public static void main(String[] args) {
		// this(). 예제
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(1,2);
		p2.print();
		Point p3 = new Point(p2); //복사 생성자 호출
		p3.print();
		/*int num1 ;
		int num2 = 10;
		num1 = num2; // num2를 사용하여 num1 초기화 
		// = 기준으로 오른쪽으로 오는게 사옹하는것 ex ) int num3 = num1  */
		
	}

}
class Point{
	int x = 1;
	int y = 1 ;
	{
		//초기화 블럭
		//x = 10;
		//y = 10;
	}
	static {
		//클래스 초기화 블럭 
		//클래스 변수만 초기화 가능
	}
	void print() {
		System.out.printf("(%d,%d)", x,y);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		//this(0,0);  // 여기서 this()는 생성자 point(intx, inty)  를 말하는것  0 0 을 넣어서 0으로 초기화
		this(100,100);
	}
	
	//복사 생성자
	public Point(Point p) { // 클래스의 객체(참조변수) (Point p) 가 매개변수로 올때 생성자 point(int x,int y)에 객체(참조변수) p의 멤버변수 x 값 을 넣어준다 ..?)
		// 다른 생성자 this()를 이용할 때 에는 메서드의 첫번째 줄에 넣어주어야 한다 .
		this(p.x,p.y); 
		//this.x = p.x;
		//this.y = p.y;
		
	}
}
