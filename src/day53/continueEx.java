package day53;

public class continueEx {

	public static void main(String[] args) {
		//  1부터 10까지의 짝수의 합을  continue를 이용하여 작성하세요 
		
		
		int sum = 0;

		for(int i = 0;i<=10;i++) {
			if(i % 2 == 1) {
					continue;
			}

			System.out.print(i);
			sum = sum + i; 
			// sum += i;
			// x += y; x = x + y;.
			}
		System.out.println("1부터 10까지의 짝수의 합"+sum);
		
		
		
		/*while문을  이용한 경우 */
		
		int j = 0;
		sum = 0;
		while(++j<=10) {
			if(j%2==1)
				continue;
			sum += j;
		}
		System.out.println("1부터 10까지의 짝수의 합"+sum);
		
		/* 전위 증감 연산자는 실행문에서 값이 먼저 증가/감소해서 적용됩니다.
			1. int i = 1;  
			2. int j = ++i;
			j = 2 , i = 2 가 된다.
		*/
		
		/*후위 증감 연산자는 실행문에서 값이 후에 증가/감소해서 적용됩니다.
			1. int i = 1;  
			2. int j = i++;
			j = 1 , i = 2 가 된다.
			

*/
	}
}
