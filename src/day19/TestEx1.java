package day19;

import java.util.*;

public class TestEx1 {

	public static void main(String[] args) {
		/*정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세요.
		예) 정수를 입력하세요 : 12345
			결과 : 54321 *
			12345 % 10 =>5
			1234 % 10 =>4
			123 % 10 =>3
			12 % 10 => 2
			1 % 10 => 1*/

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		
		int tmp = num; //백업
		String res = ""; // 12340을 입력했을때 04321 으로 보기위해선 문자열로 저장해야함 int가 아니라 int는 정수라 앞자리 0을 출력할 수 없음 
		while(tmp !=0) {
			res += tmp % 10; //+= : 기존값에 우측항을 더함, 문자열이랑 있으면 +하는게 아니라 그냥 뒤에 붙음 참고로 
			tmp = tmp / 10; // 12345 -> 1234 까지 
			//list도 이런식으로 하면 된다 
		}
		
		
		if(num!=0)
			System.out.println(res);
		else 
			System.out.println(num);
		
		System.out.println(res); // 마지막에 한번에 출력하기때문에 문자열로 바꿔서 한거지 반복문에서 출력 하면 상관 X
		res = ""+num; // => 정수를 문자열로 간단하게 반환하는 코드 
		String reverseRes = ""; //문자열 하나하나 가지고오는 것 
		for (int i = res.length()-1; i>=0; i--) {
			reverseRes += res.charAt(i);
		}
		System.out.println(reverseRes);
		scan.close();
	}

}
