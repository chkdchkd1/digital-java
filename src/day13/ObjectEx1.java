package day13;

public class ObjectEx1 {

	public static void main(String[] args) {
		// >> a1에서 만든 객체를 a2가 같이 공유 
	  A a1 = new A();  // 객체 A 생성 
	  A a2 = a1;      // 생성된 객체 공유 ? 
	  System.out.println(a1.num + "," + a2.num);
	  a1.num = 20;
	  System.out.println(a1.num + "," + a2.num);
	  a2.num = 30;
	  System.out.println(a1.num + "," + a2.num);
	  try {
		  A a3 = (A)(a1.clone()); //형변환을 위해서 자식타입을 써줘야함 클론의 리턴타입이 object임 object는 부모이고 자식이름을 앞에 명시해서 형변환 해줘함 
		  a3.num = 40;
		  System.out.println(a1.num + "," + a3.num);
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	  System.out.println("- - - - - 깊은 복사 예제 (clone) - - - - - - ");  //
	  B b1 = new B();
	  b1.a = new A();
	  b1.a.num = 10;
	  B b2 = b1.clone();
	  System.out.println(b1.a.num +","+ b2.a.num );
	  b2.a.num =30;
	  System.out.println(b1.a.num +","+ b2.a.num );
	  System.out.println("- - - - - - - - - - - - - - - ");
	  System.out.println("- - - - - equals 예제- - - - - - - - - ");  //
	  A a4 = new A();
	  A a5 = new A();
	  System.out.println(a4.num +","+ a5.num );
	  System.out.println(a4.equals(a5));
	  
	  System.out.println("- - - - -  toString 예제 - - - - - - - - -");
	  C c = new C ();
	  System.out.println(c);
	  
	  
	}
}

/* 오버라이딩 - 부모의 접근제한자보다 같거나 넓은 접근 제한자만 가능  
 * => 부모 : public , 자식 : public  
 * => 부모 : 디폴트, 자식 : 디폴트, 퍼블릭 , 프로텍티드
 * => 부모 : protected, 자식 : protected, public
 * => 부모 : private , 자식 : 전부 
 */

class A implements Cloneable{
	int num;
	@Override
	public Object clone() {
		Object obj = null;
			try {
				obj = super.clone();
			}catch (Exception e) {
				System.out.println("예외");
			}
		return obj;
	}
	
	public A() {}
	public A(int num) {
		this.num = num;
	}
	
	@Override
 	public int hashCode() {
	 	final int prime = 31;
	 	int result = 1;
	 	result = prime * result + num;
	 	return result;
 }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false; // => 같은 의미 if(! (obj instanceof A)) { return false; }
		A other = (A) obj; // A other =  이건 A 타입의 클래스명 other 
		if (num != other.num)
			return false;
		return true;
	}
		
		
	}

class B implements Cloneable{
	A a; // 참조변수의 기본값은 null
	@Override
	public B clone() {
		B obj = null;
		try {
			obj = (B)super.clone();
		}catch (Exception e) {
			System.out.println("예외");
	}
		if(obj instanceof B) {
		obj.a = new A (((B)obj).a.num);  //깊은 복사 
		}
		return (B)obj;
	
	}	
	}


/* 얕은 복사는 멤버변수가 일반변수 일때는 문제 없이 사용 되는경우
멤버 변수가 참조 변수인경우 얕은 복사를 하면 해당 참조변수를 공유하기 때문에 문제가 발생 할 수 있다.
이를 해결 하기 위해 참조 변수인 멤버변수를 단순히 복사하는게 아니라 새로운 객체를 만들고 만들어진 객체에 값을 복사하여 
공유하지 않도록 하는 것이 깊은 복사이다. */


class C{
	int num1, num2, num3, num4, num5 ;

	@Override
	public String toString() {
		return "C [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}
	
}
