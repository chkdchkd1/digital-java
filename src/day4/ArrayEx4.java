package day4;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 배열에 임의의 수 넣는 예제
		int arr[] = new int [3];
		int max = 9;
		int min = 1;
		
		// 임의의 수를 생성하여 배열에 저장 (중복 가능)
		for(int i = 0;i<arr.length;i++) {
			int random = (int)(Math.random()*(max-min+1))+min;
			arr[i] = random;
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		int arr2[] = new int [4];
		
		// 임의의 수를 생성하여 배열에 저장 (중복  X )
		// 중복되지 않아야 하므로 3번이상 돌릴 수 도있으므로 
		int cnt = 0 ; //배열에 저장된 랜덤 수의 갯수 
		while(cnt < arr2.length/*생성된 배열에 저장된 임의의 수의 갯수가 3보다 작을 때 = 해당배열의 길이보다 작을때 */) {
			// 생성된 랜덤수(random)  : 1 1 2 9
			// 배열에 저장된 갯수 (cnt) : 1   2 3
			// 저장된 배열의 값    (arr2) : 1 2 9
			int random = (int)(Math.random()*(max-min+1))+min;
			int i = 0; //i는 반복문 체크를 위한 것
			while(i<cnt) {
				if(random == arr2[i]) {
					break;
				}
				i++; //
			}
			if(i == cnt ) {
				arr2[cnt] = random;
				cnt++;
			}
			
			
			/* 배열의 0번지부터
			 *  배열에 저장된 랜덤 수의 갯수 (cnt) -1 번지까지 = cnt-1 까지 중복된지 확인 => i<cnt( i는 0에서 시작하니  0 ~ cnt 전수니까 같은 의미 )
			 *   = cnt가 1 일 경우 : 1 -1 = 0 이니까 0번지만 확인하면 됨 => 0<1  = 0번지만확인 ㅇㅇ 같은 의미 i가 증가한건 그전꺼는 중복확인이 되어서 넘어가도 된단 소리 
			 *   중복여부 체크하여 중복되지 않으면 배열에 랜덤수를 저장하고 배열에 저장된 랜덤수의 갯수를 1 증가  (cnt++;)
			 */
			 
			
		}
		
		for(int tmp : arr2) {
			System.out.print(tmp + " ");
		}
		
			
		

	}

}
