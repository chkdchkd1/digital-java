package day13;

import java.util.Scanner;

public class Homework2_1 {

	public static void main(String[] args) {
		// 클래스를 활용해서 정보를 묶어서 사용 
		
		int size = 50;
		Product product[] = new Product[size];
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
				String name = scan.next();
				System.out.print("가격 : ");
				int price = scan.nextInt();
				product[cnt] = new Product(name, price);
				cnt++; 
			}
		}
		// 반복문 끝내고 제품 리스트를 출력 
		for(int i = 0; i<cnt; i++) {
			product[i].print(i+1); //Product 클래스의 멤버 메소드 print를 실행 -> 같은 패키지내 다른 클래스에서도 활용가능 
			// print(product[i], i+1); 이건 다른데 활용하려면 또 그곳에서 또 같은 메서드를 만들어야한다 . 
			scan.close();
		}
		
		
	}
	
	public static void print(Product product, int num) {
		System.out.printf("%d. 상품명 : %s, 가격 : %d원\n" , num, product.getName(), product.getPrice());
	} //product 클래스에서는 정보를 다 알고 있기에 매개변수가 필요 없지만 메인에서는 정보를 알수 없기 때문에 매개변수가 필요하다 . 

}

class Product{
	private String name;
	private int price;
	
	public Product() {}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.printf("상품명 : %s, 가격 : %d원\n" , name, price);
	}
	
	public void print (int num) {
		System.out.print(num + ". ");
		print(); //
		
	}
	
}
