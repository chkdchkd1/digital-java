package day53;

public class methodEx2 {

	public static void main(String[] args) {
		// 1부터 10까지 합을 구하는 코드를 메서드로 만들어서 작성하세요 
//		 * - 매개변수  : 두 정수 => int min, int max 
//		 * - 리턴타입  : 정수 => min부터 max까지의 합 =정수 =>int
//		 * - 메소드명  : sum  */
		
		System.out.println(sum(4,6));
		System.out.println(sum2(4,6));
		

	}
	
	
	
	public static int sum(int x, int y) {
		int sum = 0;
		while (x != y+1) {
			sum = sum + x;
			x++;
		}

		return sum;
	}
	
	public static int sum2(int min, int max){
		int res = 0;
		for(int i = min;i<=max;i++) {
			res += i;
		}
		return res;
	}
	

}
