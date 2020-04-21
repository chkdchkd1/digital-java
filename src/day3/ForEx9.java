package day3;

public class ForEx9 {

	public static void main(String[] args) {
		// 중첩 for문 
		
		// 그냥 for문을 이용해서 
		/*for(int j=1; j<=5; j++) {
			System.out.printf("*");
		}*/
		
		// 내가 한 반복작업을 여러번 반복하고 싶을 때 
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
