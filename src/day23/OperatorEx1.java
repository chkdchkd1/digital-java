package day23;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		/*정수 num가 짝수이면 true를 홀수이면 false를 출력하는 코드를 조건문 없이 작성해보세요 
		 * 예) 4
		 * 4는 짝수입니까? true
		 * 예) 5
		 * 5는 짝수입니까? false */
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + "는 짝수입니까?" + (num%2 == 0));  //마지막에 오는게 조건식이라 true,false로 나온다
		
		int nu = 10;
		int res = ++nu + nu++ + ++nu;
		System.out.println(res);
		// ++nu = 11, nu++ = 11 이지만 다음으로 넘어갈땐 12로 넘어감 ++nu = 13 
		
		int [] arr = new int[10];
		int num2 = 5;
		int num3 = arr[num2++]; // num3에 저장되는 값은 배열 arr의 몇번지 인가? = 5번지, 저장하고 증가하기때문에  
	}

}
