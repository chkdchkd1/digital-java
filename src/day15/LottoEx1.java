package day15;

import java.util.Random;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1. 중복되지 않은 랜덤한 수 6개를 배열에 저장하고 중복되지 않은 랜덤한 수 1개를 변수에 저장한다. (보너스 번호를 구분하기 위해서) (1~45)
		   2. 중복되지 않은 랜덤한 수 6개를 배열에 저장 (1~45) : 자동 생성 
		   3. 맞춘 갯수를 체크한다 + 보너스 번호가 맞는 체크 
		   4. 맞은 갯수와 보너스 번호 맞는지 여부에 따라 등수를 출력한다 */
	
	
		int lotto[] = new int[6]; //당첨번호 
		int min = 1, max = 45;
		int auto [] = null; // 자동생성
		int bonus = 0;
		int rcnt = 0;
		try {
			auto = createRandomArray(min, max, 6);
			createRandomArray(min, max, lotto);
			
			bonus = min-1; 
			while(!(bonus >= min && bonus <= max )) {
				bonus = random(min, max);
				if(contains(lotto, bonus)) {
					bonus = min - 1;
				}
			}
			

			printArray(lotto);
			System.out.println("보너스 : " + bonus );
			printArray(auto);
			System.out.println();
			int rank = rank(lotto, bonus, auto);
			if (rank != -1) {
				System.out.println(rank + "등 당첨!");
			} else {
				System.out.println("꽝");
			}
					
			//등수 출력하는 코드 
			/* 두개의 배열을 비교한다음에 => 몇개가 같은지 카운트 => 같은거 수별로 조건문 */
			
			
		}  catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
	}

	
	/* 기능 : min과 max가 주어지면 min보다 크거나 같고 max보다 작거나 같은 랜덤한 수를 반환하는 메서드 
	 * 매개변수 : min, max
	 * 리턴타입 : 랜덤한 수 = 정수 = int*/
	
	public static int random(int min, int max ) {
		if (max < min )
			throw new ArithmeticException("예외 : 최소값과 최대값 순서가 바뀌었습니다");
		return new Random().nextInt(max-min+1) + min;
	} // static main 에서 호출 할거면 static을 붙여야 객체 생성 없이 편하게 쓸 수 있다.
	
	/* 기능 : 배열에 정수 num의 값이 있는지 없는지 알려주는 메소드 
	 * 매개변수 : 배열과 정수 = int arr[] , int num
	 * 리턴타입 : boolean
	 * 매소드명 : contains
	 * 배열의 값을 확인할 때는 향상된 for문이 편하다 . tmp가 값을 꺼내서 num과 비교해서 truen false 돌려주기 
	 * 메소드를 만들때는 프로그램 전체로 보지말고 기능만 보고 만들것 ... 최소값 최대값 사이에서 정수 비교 는 프로그램 전체적입장에서 보는것 */
	
	public static boolean contains(int arr[], int num) {
		for (int tmp : arr ) {
			if (tmp == num)
				return true;
			}
		 return false;
			}
		
	/* 기능1 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 배열의 갯수만큼 저장하는 메소드 
	 * 기능2 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 cnt개 만들어서 배열에 저장하여 배열을  반환하는 메소드
	 * 매개변수1 (외부에서 알려줘야하는것 ) : 최소값과 최대값 , 배열(배열의 길이는 .length가 있으니까 알려줄 필요가 없다) => int min, int max , int arr[]
	 * 매개변수2 : 최소값, 최대값, 갯수 => int min, int max, int cnt
	 * 리턴타입1 : void? (매개변수가 참조변수면 원본값도 변하기에 따로 안넘겨줘도 된다, 일반변수는 매개변수로 들어오면 원본값이 변하지 않음 )  
	 * 리턴타입2 : 배열 => int []
	 * 메소드명 : createRandomArray*/
	
	public static void createRandomArray(int min, int max, int arr[]) throws Exception {
		if(arr == null) throw new NullPointerException("예외 : 빈배열입니다.");  //runtime exception은 코드상은 에러가 안남 그래서 throws 안넘겨줘두 ㄱㅊ
		if(arr.length > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다 ");
		int nowCnt = 0;
		while (nowCnt < arr.length) {
			int r = random(min,max);
			if(!contains(arr,r)) {
				arr[nowCnt] = r;
				nowCnt++;
			}
		}
	}
	
	public static int[] createRandomArray(int min, int max, int cnt) throws Exception{
		if( cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다 ");
		int [] arr= new int[cnt];
		int nowCnt = 0;
		while (nowCnt < arr.length) {
			int r = random(min,max);
			if(!contains(arr,r)) {
				arr[nowCnt] = r;
				nowCnt++;
			}
		}
		return arr;	
	}
	
	
	public static void printArray(int []Array) {
		
		for(int tmp : Array) {
			System.out.printf("%2d ",tmp);
		}
	}
	
	/* 기능 : 당첨번호를 기준으로 자동생성된 번호가 몇등인지 알려주는 메소드 (꽝 -1)
	 * 매개변수 : 당첨번호, 자동생성번호 => int []lotto, int bonus, int []auto
	 * 리턴타입 : 등수 => 정수 
	 * 메소드명 : rank
	 * */
	public static int rank(int []lotto, int bonus, int[] auto) {
		int sameCnt = 0;
		for(int tmp:lotto) {
			if(contains(auto, tmp)) {
				sameCnt++;
			}
		}
		switch(sameCnt) {
		case 6: return 1;
		case 5:
			if(contains(auto, bonus)) return 2;
			return 3;
		case 4: return 4;
		case 3: return 5;
		}
		return -1;
	}
	
	/* 	for (int i = 0; i<lotto.length; i++) {
	if (contains(lotto, auto[i])) {
		rcnt++;
		System.out.println(rcnt);
	}  * 위 rank 메소드처럼 로또와 자동생성을 비교할때 난 이렇게 함 */
	
}	

