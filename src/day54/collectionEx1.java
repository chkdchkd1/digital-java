package day54;

import java.util.*;

public class collectionEx1 {

	public static void main(String[] args) {
		// 컬렉션 프레임 워크를 이용하여 1부터 10까지 저장하는 코드를 작성하세요 <꺽쇠에는 클래스가 와야 int x integer o>
		// int = 일반 변수 
		// Integer = 참조변수(클래스의 객체)  => NULL
		
	 ArrayList <Integer> arr1 = new ArrayList<Integer> ();
	 
	 	for(int i =1; i<11;i++) {
	 		arr1.add(i);
	 	}
	 	
	 	Iterator<Integer> it = arr1.iterator();
	 	while(it.hasNext()) {
	 		System.out.println(it.next());
	 	}
	 	
	 	printList(arr1);
	 	
	
//	 HashSet <Integer> arr2 = new HashSet<Integer> ();
//	 HashMap <Integer,Integer> arr3 = new HashMap<Integer,Integer> ();

	

	}
	
	private static void printList(List<Integer> list) { // List를 매개변수로 넣으면 array list나 LinkedList 다 올 수있다 
		for (Integer tmp : list) {
			System.out.print(tmp+" ");
			}
		System.out.println();

	}
	
}
