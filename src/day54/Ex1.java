package day54;

public class Ex1 {

	public static void main(String[] args) {
		// 2차원 좌표 평면의 한 점을 나타내는 point 클래스를 만들고 테스트를 해보세요 
		/* - 멤버변수 설정 (대게 private)
		 * - getter/setter
		 * - 생성자
		 * - 필요한 기능 => 메서드 */
	
		Point p1 = new Point();
		p1.print();
		System.out.println(p1.distance(3, 4));
		
		Point p2 = new Point(4,4);
		p2.print();
		
		p1.move(5, 4);
		p1.print();
	}

}


class Point{
	
	private int x ;
	private int y ;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	
	// 메서드 
	public void print() {
		System.out.printf("(%d,%d)\n", x,y);
	}
	
	// getter , setter를 써도 되지만 ~ 
	public void move(int x, int y) {
		// 멤버 변수와 매개변수가 이름이 같을 때 this를 사용해서 구분 해준다.
		this.x = x;
		this.y = y;
	}
	
	
	// 나와 다른점의 거리를 구하는  메서드 
	public double distance(int x, int y) {
		double res = 0;
		int disX = this.x - x; //x2 - x1
		int disY = this.y - y; //y2 - y1
		res = Math.pow(disX, 2.0) +  Math.pow(disY, 2.0); // (x2-x1)^2 + (y2-y1)^2 
		res = Math.sqrt(res); // 루트 (x2-x1)^2 + (y2-y1)^2 
		return res; 
	}


	// 생성자 
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		
	}
	
	//복사 생성자
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	
	
	
	
	
}