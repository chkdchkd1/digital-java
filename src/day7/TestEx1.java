package day7;

public class TestEx1 {

	public static void main(String[] args) {
		// 와 개졸려  (숫자야구 ) 
		
		int size = 3;
		int com[] = new int [size];
		int min = 1 , max = 9;	
		cearteArray(min, max, size, com);
		printArray(com);
		//반복 시작 (3S가 나올때 까지 )		
		//사용자가 세수를 입력 
		

		//스트라이크 판별 (메소드)
		
		//볼을 판별 (메소드)
		
		//3아웃을 판별 (메소드로 만들 필요 X ) 
		//반복끝
	}
	
	/* 기능 : min에서 max사이의 중복되지 않는 n개의 랜덤값을 생성하여 저장하는 메서드
	 * 매개변수 : MIN에서 max n개의 배열 =>int min, int max, int n, int arr[]; 
	 * 리턴타입 : 기능만 보면 없지만 예외 처리를 위해서 1이면 배열 => true면 배열 생성
	 *  		0 이면 배열 생성 실패 =>  false 이면 배열 생성 실패  => boolean
	 *  		예를 들면 min=1, max =3 이고 n=4인 경우 ,min~max 사이의 중복되지 않은 랜덤한 수는 총 3개인데 
	 *  		4개를 만들어야 하니 1개를 만들 수가 없어 무한 루프에 빠진다.
	 *  		번지 0 1 2 3 4 
	 *  		값  1 3 2 
	 *  		r 1 3 1 3 1 2
	 *  max - min + 1 >=n 이면 배열 생성 가능, 아니면 생성 실패 
	 * 매서드명 : createArray
	 */
	public static boolean cearteArray ( int min, int max, int n, int arr[]) {
		if(arr == null)
		return false; 
		if(max - min +1 < n)
		return false;
		int cnt = 0; // 현재 배열에 저장된 원소의 갯수 
		while (cnt < n) {
			int r = random(min, max);
			if(!isDuplicated(arr, r)){
				//arr[cnt++] = r; // 아래 두줄을 합친 코드 
				arr[cnt] = r; 
				cnt++;
			}
		}
		return true;
	}
	
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		int ran =  (int)(Math.random()*(max-min+1))+min;
		return ran;
	}

		public static void printArray(int arr[]) {

			for(int tmp : arr) {
				System.out.print(tmp+" ");
			}
			
		}
		
		public static boolean isDuplicated (int[] arr, int num) {
			int i;
			for(i=0;i<arr.length;i++) {
				if (num == arr[i]) {
					return true;
			}
		}
			return false;
		}
			
		
}
