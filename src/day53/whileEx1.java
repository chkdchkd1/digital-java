package day53;

import java.util.*;

public class whileEx1 {

	public static void main(String[] args) {
		// while문을 이용하여 구구단 9단을 출력하는 코드를 작성하세요
		
		
		int num = 9;
		int i = 1;
		while(i<10) {
			System.out.printf("%d x %d = %d\n",num,i,num*i);
			i++;
		}
		
		

	}

}
