package day6;

public class MethodEx3 {

	public static void main(String[] args) {
		// 메서드의 매개변수가 일반변수이면 매개변수의 원본값이 변경되지 않는다. 파일을 복사해서 불러서 쓰는 것이기 때문에 복사한 파일을 수정해도 원본에 영향 X
		// 밑 예제로 따지면 메서드 매개변수의 값은 메서드 쓸때만 사용되고 다시 num1,num2를 부르면 기존에 선언했던 값이 나온다 .
		
		int num1  = 10, num2 = 20;
		System.out.printf("num1 = %d , num2 = %d(main)\n", num1, num2);
		swap(num1,num2);
		System.out.printf("num1 = %d , num2 = %d(main)\n", num1, num2);
		
		int arr[] = new int[4];
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		/* 매개변수가 참조 변수이면 매개변수의 원본값을 바꿀 수 있다. 이때 복사하는건 파일을 복사하는것이 아니라 바로가기를 만들어서 쓰는것 */
		setArray(arr,5);
		
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
	}
		
		
	public static void swap(int num1, int num2){
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.printf("num1 = %d , num2 = %d(swap)\n",num1,num2);
	}
	
	/* 기능 : 배열의 모든 값을 num로 변경하는 메서드 */
	public static void setArray(int []arr, int num) {
		for(int i = 0; i< arr.length;i++) {
			arr[i] = num;
		}
		
	}
		

}
