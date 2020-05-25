package day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx2 {

	public static void main(String[] args) {
		// p.545 날짜를 내가 지정한 형태의 문자열로 변환하는 코드  ex) 2020년 5월 25일 . 2020-05-25
		
		Date today = new Date(); //현재 시간을 기준으로 객체를 생성하고 
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(format.format(today));
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
		System.out.println(format.format(today));

	}

}
