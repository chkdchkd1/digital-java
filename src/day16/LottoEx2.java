package day16;

import java.util.*;

public class LottoEx2 {
	
	public static void main(String[] args) {
		/* 1. 중복되지 않은 랜덤한 수 6개를 배열에 저장하고 중복되지 않은 랜덤한 수 1개를 변수에 저장한다. (보너스 번호를 구분하기 위해서) (1~45)
		   2. 중복되지 않은 랜덤한 수 6개를 배열에 저장 (1~45) : 자동 생성 
		   3. 맞춘 갯수를 체크한다 + 보너스 번호가 맞는 체크 
		   4. 맞은 갯수와 보너스 번호 맞는지 여부에 따라 등수를 출력한다 */
	
	
		HashSet<Integer> lotto = new HashSet<Integer>(); //당첨번호 
		HashSet<Integer> auto; //두가지 방법으로 해보기위해서 new를 쓰지 X 것일뿐
		int min = 1, max = 45;		
		int bonus = 0;		
		try {
			auto = createRandomSet(min, max, 6);
			createRandomSet(min, max, lotto, 6); //hashset은 배열처럼 length를 통해서 길이를 알수 없기에 외부에서 몇개 만드세요 라고 알려주ㅓ야함 
			
			bonus = min-1; 
			while(true) {
				bonus = random(min, max);
				if(!lotto.contains(bonus)) { //set에서 자체적으로 제공하는 contains 
					break;
				}
			}
			

			printSet(lotto);
			System.out.println("보너스 : " + bonus );
			printSet(auto);
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
	
	
		
	/* 기능1 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 배열의 갯수만큼 저장하는 메소드 
	 * 기능2 : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 cnt개 만들어서 배열에 저장하여 배열을  반환하는 메소드
	 * 매개변수1 (외부에서 알려줘야하는것 ) : 최소값과 최대값 , 배열(배열의 길이는 .length가 있으니까 알려줄 필요가 없다) => int min, int max , int arr[]
	 * 매개변수2 : 최소값, 최대값, 갯수 => int min, int max, int cnt
	 * 리턴타입1 : void? (매개변수가 참조변수면 원본값도 변하기에 따로 안넘겨줘도 된다, 일반변수는 매개변수로 들어오면 원본값이 변하지 않음 )  
	 * 리턴타입2 : 배열 => int []
	 * 메소드명 : createRandomArray*/
	
	public static void createRandomSet(int min, int max, HashSet<Integer> lotto, int cnt) throws Exception {
		if(lotto == null) throw new NullPointerException("예외 : 빈배열입니다.");  //runtime exception은 코드상은 에러가 안남 그래서 throws 안넘겨줘두 ㄱㅊ
		if(cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다 ");
		while (lotto.size() < cnt) {
			int r = random(min,max);
				lotto.add(r);
			}
		}
	
	
	public static HashSet<Integer> createRandomSet(int min, int max, int cnt) throws Exception{
		if( cnt > max-min+1)
			throw new Exception("예외 : 랜덤한 수의 범위보다 배열의 크기가 큽니다 ");
		HashSet<Integer> set = new HashSet<Integer>();
			while (set.size() < cnt) {
				int r = random(min,max);
				//	if(!set.contains(r)) { //set에서 제공하는 contains를 쓴다 contains 메소드를 쓰는게 아니라 .. but set은 자체적으로 중복을 걸러주기에 필요없다 
					set.add(r);
				}
			return set;	
		}
	
	
	public static void printSet(HashSet<Integer> lotto) {
		
		for(Integer tmp : lotto) { // int tmp 보다 Integer가 안정적임 int일때 null값이 들어가면 exception이 발생 하기때문에 null값을 넣을 수 있는 Integer 가 더 ㅇㅇ 
			System.out.printf("%2d ",tmp);
		}
	}
	
	/* 기능 : 당첨번호를 기준으로 자동생성된 번호가 몇등인지 알려주는 메소드 (꽝 -1)
	 * 매개변수 : 당첨번호, 자동생성번호 => int []lotto, int bonus, int []auto
	 * 리턴타입 : 등수 => 정수 
	 * 메소드명 : rank
	 * */
	public static int rank(HashSet<Integer> lotto, int bonus, HashSet<Integer> auto) {
		int sameCnt = 0;
		for(Integer tmp:lotto) {
			if(auto.contains(tmp)) {
				sameCnt++;
			}
		}
		switch(sameCnt) {
		case 6: return 1;
		case 5:
			return auto.contains(bonus)? 2 : 3; // 물음표 앞에 조건식이 참이면 2 거짓이면 3  
			// if(auto.contains(bonus)) return 2; 
			//return 3;
		case 4: return 4;
		case 3: return 5;
		}
		return -1;
	}
	

}
