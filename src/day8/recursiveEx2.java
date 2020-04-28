package day8;

public class recursiveEx2 {

	public static void main(String[] args) {
		// 반복문을 이용해서 재귀호출 팩토리얼을 재현 해보자 
		
		int num = 5;
		int res = 1; //0으로 시작하면 곱은 다 0이 나오기 때문에 
		for(int i = 1; i<=5; i++) {
			res *= i; //res = res * i 
		}
		if (num < 0 ) {
			System.out.println(0);
		} else {
			System.out.println(res);
		}

	}

}
