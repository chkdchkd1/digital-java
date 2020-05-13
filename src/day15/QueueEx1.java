package day15;
import java.util.*;

public class QueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>(); // Queue는 인터페이스 
		q.offer(1);
		q.offer(2);
		q.offer(3);
		 System.out.println(q.poll()+ "을 큐에서 꺼냈습니다.");
		 System.out.println(q.poll()+ "을 큐에서 꺼냈습니다.");
		 System.out.println(q.poll()+ "을 큐에서 꺼냈습니다.");
		 /*큐에 번지에 저장된 순서와 꺼내는 순서는 조금 다르다. */
		 /*큐는 링크드 리스트로 만들었고 , 이때 offer는 마지막 객체 뒤에다 새로운 객체 정보를 저장한다 = 먼저 넣은 것을 먼저 꺼낸다 
		  * poll은 0번지의 값을 제거하고 반환한다. */
		for (Integer tmp : q) { 
			System.out.println(tmp);
		}
	}

}


/* 출력 결과 
1을 큐에서 꺼냈습니다.
2을 큐에서 꺼냈습니다.
3을 큐에서 꺼냈습니다.
*/