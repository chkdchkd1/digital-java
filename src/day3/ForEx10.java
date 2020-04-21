package day3;

public class ForEx10 {

	public static void main(String[] args) {
		// 구구단 2 단부터 9단 까지 출력하는 코드를 작성하세요  
		// 7단 출력 예제를 활용 
		//1. 반복횟수 : i는 1부터 9까지 1씩 증가 
		//2. 규칙성 : i에 7씩 곱한다. = 7*i
		// i+=1 = i++

		int i= 0;
		int num = 0;
		for(num = 2; num<=9; num++) {
			for(i=1;i<10;i++) {
				System.out.printf("%d x %d = %d\n", num, i, num*i);
			}
			System.out.println();
		}
		
	
	// 반복문에 이름을 붙여서 구구단 전체를 출력하는 코드에서 2단만 출력하도록 수정
	Loop1 : for(num = 2; num<=9; num++) {
		for(i=1;i<10;i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
			if(i==9)
				break Loop1;
		}
			System.out.println();
		}

	}
}


