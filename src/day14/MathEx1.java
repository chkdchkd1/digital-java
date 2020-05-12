package day14;
import static java.lang.Math.*; // import static 을 앞에 쓰면 클래스 메소드의 메소드명을 생략할 수 있음 .. 이경우엔 math를 생략해도 ㄱㅊ
public class MathEx1 {

	public static void main(String[] args) {
		//
		
		System.out.println(Math.ceil(1.51));// 소수점 첫째짜리에서 올림
		System.out.println(Math.floor(1.51)); //소수점 첫째자리에서 버림
		System.out.println(Math.round(1.51)); //소수점 첫째자리까지 반올림

		
		double num = 1.51;
		num= num * 10; 
		// 1.51을 소수점 둘째자리에서 올림을 하기위해서는
		System.out.println(Math.ceil(num)/10);
		// 1.51을 소수점 둘째자리에서 버림을 하기위해서는
		System.out.println(Math.floor(num)/10);
		System.out.println(Math.round(num)/10.0); //round는 정수값을 반환하기때문에 실수값을 보기위해선 ~
		
	}

}