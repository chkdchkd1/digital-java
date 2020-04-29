package day9;

public class Circle extends Shape {
	
	
	private static int circlecount;
	private double centerX, centerY; // 중심점 
	public void print() {
		System.out.printf(" - - - - - 원 의 정 보 - - - - \n");
		System.out.printf("중심점 : ( %.1f , %.1f )\n" , centerX, centerY);
		System.out.printf("반지름 : %.2f\n", getWidth()/2); // get~를 쓰눈 이유는 width 변수가 프라이빗 이라 직접 가져올 수 없음 ㅇㅇ 정수/정수 = 정수 . 실수/정수 = 실수로 나옴 ㅇㅇ ...
		System.out.printf(" - - - - - - - - - - - - - - \n");
	}
	
	public Circle () {circlecount++;}
	public Circle (int left, int up, double radius) { 
		super(left, up, radius*2, radius*2);
		circlecount++;
		centerX = left + radius;
		centerY = up - radius;
		
		/* setLeft(left);
		setUp(up);
		setWidth(radius*2);
		setHeight(radius*2);*/
	}
	
	//오버라이딩 = 부모의 매서드랑 매개변수 타입 똑같아서 ..(상속전제하) 매개타입개수나 타입이 달라ㅇ ㅑ .. 오버로딩
	public void move(int left, int up) { //원의 시작점을 옮기면서 중심점도 ㅇㅇ.. 
		super.move(left, up); // 부모의 move 매서드를 가지고 와서 매개변수 값을  left up에 저장하는 부모 매서드의 기능을 가지고 온다 .
		centerX = left + getRadius(); // 중심점 : 시작점 에서 반지름 만큼 움직인것 
		centerY = up - getRadius();
		// 이 매서드의 매개변수 left , up을 사용하고 있는거라서 left, up써도 되는것 getLeft, getUp을 써도 ㄱㅊ다 
	}
	
	public void resize(double radius) { //오버로딩  // 원은 사이즈를 바꾸려먼 반지름값을 조절하면댐 
		resize(2*radius, 2*radius); 
		//부모의 resize매서드 , 원은 가로세로 길이가 같기 때문에 같은 값을 줘야함 , 또한 로딩에서는 매개 변수 타입이나 개수가 다르기때문에 부모의 매서드랑 헷갈릴 이유가 없어서 굳이 super.를 붙일 필요 X 
		centerX = getLeft() + radius;
		centerY = getUp() - radius;
	}

	public double getRadius() {
		return getWidth()/2;
	}
	
	public static void countprint() {
		//스태틱 메서드는 다형성이 적용되지 않아 오버라이딩이 안된다. (@Override를 쓸 수 없다)하지만 해당 메소드를 작성 할 수는 있는데  이 상황을 하이딩이라고 한다.
		System.out.printf("현재까지 생성된 원의 갯수  : %d\n" , circlecount);
	}

}


