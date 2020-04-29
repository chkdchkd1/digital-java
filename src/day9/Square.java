package day9;

public class Square extends Shape{
 
	private static int squarecount; 
	// 상속의 자식이 사용할 수 없는 것 : 부모의 private으로 된 멤버변수나 메서드 => 겟터 셋터(이거 ㅁㅔ서드임) 로 해서 가져와야한다. 
	public void print() {
		System.out.printf(" - - - - - 사 각 형 의 정 보 - - - - \n");
		System.out.printf("시작점 : ( %d , %d )\n" , getLeft(), getUp());
		System.out.printf("가로 : %.2f\n", getWidth());
		System.out.printf("세로 : %.2f\n", getHeight());
		System.out.printf(" - - - - - - - - - - - - - - - \n");
	}
	
	//public Square(){}
	public Square(int left, int up, double width, double height){
		super(left,up,width,height); // 부모의 생성자 호출  , 자식 클래스의 생성자에서만 호출 할 수 있다.
		squarecount++;
		/* setLeft(left);
		 * setUp(up);
		 * setWidth(width);
		 * setHight(height); 이런식으로 써도 되지만 위에 것이 더 간편&효율적 
		 */
	}
	
	public static void countprint() {
		//스태틱 메서드는 다형성이 적용되지 않아 오버라이딩이 안된다. (@Override를 쓸 수 없다)하지만 해당 메소드를 작성 할 수는 있는데  이 상황을 하이딩이라고 한다.
		System.out.printf("현재까지 생성된 사각형의 갯수  : %d\n" , squarecount);
	}
		

}
