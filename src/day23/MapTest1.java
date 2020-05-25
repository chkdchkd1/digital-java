package day23;

import java.util.*;

public class MapTest1 {

	public static void main(String[] args) {
		/* 카페 등급을 프론트에서 요청을 하면 서버에서 해당 카페 등급에 맞는 카페 리스트와 카페 등급을 프로튼로 보내려한다. 
		 * 이때, 카페 등급 : 정수이고 카페 이름은 String 이고 카페 리스트는 List<String>이다.
		 * 데이터를 요청하는데 자료형이 다 다를때 , 변수명을 써줄때? */

		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cafe grade", new Integer(1)); //카페 등급이 1등급 
		List<String> list = new ArrayList<String>(); 
		list.add("네이버 카페1");
		map.put("cafe list", list);
		}

}
