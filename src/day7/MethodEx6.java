package day7;

public class MethodEx6 {

	public static void main(String[] args) {
		// 기능 : 임의의 정수를 생성하여 알려주는 매서드
		/* 매개변수 : 임의의 정수 생성범위 -> int max, int min
		 * 리턴타입 : int 정수 ..? 생성한 정수를 알려줘야하니까?  //메서드 자체 내에서 출력을 할경우 활용성이 떨어진다.
		 * 매서드명 : random
		 */
		
		int max = 50, min = 9;
		System.out.println(random(min,max));
		
	}

	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		int ran =  (int)(Math.random()*(max-min+1))+min;
		return ran;
		// 위에 처럼 해도 되고 바로 return (int)(Math.random()*(max-min+1))+min; 이렇게 바로 때려도 됨.
		
	}
	

}
