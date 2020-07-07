package day54;

import java.util.*;


public class collectionEx2 {

	public static void main(String[] args) {
		// 앞에서 만든 point 클래스를 이용하여 점 하나가 (0,0)->(0.1)->(1.1)->(2.1)로 이동한 경로를 
		// 저장하는 코드를 컬렉션 프레임 워크를 이용하여 작성하세요 
		
		ArrayList <Point> list = new ArrayList<Point> ();
		Point p1 = new Point();
		list.add(new Point(p1)); 
		// add 저장할 때 값을 저장하는게 아니라 p의 주소값이 저장되는것 
		// 그래서 익명 개체 활용
		p1.move(0,1);
		list.add(new Point(p1));
		p1.move(1,1);
		list.add(new Point(p1));
		p1.move(2, 1);
		list.add(new Point(p1));
		
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			it.next().print();
		}
		
	}


	
	
	
}