package day14;


public class TestEx1 {

	public static void main(String[] args) {
		
		/* 다음 조건을 만족하는 클래스를 생성하세요. (equals 랑 toString 은 소스 -제너레이드~이거 쓰면 되고 생성자 역시 소스 제너레이드 컨스르럭터 유징 필 터 뭐시기..) 
		 * 1. 클래스 이름은 Point로 2차원 좌표평면의 점을 나타내는 클래스이다.
		 * 2. 멤버변수는 X좌표와 Y좌표가 있다.
		 * 3. 두 점이 주어졌을 때 두 점이 같은지를 비교하는 equals()메소드를 오버라이딩 해야한다.
		 * 4. 좌표의 점을 확인하기 위한 toString()메소드를 오버라이딩해서 확인한다.
		 * 5. 생성자를 이용하여 멤버 변수를 초기화한다.
		 * 6. 두점의 거리를 계산하는 distance()메소드를 구현해야한다.
		 * - 공식 : 루트 ((x2-x1)의 제곱 + (y2-y1)의 제곱)
		 * - 제곱 함수 : Math.pow();
		 * - 루트 함수 : Math. sqrt()
		 * 클래스를 생성한 후 main 메서드에서 구현하세요 
		 */
		
		  System.out.println("- - - - - equals, toString 예제- - - - - - - - ");  
		  Point p1 = new Point(0,0);
		  Point p2 = new Point(3,4);
		  System.out.println(p1 + "과" + p2 + "는 같습니까 ? :  " + p1.equals(p2));	  
		  System.out.println("- - - - - distance 예제- - - - - - - ");
		  System.out.println( p1 + "과" + p2 + "의 거리는 " + p1.distance(p2));

	}

}


class Point {
	
	private int x;
	private int y;
	
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
	
	public Point () {
		
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) { // 어떠한 객체라도 비교하기 쉽게 하기 위해서 Object를 씀 
		if (this == obj)  //내가 알고있는 주소랑 상대방의 주소랑 같다 (obj와 this가 같은 객체를 공유하고 있는 경우 )
 			return true;
		if (obj == null) //비교할 점 obj가 없는 경우 nullPointException이 발생한느걸 막아주는 역할 
			return false;
		if (getClass() != obj.getClass()) //다른 클래스의 멤버변수를 알 수 없기 때문에 같은 클래스여야함  
			return false;
		Point other = (Point) obj; // obj가 Point 클래스의 객체 인경우  , obj가 object타입이므로 x,y값을 참조하기 위해서는 Point타입으로 형변환 해주어야한다.
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}
	
	
	// 내점 과 상대방의 점을 비교할거면 객체 메서드이고 그냥 두점으로 할거면 static
	public int distance(Point other) {
		int distanceX = x - other.x;
		int distanceY = y - other.y;
		double res = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
		return (int) res;
	}


}