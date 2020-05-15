package day17;

import java.util.*;

public class TestEx1 {
	// static Scanner scan = new Scanner(System.in); 
	// Scanner를 클래스 멤버 메서드로 사용 할 수 있지만 TestEx1 클래스에서 스캐너는 의미 있는 정보가 아니므로 사용하지 않는 것이 좋다. 
	// 또한 static 아니고 객체 멤버 변수로 선언하면 main에서 호출 할 수 없다 .  클래스 메서드는 클래스 메서드를 편히 호출 할 수 있다 

	public static void main(String[] args) {
		// 두 정수를 입력받아 두 정수를 더하여 출력하는 코드를 자유롭게 작성하세요 .
		
		Scanner scan = new Scanner(System.in); //참조변수, 지역변수 
		sum(scan);
		scan.close();
		
		//int num1  = scan.nextInt(); // 일반변수 
		//Integer num2 = scan.nextInt(); // 일반 변수를 -> 클래스로 만드는게 래퍼클래스 : 참조변수 지역변수 ; 
		
	}

	 /*기능 : 입력받은 두 정수를 더한 값을 돌려주는 메서드
	  * 매개변수 : 입력받을 수  
	  * 리턴타입 : void (단순출력)
	  * 메서드명 : sum
	  */
	
	public static void sum(Scanner scan) {
		System.out.println("두수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1 + " + " + num2 + " = " +(num1+num2));	
	}
}
