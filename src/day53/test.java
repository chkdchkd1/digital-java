package day53;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Card.w = " +Card.w);
		System.out.println("Card.h = " +Card.h);

		
		Card c1 = new Card();
		c1.num = 10;
		System.out.println("c1.num =" +c1.num);
		System.out.println("c1.w = "+ c1.w);
		
		Card c2 = new Card();
		c2.num = 11;
		System.out.println("c2.num ="+c2.num);
		System.out.println("c2.w = "+ c2.w);
	
		System.out.println("c1의 w를 변경");
		c1.w = 300;
		
		System.out.println("c1.num =" +c1.num);
		System.out.println("c1.w = "+ c1.w);
		
		System.out.println("c2.num ="+c2.num);
		System.out.println("c2.w = "+ c2.w);
		
		System.out.println("c2의  h를 변경");
		c2.h = 500;
		
		System.out.println("c2.h = "+ c2.h);
		System.out.println("c1.h = "+ c1.h);
		
		
		// 인스턴스 변수는 인스턴트가 생성 될 때마다 생성되므로 각기 다른 값을 유지 할 수 있지만
		// 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 가진다
		// ex) c1.w = 300을 주니 c2.w = 300으로 변경됨 . num(인스턴스)는 c1(10), c2(11)에서 각자의 값을 갖는다 
	
		
	}

}


class Card{
	
	int num; 
	int num1;
	static int w = 100;
	static int h = 150; 
}

