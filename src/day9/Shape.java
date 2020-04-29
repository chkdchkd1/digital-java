package day9;

public class Shape {
	
	
	private int left; // 시작점의 X좌표
	private int up; // 시작점의 Y좌표
	private double width; // 가로의 길이
	private double height; // 세로의 길이
	private static int cnt = 0;
	public void print() {
		System.out.printf(" - - - - - 도 형 의 정 보 - - - - -\n");
		System.out.printf("시작점 : ( %d , %d )\n" , left, up);
		System.out.printf("가로 : %.2f\n", width);
		System.out.printf("세로 : %.2f\n", height);
		System.out.printf(" - - - - - - - - - - - - - - - \n");
	}
	public Shape() {cnt++;}
	public Shape(int left, int up, double width, double height) {
		cnt++;
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
	}

	
	public static void countprint() { //스태틱 메서드는 다형성이 적용되지 않아 오버라이딩이 안된다. (@Override를 쓸 수 없다)하지만 해당 메소드를 작성 할 수는 있는데  이 상황을 하이딩이라고 한다.
		System.out.printf("현재까지 생성된 도형의 갯수 : %d\n" , cnt);
	}
	

	public void move(int left, int up) { //시작점 옮기긔 
		this.left = left;
		this.up = up;
	}
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//현재까지 생성된 도형의 갯수를 출력하도록 코드를 수정하세요 . = 객체가 생성 될 때마다 카운트 되도록 하면 안되나 ? = 
	
	
	//겟터 셋터를 아래로 넣으면 코드 보기가 편함 
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
