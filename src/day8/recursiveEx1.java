package day8;

public class recursiveEx1 {

	public static void main(String[] args) {
		// 재귀호출 팩토리얼 메서드
		System.out.println(fact(5));

	}
	
	public static int fact(int num) {
		if(num == 1 || num == 0) //1! = 1 이기 때문에 굳이 반복한번 더하지 말고 , 또한 0! =1인데 그냥 식에 적용해서 돌리면  0*-1! = -1나오기이에 둘다 바로 1로 설정해준다  
			return 1;
		if(num < 0) {
			return 0;
		}
		return num*fact(num-1);
		
	}

}


/*  아래는 재귀호출을 이용한  main에서 프로그램이 종료 될 때 까지 실행순서를 줄로 표현 하는 것
 * 5 > 7(f5를 호출) > 
11 (num = 5) > 12> 14>17 (f4호출) (num = 4일 때 팩토리얼 호출) >
11 (num = 4) > 12> 14>17 (f3호출) = 3일 때 팩토리얼 호출)> 
11 (num = 3) > 12> 14>17 (f2호출) = 2일 때 팩토리얼 호출)>
11 (num = 2) > 12> 14>17 (f1호출) = 1일 때 팩토리얼 호출)>
11 (num = 1) > 12> 13(f1을 ㅃㅏ져 나가 f1을 호출한 17로감 > 
17(f1에서 빠져나와 f2의 17번줄을 실행하는데 이때 f2를 빠져나감)(1팩토리얼 매서드를 빠져 나와 2팩토리얼의 리턴으로 이동, n=2) >
17(f2에서 빠져나와 f3의 17번줄을 실행하는데 이때 f3를 빠져나감)(2팩토리얼 매서드를 빠져 나와 3팩토리얼의 리턴으로 이동, n=3) >
17(f3에서 빠져나와 f4의 17번줄을 실행하는데 이때 f4를 빠져나감)(3팩토리얼 매서드를 빠져 나와 4팩토리얼의 리턴으로 이동, n=4) >
17(f4에서 빠져나와 f5의 17번줄을 실행하는데 이때 f5를 빠져나감) (4팩토리얼 매서드를 빠져 나와 5팩토리얼의 리턴으로 이동, n=5) > 
7(f5호출한 7로 가서 5팩토리얼의 값이 계산되어 나옴) > 9
*/
