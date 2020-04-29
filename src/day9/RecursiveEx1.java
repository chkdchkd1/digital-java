package day9;

public class RecursiveEx1 {

	public static void main(String[] args) {
		// 재귀함수 
		ClassB b = new ClassB();
		b.print(5);
		System.out.println(sum(10));
		System.out.println(sum(1,5));
		

	}

	//1부터 10까지 합을 구하는 코드를 재귀 메소드로 작성해보세요 . 
	 /* 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 
	  * 10 + sum(9) = 10 + 9 + sum(8)
	  */
	
	public static int sum (int num) {
		if (num < 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		} 
		return num+sum(num-1);
	}
	/* sum (1,10) : 1에서 10까지의 합
	 * 10 + sum(1,9) : 1에서 9까지의 합 + 10
	 */
	
	public static int sum ( int min, int max) {
		if (min > max) {
			return 0;
		}
		if (max == min)
			return min;
		return max+sum(min, max-1);			
	}
	
}

class ClassA{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}

class ClassB extends ClassA{
	public void print() {
		//print(); 재귀호출이 되어 스택오버플로우가 발생한다.
		super.print(); //목적에 맞게 부모 클래스를 의미하는 super.를 붙여주어야한다.
		System.out.println("B클래스입니다.");
	}
	//print 메소드를 오버로딩
	public void print(int num) {
		print();
		System.out.println("B클래스입니다.");
	}
}


/* 출력값
 * A클래스입니다.
B클래스입니다.
B클래스입니다.
55
15


 */
	
	
