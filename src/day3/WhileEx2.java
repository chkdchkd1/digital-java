package day3;

public class WhileEx2 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요
		* 최소 공배수 : 두수의 공배수 중 가장 작은 공배수 
		* 배수 : 두수의 배수 중 공통인 배수 
		* 10의 배수 : 10 20 30 40
		  15의 배수 : 15 30 45 60
		  10과 15의 공배수 : 30 60 90 ....
		  10과 15의 최소 공배수 : 30
		  1. 반복 횟수 i는 num1*num2까지 1씩 증가
		  2. 규칙성 : i가 num의 배수이고 i가  num2의 배수이(면 if) i를 출력하고 반복문을 종료
		   // num가 6의 배수이면 num%6==0 , 
		   // 2는 4의 약수이다. 4는 2의 배수이다 = 4%2=0 
		  3. 반복문을 종료 후 : 없음  */
		
		int i = 1;
		int num1 = 5, num2 = 100000;
		int cnt = 0;
		while(i<=num1*num2) { 
		cnt++;
		 if ( i % num1 == 0 && i % num2 == 0) {
			 System.out.printf("%d 와 %d 의 최소 공배수는 %d이다. 반복횟수는 %d\n", num1,num2,i,cnt );
			 break;
		}
		 i++; 
			
		}
		
		/*위 예제는 i가 1부터 시작해서 최소 공배수를 구하기 때문에 최소 공배수가 큰 경우 반복 횟수가 많아진다.
		 * 그래서 아래처럼 i를 num1 부터 시작하며 num1의 배수로 한다면 반복횟수가 줄어든다 
		 */
		
		i=num1;
		cnt = 0;
		while(i<=num1*num2) { 
			cnt++;
			 if (i % num2 == 0) {
				 System.out.printf("%d 와 %d 의 최소 공배수는 %d이다. 반복횟수는 %d\n", num1,num2,i,cnt );
				 break;
				 }
			 i+=num1; 
			//이 ㅇㅖ제는 이미 i+=num1이 num1의 배수라는 뜻을 가지고 있기때문에 조건식에서 i % num1 == 0를 할 필요가 없다 
				
			}
		
			
		if(num1 < num2 ) { 
			int tmp = num1 ;
			num1= num2;
			num2 = tmp;
		}
		i=num1;
		cnt = 0;
		while(i<=num1*num2) { 
			cnt++;
			 if (i % num2 == 0) {
				 System.out.printf("%d 와 %d 의 최소 공배수는 %d이다. 반복횟수는 %d\n", num1,num2,i,cnt );
				 break;
			}
			 i+=num1; 
			 // 위의 예제는 최소 공배수를 구하는데 있어서 두수 중 큰수가 최소 공배수일 확률이 높으므로 
			// 큰수로 먼저 계산하는 것이 효율이 좋다. 그래서 두수중 큰수를 num1로 교환 

		}
	}

}


