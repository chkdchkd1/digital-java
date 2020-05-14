package day16;

import java.util.*;

public class MapEx1 {
	
	public static void main(String[] args) {
		// 
		HashMap<String, String> map = new HashMap<String, String>(); 
		// <>꺽쇠 쓰는이유..?클래스를 만들때 멤버변수의 자료형이 고정된게 아닌 , 클래스가 특정클래스로 정해진게 아님 :  제네릭 클래스 
		map.put("abcde", "1234");
		map.put("abcde", "12345");
		map.put("abcdef", "1234");
		
		
		Set set = map.entrySet(); //map은 컬렉션 외에 존재하기에 그냥 컬렉션의 iterator를 쓸 수없다. 그래서 map을 set으로 변환해서 쓴다
		/* = Set <Map.Entry<String, String>> set = map.entrySet();
		map 인터페이스에서 제공하는 entry 클래스 */
		Iterator it = set.iterator(); //set에 있는걸 하나하나 끄집어내는걸 iterator 
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("id : " + e.getKey());
			System.out.println("pw : " + e.getValue());
			System.out.println("=============");
		}
		
		Set keyset = map.keySet(); //중복을 허용하지 않기에 set
		Collection valueSet = map.values(); // 중복을 허용하기 때문에 set으로 주지않는다. 리턴타입이 컬레션이어서 
		
		
	}
	
class Entry{
	Object key;
	Object value;
}

}
