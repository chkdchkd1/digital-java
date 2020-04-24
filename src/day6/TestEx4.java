package day6;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여 0번지에는 0을 1번지에는 1을 넣도록 작성하세요. 
		그리고 배열의 값을 출력하여 제대로 들어갔는지 확인하세요 */ //int arr[] = int 타입의 배열 이란소리 
		
		int arr[] = new int[5]; //배열의 값을 0번지부터 마지막까지 접근하는 반복문
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();

		printArray(arr); // 위에 만들어진 arr를 말하는 거임 
		
		 /* 0번지에 0을 1번지에 1을 .. 4번지에는 4가 저장 되도록 작성하세요.*/
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		} 
		System.out.println();
		printArray(arr);
	
		
		System.out.println();
		/* num에 1을 저장 후 num의 값이 arr에 있는지 없는지 확인하여 있으면 있습니다. 없으면  없습니다. */
		int num = 6;
		if(isDuplicated(arr, num)) {
			System.out.println(num + "는 있습니다.");
		}else {
			System.out.println(num + "는 없습니다.");
		}
		
		/*for(int i=0;i<arr.length;i++) {
		if (num == arr[i]) {
			System.out.println(num + "은 배열에 있습니다");
			break;
		}if (i==arr.length-1) { 
			System.out.println(num + "은 배열에 없습니다");
		} */
		/* 배열에 해당 숫자가 있으면 for문을 빠져나갔어야 했는데 없으니까, 배열의 번지(i)가  마지막 번지(arr.length-1) 까지 온거임
		 *  = 마지막 번지까지 중복된 배열이 없다는 의미  또한 if- else를 쓰지 않는 이유는 num == arr[i]때가 될때까지 else가 실행되기 때문임 왜냐면 위에 조건식이 참이 아니면 무족건 실행하게 되어있기에
		 *  arr.lenght 까지 또는 중복된 수를 찾기 전까지 계속 나옴.. 그래서 조건식이 맞지 않으면  쓰루 할 수 있게 if 또는 else if를 써주어야함 */
	}
		

	
	/* 1) 기능 : 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드
	 * 매개변수 : 배열 => int arr1[]
	 * 리턴타입 : X = 돌려주는 반환하는 말이 있어야 쓸 수 있음 , 활용하는게 아니라면 , 단순 출력이라면 다시 알려줄 필요 없다. 메인이 이미 알고 있는 값 / 나한테 시킨다고 생각해보기 
	 * 만약에 나보고 출력하라고 하면 출력하면 끝이지 출력하고 나서 메인에게 알려줄 필요 없음 ㅇ ㅇ => void
	 * 메서드명 : printArray.*/
	
	public static void printArray(int arr[]) {

		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
	}
	
	/* 2) 기능 : 배열 arr에 정수 num의 값이 있는지 없는지 확인하는 메서드 (문제를 잘읽어서, 출력한다는 말이 없으면 X ) 
	 *    매개변수 : 배열, 정수 
	 *    리턴타입 : 값이 둘 중 하나면 , 있는지 업는지 확인(참, 거짓) 하는거니까 => boolean..?
	 *    매서드명 : isDuplicated */
	
	public static boolean isDuplicated (int[] arr, int num) {
		int i;
		for(i=0;i<arr.length;i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		return false;
			 //배열이 생성되지 않았을 때 비교할 값이 없어서 위에 for문이 실행되지 않고 바로 종료. 
	}
}

/* 출력값은
 * 0 0 0 0 0 
0 0 0 0 0 
0 1 2 3 4 
6는 없습니다. */


