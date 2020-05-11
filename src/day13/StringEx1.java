package day13;

public class StringEx1 {

	public static void main(String[] args) {
		/*str1 과 str2는 둘다 abc라는 문자열 리터럴을 저장하기 때문에 같은 주소를 가진다. (문자열 리터럴은 재사용하기 때문에)
		 * str2에 abc를 저장하기 전에 리터럴을 저장하는 메모리에 abc가 있는지 확인하여 있으면 새로만들지 않고 재사용한다. 
		 * 그래서 str1에서 사용된 abc를 재사용하기 때문에 str1 과 str2의 주소는 같다 */
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2); //주소값이 같은지 비교 
 		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		
	}
	

}
