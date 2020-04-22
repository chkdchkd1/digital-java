package day4;

public class TestEx2 {

	public static void main(String[] args) {
		/* 1. 정수 10 개를 저장 할 수 있는 배열을 선언하고 생성하세요. => 배열의 생성과 선언
		 * 2. 1부터 10까지 차례대로 배열에 저장하세요.  => 배열의 시작번지는?
		 * 3. 저장된 배열의 값을 출력하세요 . => 향상 된 for문은 어떻게 사용하는가?
		 * 4. 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요. =>반복문안에서 조건문 사용, 작성방법에 따라 continue를 사용할 수도 
		 * 5. 저장된 배열의 값을 출력하세요 => 향상된 for문 사용
		 * */
		
		int i;
		int[] arr = new int [10];
	    for(i = 0; i<arr.length;i++) {
			arr[i]= i + 1;
		}
		for (int tmp : arr) {
			System.out.printf("%2d ",tmp);
		
		}
		
		System.out.println();
		
		for (i = 0; i<arr.length;i++) {
			if(i % 2 == 0) {
				arr[i] = arr[i]*2;
			}
		}	
			
		/*for (i = 0; i<arr.length;i+=2) {
			arr[i]*=2;
		} */
		 // if 조건식이 false 라면 괄호 안에 문장은 수행되지X	 
		 // 배열은 번지가 0 부터 시작하니까 숫자 1 있는곳이 번지 0 숫자 3 있는곳이 번지 2
	
		for (int tmp : arr) {
			System.out.printf("%2d ",tmp);
		}

	}
}
