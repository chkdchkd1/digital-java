package day13;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/* 
 	상품을 등록하고 등록된 상품을 출력하는 코드를 작성하세요 (<- 이걸 배열을 활용) 
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
		//하나의 변수를 사용하면 가장 마지막에 입력한게 출력된다. 그래서 여러개 를 저장하려면 배열을 써야 한다 . 
		
		int size = 50;
		String [] productName = new String [size];
		int [] productprice = new int[size];
		char menu = 'y';
		Scanner scan = new Scanner(System.in);
		int cnt = 0; //현재 저장된 제품의 갯수 
		//1. 반복문
		while ( menu != 'n') {
		//2. 입력을 받음 (y/n)
		System.out.print("상품을 등록하겠습니까? (y/n) : ");
		menu = scan.next().charAt(0);
		//3. 입력받은 값을 통해 제품 리스트를 출력할지 제품을 등록할지 를 결정 
			if(menu == 'y') {
				//제품을 등록
				System.out.print("상품명 : ");
				productName[cnt] = scan.next();
				System.out.print("가격 : ");
				productprice[cnt] = scan.nextInt();
				cnt++;
			}
		}
		// 반복문 끝내고 제품 리스트를 출력 
		for(int i = 0; i<cnt; i++) {
			System.out.printf("%d. 상품명 : %s, 가격 : %d원\n" , i+1, productName[i], productprice[i]);
			scan.close();
		}
	}

}
