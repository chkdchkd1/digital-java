package day53;

import java.util.*;

public class forEx1 {

	public static void main(String[] args) {
		// for문을 이용하여 구구단 9단을 출력하는 코드를 작성하세요.
		
		int num = 9;
		for(int i=1;i<10;i++) {
//			System.out.println(num+"X"+i+"="+num*i);
			System.out.printf("%d x %d = %d\n",num,i,num*i);
		}
		
		
	}

}
