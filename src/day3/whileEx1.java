package day3;

import java.util.Scanner;

public class whileEx1 {

	public static void main(String[] args) {
		// while에서 무한 루프 예제 
		// 조건식이 거짓이 될때 까지 블럭내 문장을 반복한다.
		
		/*
		while(true) {
			System.out.println("hi");
		}
		*/
		
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		while(menu !=4) {
			System.out.println("1.메뉴1");
			System.out.println("2.메뉴2");
			System.out.println("3.메뉴3");
			System.out.println("4.종료");
			System.out.println("메뉴를 입력하세요 : ");
			menu = scan.nextInt();
			

		}
		
		scan.close();
		
	}

}
