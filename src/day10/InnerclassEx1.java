package day10;

public class InnerclassEx1 {

	public static void main(String[] args) {
		// 익명의 클래스 

		C c = new C();
		//A1 a = new A();
		test(c);
		/* 인터페이스 B1을 구현한 클래스를 아래에서 바로 만든 후 만들어진 클래스의 객체를 매개변수로 전달하여 test 메소드를 실행 
		 * 이과정과 같은 내용이 위에 있는 클래스 C를 이용한 방법이다 */

		test(new B1(){
			public void func() {}
				
			}); //클래스를 만들고 만들어진 클래스로 객체를 만들고 그 객체를 매개변수로 전달하는 것  , 어떤 메소드들은 매개변수로 특정 인터페이스를 구현한 클래스를 요구하는 경우가 있다 . 그경우에 해당  
		}
		public static void test(B1 b){
		}
		
		
	}



class A1{
	
}
interface B1 {
	public void func();
}

class C implements B1{

	@Override
	public void func() {
		// TODO Auto-generated method stub
		
	}
}


