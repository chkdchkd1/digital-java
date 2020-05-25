package day23;

import java.util.*;

public class DateEx1 {

	public static void main(String[] args) {
		// p.533
		Calendar date = Calendar.getInstance(); //객체 1 만들고
		date.set(2020, Calendar.MAY, 5); 
		// Month value is 0-based. e.g., 0 for January
		// 달은 0~11까지 입력하기 때문에 5월을 입력하거나 Calendar.MAY를 입력.  Calendar.MAY는 상수 4를 의미 
		
		System.out.println(toString(date));
		date.add(Calendar.DATE, -14);
		//date.add(5, -14);
		System.out.println(toString(date));
		date.add(Calendar.DATE, 14);
		System.out.println(toString(date));
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "-" +
				((date.get(Calendar.MONTH)+1) <10? "0":"") +
				(date.get(Calendar.MONTH)+1) + "-" +
				((date.get(Calendar.DATE)) <10? "0":"") +
				date.get(Calendar.DATE);
				
	}

}
