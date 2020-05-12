package day14;
import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		// 재사용을 활용한 

	Scanner scan = new Scanner (System.in);
	print(scan);
	print('=',20);
	System.out.println(print2('&', 10));

	}

	public static void print(Scanner scan) { //메인 메서드랑 같은 클래스에서 메서드 쓸 때는 static 붙여야
		String s = scan.next();
		System.out.println(s);
	}
	
	public static void print (char ch, int cnt) {
		for (int i = 0; i <= cnt ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static String print2(char ch, int cnt) {
		StringBuffer res = new StringBuffer(cnt); // string 을 써도 되지만 수정이 잦을땐 Stringbuffer를 사용하는게 더 성능이 좋다  
		for (int i = 0; i <= cnt ; i++) {
			res.append(ch);
		}
		return res.toString();
	}
}

