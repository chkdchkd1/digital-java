package day4;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 향상된 for문 ㅇㅖ제
		/* 향상된 for문을 주로 사용하는 경우
		 * 1. 배열의 모든 값을 탐색하는 겨우
		 * 2. 배열의 값을 수정하는지 않는 경우 
		 */
		
		int [] arr = new int [] {1,3,5,7,2,4,6,8};
		for (int tmp : arr) {
		// tmp 와 arr 타입을 맞춰주어야 한다.	
			System.out.println(tmp);
		}
			
	}

}
