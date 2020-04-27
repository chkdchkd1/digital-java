package day7;



public class methodEx4 {

	public static void main(String[] args) {
		
		

		printMultipleTable(3, 1, 11);
		System.out.println("-------------------------------");
		int num = 3, start = 10, end = 20;
		
		int res = printMultipleTable1(num, start, end);
		if (res == 0){ System.out.println("0단의 모든 값은 0입니다.");
		}else if(res == -1 ) {System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다 ");
		}

		/*
	 	if (printMultipleTable1(2, start, end) == 0) {
			System.out.println("0단의 모든 값은 0입니다.");
		}else if (printMultipleTable1(2, start, end) == -1) {
			System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다 ");
		} */
	 	
		//printMultipleTable 출력하고 0 인지 -1인지 보는거지 0 이고 -1로 나오는게 아니다 ..? 그래서 위단을 그냥 쓰면 if문에 걸리지않는다면 단이 두번 출력됨. 출력하고 0인지 1 인지 따지는거라서 
		
	}
	
	/* 기능 :num이 주어지면 주어진 num단(구구단)을 출력하는 메서드 (한단만) - 
	 * 매개변수 : 정수 , 단의 끝 = > int num, int start, int end -> 재사용이 높음 단순히x9 까지 하는게 아니라 내가 지정하는 단까지 할 수 있음. 따로 매서드 코드를 새로 짤 필요 없이 
	 * 리턴타입 : void - 출력만 하는거니까..? 
	 * 메소드명 : printMultipleTable
	 */
	public static void printMultipleTable(int num, int start, int end) {
		for(int i = start; i<=end; i++) {
		System.out.printf("%d x %d = %d\n", num, i, num*i); 
		} 
	}
		
		/*  기능 :num이 주어지면 주어진 num단(구구단)을 출력하는 메서드 (한단만),  또한 리턴값을 이용하여 예외처리까지 신경쓰는 예제
		 * 매개변수 : 정수 , 단의 끝 = > int num, int start, int end -> 재사용이 높음 단순히x9 까지 하는게 아니라 내가 지정하는 단까지 할 수 있음. 매서드 코드를 새로 짤 필요 없이 
		 * 리턴타입 : 0 = > 0단이 입력됨=> 출력안함 
		 * 		   1=> 정상출력 
		 * 		  -1=> start > end 경우 => 출력안함 
		 * 		    > > 정수형 int (boolean을 쓰지 않는 경우 출력 & 출력안함의 두경우 이지만 왜 안되는지 모르기때문에(이유를 알려주기위해) 정수형 int로써서 나누는것) 
		 * 메소드명 : printMultipleTable
		 */
		public static int printMultipleTable1(int num, int start, int end) {
			if (num == 0)
				return 0;
			if (start > end )
				return -1;
			for(int i = start; i<=end; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i); 
			} 
			return 1; //출력이 다 됐다는건 정상출력 
		}
	
	
	




}
