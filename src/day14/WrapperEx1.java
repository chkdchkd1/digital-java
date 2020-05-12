package day14;

public class WrapperEx1 {

	public static void main(String[] args) {
		// p. 490 래퍼클래스 
		

		/* int num = null; // 어떠한 값이 null이어야 하는경우 int의 래퍼클래스인 integer 를 사용한다.
		Integer num = null; */
	
		
		boolean b1 = true;
		Boolean b2 = true;
		char ch1 ='a'; // ch1 변수에 a를 저장 
		Character ch2 = 'a'; //'a'라는 값이 저장소에 저장되어 (리터럴상수, 상수저장소에 저장됨 ) 이 저장된 주소를 ch2로 전달 왜냐 ch2는 참조변수라서 = 실제로 ch2에 a가 저장된게 아님  = 오토박싱
		ch1 = ch2; // 언박싱 :   참조변수를 문자로 저장하는게 아니라 참조변수가 가지고 있는 문자값을 주는것 
		int num1 = 10;
		Integer num2 = 10;
		double dnum1 = 1.23;
		Double dnum2 = 1.23;
		Double dnum3 = new Double(1.23); // 클래스니까 생성자를 통해서 만들 수 도 있다. 	
		
	}

}
