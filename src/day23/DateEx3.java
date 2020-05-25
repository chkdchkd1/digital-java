package day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx3 {

	public static void main(String[] args) {
		// p.546 날짜를 내가 지정한 형태의 문자열로 변환하는 코드  ex) 2020년 5월 25일 . 2020-05-25
		
		Calendar date = Calendar.getInstance(); //캘린더를 이용하면 date.add()를 쓸 수 있다.
		date.add(Calendar.DATE, -7);
		Date today = date.getTime(); //
	
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(format.format(today));
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
		System.out.println(format.format(today));

		
	}

}
