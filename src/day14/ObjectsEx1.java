package day14;

import java.util.Objects;

public class ObjectsEx1 {

	public static void main(String[] args) {
		// p. 496 java.util.Objects; (객체의 비교나 null 체크에 유용)

		String str = null;
		System.out.println("객체 str은 null 입니까? "+Objects.isNull(str));
		System.out.println("객체 str은 null 아닙니까? "+!Objects.isNull(str));
		System.out.println("객체 str은 null 아닙니까? "+Objects.nonNull(str));
		String str2 = "";
		//System.out.println(str.equals(str2)); // str2은 객체가 안만들어진 상태 (null) 에서  equal 메서드를 호출하면  NullPointerException 예외가 뜬다 
		System.out.println(Objects.equals(str, str2)); //클래스 메서드라서 매개변수가 널값이어도 상관이없다. 널인지 아닌지 신경쓸필요없이 ㅂㅣ교가능
	}

}
