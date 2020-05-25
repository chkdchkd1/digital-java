package day23;

public class GenericEx1 {

	public static void main(String[] args) {
		/*p.670 지네릭스 : 클래스(A)안의 멤버변수의 클래스(B)를 미리 지정해 놓지 않고, 클래스(A)를 생성할 때 결정해주는 클래스 */
		Student<Double> s = new Student<Double>(); // Student뒤에 꺽쇠를 생략하면 object가 들어간다.
		s.eng = 10.0;
		System.out.println(s.eng);
	}

}

class Student <T>{
	String name;
	T kor;
	T eng;
	T math;
	
	
	
}