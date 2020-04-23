package day5;

import day4.*;
import day5_1.*;

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEx3.main(null);
		DefaultClassEx1.main(null);
		/* DefaultClassEx2는 다른 패키지에 있는 클래스인데 접근 제한자가 default이어서 사용할 수 없기 때문에 에러발생 */
		// DefaultClassEx2.main(null);
		
		Point p1 = new Point(); // 객체가 생성 됐음. 일반변수가 아닐땐 new를 사용한다
		p1.x1 = 10;
		//p1.x2 = 10; 
		//point클래스의 x2는 Point 클래스 안에서는 사용 할 수 있지만 타 클래스 안에선 사용 할 수 없다
		
		p1 = new Point(1,2);
		
	}

}


//point : 2차원 좌표 평면에서 점 1개를 나타내는 클래스 
class Point{
	int x1 ; // x축의 좌표
	int y1 ; // y축의 좌표 
	private int x2; // 이 클래스에서만 사용할 수 있는 접근제한자 private
	private int y2;
	public int x3;
	public int y3;
	
	public Point(){
		x1 = x2 = x3 = 0;
		y1 = y2 = y3  = 0;
		System.out.println("Point의 기본 생성자 호출 ");
	} // 생성자 : 멤버변수 초기화 하는 역할, 없어도 되는 이유 멤버변수들이 기본적으로 0으로 초기화 되기때문에 
	
	
	
	public Point(int x, int y) {
		x1 = x2 = x3 = x;
		y1 = y2 = y3  = y;
		System.out.println("Point의 생성자 오버로딩 호출");
	} // 생성자 오버로딩 
}
