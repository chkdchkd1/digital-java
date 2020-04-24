package day6;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* a
		   ab
		   abc
		   abcd */  // ~까지 의 부등호는  '<=' 이다. 
		
		int num = 5;
		for(int i = 0; i<5; i++) { 
			for(int j=0; j<=i; j++) { 
				System.out.print((char)('a'+j)); 
				/* 문자 상수 a + 상수 1을 하면 자료형변환이 일어나지 않고 더해지기 때문에 결과가 문자 b가 나오면 바로 문자형 변수 ch에 저장이 가능하다 */
			} 
			System.out.println(); 
		}
		char ch = 'a'+1 ; 
		// 문자 + 상수는  상수 더하기 상수로 인식 자료형변화 필요X ()
		 //ch = ch + 1 ; 
		 //변수 더하기 상수는 자료형변화를 해서 int로 바꿈  
	    //ch = (char)(ch + 1); 로 해주어야 
		System.out.println((char)(ch+1));
		
	
		/* 3 , 5 를 입력하면 = (앞이 줄수, 뒤에가 한줄에 출력 되어야할 값 
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 */
		
		
		int row , col = 0;
		Scanner sca = new Scanner(System.in); 
		System.out.print("정수 1 를 입력하세요 : "); 
		row = sca.nextInt();	 
		System.out.print("정수 2 를 입력하세요 : "); 
		col = sca.nextInt();
		
		for(int i = 1, cnt = 1 ; i<=row; i++) { 
			for(int j=1; j<=col; j++) { 
				// 공식 활용 System.out.printf("%2d", col * (i-1) + j); 
				System.out.printf("%2d", cnt++); 
		//print으로 하면 줄바꿈이 들어가기 때문에 , 줄바꿈을 하면 위로 다시못올라감 		
			} 
			System.out.println(); 
			
		
		

	}
}

}
