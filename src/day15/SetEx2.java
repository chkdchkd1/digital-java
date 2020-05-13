package day15;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		hs1.add(18);
		hs1.add(40);
		hs1.add(28);
		hs2.add(11);
		hs2.add(44);
		hs2.add(50);
		Iterator<Integer> it1 = hs1.iterator();
		Iterator<Integer> it2 = hs2.iterator();
		int i = 1;
		while(it1.hasNext() && it2.hasNext()) {
			Integer num1 = it1.next(); 
			Integer num2 = it2.next();
			if(num1.equals(num2)) {
				System.out.println(i + "번째로 가져온 두 값" + num1 + "은 같습니다.");
			} else {
			System.out.println(i + "번째로 가져온 두 값" + num1 +"과" + num2+ "은 다릅니다.");
		}
		// hasnext에서 있다고 트루 값이 나오면 그 다음값을 next가 가져와서 num1에 넘겨준다. set에는 get이없어서 이런식으로 가져옴 , 그냥 가져오는걸 보여줄뿐 set은 넣어준 순서대로 꺼내지않기때문에 비교는 불가능..
		 // Iterator는 컬렉션에 있는거라서 셋도 쓸수 있음 
		}
		
	}

}
