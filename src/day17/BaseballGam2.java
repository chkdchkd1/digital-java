package day17;

import java.util.*;

public class BaseballGam2 {

	public static void main(String[] args) {
		// 코드를 짤 때 프로그램 돌아가는 순서 이렇게 서술해보기 
		 //숫자야구 
		 // 1) 꼭 필요한 데이터를 저장할 공간 설정
		 //  1-1 : 컴퓨터가 생성한 랜덤한 수를 저장하는 리스트 = com 
		Scanner scan = new Scanner(System.in);
		List<Integer> com = new ArrayList<Integer>();	
		 // 1-2 : 사용자가 입력한 수를 저장하는 공간 = user
		ArrayList<Integer> user = new ArrayList<Integer>();	
		int size = 3;
		int min = 1, max = 9;
		 // 2) 중복되지 않는 랜덤한 수 3개를 com에 저장 
		com = createRandomList(min,max,size);  //바로 = 로 하는게 아니라 return 값으로 던져주는건 괜찮ㄷ ㅏ ..? 
		System.out.println(com); //toString을 통해서 바로 출력 가능 print 메소드 없이도 ㅇㅇ 
		 //	3) 사용자가 세수를 입력하여 맞출때 까지 반복 
		 // 	3-1 : 스트라이크 개수가 3개 될때까지 반복 
		int strike = 0, ball = 0;
		while (strike!=size) {
			 //     3-2 : 정수 세개를 입력받아 중복된 내용이 있으면 다시 입력받게 함 
			user.clear();
			// 중복된 숫자가 있는경우 
			if(!insertUser(scan, size, min, max, user)){
				System.out.printf("입력한 숫자중에 중복된 숫자가 있거나 입력된 숫자가 " + "%d ~ %d 사이의 숫자가 아닙니다. \n", min ,max);
				continue;
			}
			System.out.println(user);
			// 3-3 : 스트라이크와 볼을 판별 
			strike = 0;
			ball = 0;
			for(int i = 0; i < com.size(); i++) {
				//스트라이크의 갯수 판별 
				if(com.get(i) == user.get(i)) {
					strike++;
				}
				//스트라이크 + 볼의 갯수 판별 
				if (com.contains(user.get(i))){
					ball++;
				}
			}
			ball = ball -strike;
			// 3-4 : 판별한 스트라이크와 볼을 이용하여 결과 출력
			if(strike != 0) {
				System.out.println(strike + "S ");
			}
			if(ball != 0) {
				System.out.println(ball+ "B");
			}
			if(strike == 0 && ball == 0) {
				System.out.println("30");
			}
			System.out.println();
		}
		System.out.println("정답입니다. ");
						 
	}
		
			
	public static int random(int min, int max) {
		if(max < min)
			throw new ArithmeticException("예외발생 : 최대값과 최소값의 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
	
	  /*기능 : min ~ max 사이의 중복되지 않은 랜덤한 3개의(size) 숫자를 만들어서 list에 저장하여 반환하는 리스트 
	 * 매개변수 : 만들어아야 하는 숫자 개수, 랜덤한 수의 범위 => int size, int min, int max
	 * 리턴타입 : 랜덤한 수가 저징된 리스트 => List<Integer>  
	 * 메소드명 : createRandomList 
	 * 같은 클래스 메소드 여야지 메인에서 객체 생성없이 쓸 수 있다 . = 같은 클래스 안에 있기에 그냥 이름으로 막 메소드 호출하면 됨. ex) 밑에서 메소드도 랜덤메소드를 그냥 이름으로 호출하는것처럼
	 */
	
	public static List<Integer> createRandomList(int min, int max, int size) {
		if(size > max-min+1)
			throw new ArithmeticException("예외발생 : 랜덤범위 보다 만들어야하는 개수가 더 많습니다.");
		List<Integer> list = new ArrayList<Integer>();	
		while(list.size()< size) {
			int r= random(min,max);
			if(!list.contains(r))
				list.add(r);
		}
		return list;
		}
	
	/* 기능 : 스캐너를 통해 정수를 size개 입력받아 입력받은 정수가 min~max 사이이고 중복 되지 않으면 리스트에 저장한후 리스트 생성여부를 알려주는 메소드
	 * 매개변수 : 스캐너, 최소값, 최대값, 리스트  => Scanner, int min, int max, List<Integer> user, int size 
	 * 리턴타입  : boolean
	 * 메소드명 : insertUser*/
 
	public static boolean insertUser(Scanner scan, int size, int min, int max, List<Integer> user) {
		
		int i = 0;
		System.out.println("중복되지 않는 숫자 3개를 입력하세요 (1~9) : ");
		while(i++ < size) { //0인 상태로 넣고 1 증가해서 비교 (후위연산자, 저장하고 증가한다)
			user.add(scan.nextInt());				
		}
		i=0;
		List<Integer> tmpList = new ArrayList<Integer>();
		while(user.size()!=0) {
			int tmp = user.remove(0); //remove는 값을 제거하고 제거한 값을 알려준다 
			//입력된 수가 min보다 작거나 max 보다 크거나 중복이 되면 
			if(tmp < min || tmp > max || user.contains(tmp)) {
				return false;
			}
			tmpList.add(tmp);
		}
		// user = tmpList; 이렇게 작성하면 원본에 tmpList값이 추가되지 않음 
		user.addAll(tmpList); // tmpslist값을 user에 추가하는것 
		return true;
		
	}
}

