package day10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 
		 * 상품을 등록하고, 등록된 상품을 출력하는 코드를 작성하세요.
예)
상품을 등록하겠습니까?(y/n) : y
상품명 : 가방
가격 : 10000
상품을 등록하겠습니까?(y/n) : y
상품명 : 마우스
가격 : 1000
상품을 등록하겠습니까?(y/n) : n
지금까지 등록된 상품 리스트
1. 상품명 : 가방, 가격 : 10000원
2. 상품명 : 마우스, 가격 : 1000원
*/ 
		Scanner scan = new Scanner(System.in);
		System.out.print("상품을 등록하겠습니까? (y/n)");
		char answer = scan.next().charAt(0);
		if (answer =='y') {
			System.out.printf("상품명 : ");
			String pname = scan.next();
			System.out.printf("가격 : ");
			int price = scan.nextInt();
			
			
		}

	}

}
