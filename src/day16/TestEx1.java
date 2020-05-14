package day16;

import java.util.*;


public class TestEx1 {

	public static void main(String[] args) {
		//컬렉션 꺽쇠 안에는 클래스만 올 수 있으므로 int X Integer O
		/* 1~10 사이의 랜덤한 수를 생성하여 리스트에 작성하고 출력하는 코드를 작성하세요 (단, 중복 불가)  => 문제가 어려울땐 문제 해결과정을 아래처럼 쭉 풀어서 써보긔 
		 * 1. 리스트 생성
		 * 2. 반복문 실행 =>종료조건 실행 
		 * 	2-1. 1~10 사이의 랜덤한 수를 생성
		 * 	2-2. 리스트에 생성된 랜덤수가 있는지 체크 
		 * 	2-2-1. 없으면 리스트에 추가 
		 * 3. 리스트 출력 
		 */
			
		ArrayList<Integer> list  = new ArrayList<Integer>(); 
		int min = 1 , max = 10;
		int size = 6;
		while (list.size()<size) {
			//2-1
			int random = new Random().nextInt(max-min+1) + min;
			//2-2
			if (!list.contains(random))
			list.add(random);
		}
			System.out.println(list);  //tostring으로 알아서 문자열로 출력 메소드로 
		
	}
	

	private static void printList(List<Integer> list) {
		for (Integer tmp : list) {
			System.out.print(tmp+" ");
			}

	}
	
}