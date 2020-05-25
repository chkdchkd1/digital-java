package day23;

import java.util.*;

public class TestEx1 {

	public static void main(String[] args) {
		/* 정수 5개를 입력받아 리스트에 저장하고, 저장된 값들을의 합과 평균을 코드를 작성하세요.
		 * 합과 평균을 메소드를 이용하여 확인하도록 코드를 작성하세요.
		 * Iterator를 이용하여 작성하세요. */
		//인터페이스인 List는 List 인터페이스를 구현한 ArrayList 클래스의 객체를 저장할 수있다,
		//추상 메소드와 상수로만 이루어진 것을 인터페이스라 한다, 추상 메소드란 메소드의 선언부만 있고 구현 없는 메소드.
		//List는 인터페이스이기때문에 객체를 생성할 수없고 (구현X) list를 구현한 arraylist로  

		List<Integer> list = new ArrayList<Integer>(5); // (5)는 용량이 5인 리스트  size는 저장된 객체개수 
		Scanner scan = new Scanner(System.in);
		int size = 5;
		for(int i = 0; i<size; i++) {
			System.out.print("정수를 입력하세요 : ");
			list.add(scan.nextInt());
			// 이때 입력받은 정수를 Integer 클래스의 객체로 변환하여 저장한다 (오토박싱/언박싱) 
		}
		
		System.out.println(list);
		System.out.println(sum(list));
		System.out.println(Average(list));
		
//		Iterator<Integer> it = list.iterator(); //map, set에서도 쓸 수 있다 iterator (set은 get(i)을 쓸수업슨데 그이유가 순서를 알 수 없어서 ㅇㅇ.. 넣어준 순서대로 꺼내지않는다 set은
//		while(it.hasNext()) {
//			/*Iterator를 생성할 때 Iterator의 <>를 입력을 안하면 Object가 자동으로 들어가고, 
//			그렇게 되면 it.next()를통해 가져오는 정보 클래스도 Object가 되기때문에, 
//									Iterator it = list.iterator();
//			그렇게되면 형변환이 필요함  ex) Integer tmp = (Integer)it.next(); 
//			(부모 클래스가 자식클래스로 변환할 때 형변환이 필요한 경우가있기에 자식>부모는 X) */
//			if(it.next() != null)
//				sum =+ it.next();
//			/*래퍼 클래스를 이용할 때 주의사항
//			 * int 정수형을 저장하고, Integer 클래스는 정수형과 null을 저장한다.
//			 * 따라서 Integer의 객체를 int로 저장하는 경우 Integer의 객체가 null인지 아닌지 판단할 경우가 있다.  */
//		}
//		
//		System.out.println(sum);
	}
	
	
	
	public static int sum (List<Integer> list) {
		int sum = 0;
		Iterator<Integer> it = list.iterator(); 
		while(it.hasNext()) {
			Integer tmp = it.next();
			if(tmp !=null)
				sum += tmp;
			}
		
		return sum;
	}
	
	public static double Average(List<Integer> list) {
		return (double)sum(list)/list.size();
	}
	
	
	
	
	
	

}
