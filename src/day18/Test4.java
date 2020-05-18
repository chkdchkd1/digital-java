package day18;

import java.util.*;


public class Test4 {

	public static void main(String[] args) {
		// 정수 n개를 입력받아 저장하고, 저장된 n개의 정수를 거꾸로 출력하는 코드를 작성하세요.

		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
	
		System.out.print("입력받을 정수의 갯수 : ");
		int size = scan.nextInt() ;
		System.out.print("정수 "+size+"개를 입력하세요 : ");
		for (int i = 0; i<size; i++) {
			int num = scan.nextInt();
			stack.push(num);
		}
		
		Stack<Integer> tmp = new Stack<Integer>();
		tmp.addAll(stack); // pop은 꺼내오는거라서 혹시 나중을 위해 tmp에 백업해놓고 tmp에서 꺼낸다. 
		
		System.out.print("입력받은 정수를 거꾸로 출력 : ");
		for (int i = 0; i<size; i++)
			System.out.print(tmp.pop()+" ");
	

	
		System.out.println();
		List<Integer> list = new ArrayList<Integer>(); //ㅇㅣ거 배열로도 할수있음 int arr1 = new int [size];
		System.out.print("정수" +size+"개를 입력하세요 : ");
		for (int i = 0; i<size; i++) {
			int num = scan.nextInt();
			list.add(num); //list.add(scan.nextInt());로 쓸 수 도 있ㄷ ㅏ
			}
		
		System.out.print("입력받은 정수를 거꾸로 출력 : ");
		for (int i = size-1 ; i>=0;i--)
			System.out.print(list.get(i) + " ");
	
	}
}
