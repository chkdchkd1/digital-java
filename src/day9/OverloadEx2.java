package day9;

public class OverloadEx2 {

	public static void main(String[] args) { 
		// 아래 코드는 sum 메서드에서 static 이 안붙는경우 
		// => 매서드가 static이 없으면 (객체 메서드) 객체를 생성하고나서야 쓸 수 있다. 
		/* OverloadEx2 obj = new OverloadEx2();
		System.out.println(obj.sum(3, 4));*/
	
		//<- 클래스 메서드 호출 , 인스턴스 생성없이 호출 가능 
		System.out.println(sum(3,4));
		System.out.println(sum(1.1,1.2));  
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum());
		System.out.println(sum('1',2,3,4,5)); // 문자는 실수값 저장 가능 이때 문자 1 은 아스키코드(유니코드) 49를 말한다. = 자동자료형변환  + char ch = 'a ' +1 이부분도 다시쳌 
		//System.out.println(sum("1'",2,3,4,5)); 
		//문자열 1은 실수로 자동형변환이 안된다. , 에러가 발생하지 않게 하려면 문자열 1을 정수, 실수, 문자로 수정던지  sum메서드를 오버로딩하여 문자열도 가능하도록 추가해야한다.
		}
	/*
	public int sum (int num1, int num2) { 
		return num1+num2; 
	} */ 
	
	// 두 정수의 합을 알려주는 메서드 
	public static int sum (int num1, int num2) { 
	//// static을 붙이는 이유  객체 생성 없이 쓰일 수 있다..? 같은 클래스 메서드 이기때문에 ? 
		return num1+num2; 
	}
   // 두 실수 의 합을 알려주는 메서드  = double이 int를 표현 할 수 있다 ㅇㅇ 그래서 좋은 예제가 아님요.. 굳이 두개다 있을 필요는 없기 때문
	public static double sum (double num1, double num2) {
		return num1 + num2;
	}
		
	// 세 실수의 합을 알려주는 메서드 
	public static double sum (double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	// n개의 실수의 합을 알려주는 메서드 = 가변 인자를 이요한 합계구하는 메서드 
	public static double sum (double...nums) {
		double res = 0.0;
		for(double tmp : nums) { 
			res += tmp; 
		}
		return res;
	}
		
	
}
