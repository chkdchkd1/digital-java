package day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문자를 10번 입력받아 입력받은 문자를 10번 출력 하세요 단 소문자 q입력 하면 문자 출력대신 종료합니다가 출력 되로록 수정하세요. 
		 그리고 q를 입력하면 더이상 반복되지 않도록 수정하세요 (string은 참조 변수라 == 를 쓸 수 없다.) */
		/* 문자를 입력 받아 출력하는 과정을 q가 입력 될때까지 반복(~할때 까지 반복: 무한루프)하세요 */
		
		String sch ;
		//char ch;
		Scanner scan = new Scanner(System.in);
		for(;;) { 		
			System.out.print("문자를 입력하세요 : ");
			 sch = scan.next();
			//ch = scan.next().charAt(0);
		 if (sch.equals("q")) { 
			 System.out.println("종료합니다.");
			 	break;
		 }else {
			 System.out.printf("입력받은 문자 >> %s \n" ,sch);  
		 } 
		 }
		 
		 scan.close();
	}
		
	
	
}


	