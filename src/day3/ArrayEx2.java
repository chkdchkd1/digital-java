package day3;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열의 복사 예제
		int num1 = 10;
		int num2 = 20;
		num1 = num2;
		System.out.println(num1);
		
		int arr1[] = new int [] {1,2,3,4};
		int arr2[] = new int [] {9,8,7,6};
	
		// arr2[0] = 1;
		/* 아래 코드가 실행 되면 arr1에 있던 배열을 사라지고 
		 * arr1과 arr2가 공유하게 됨 , 주소가 덮혀쓰인것이기에 (참조변수) 
		arr1 = arr2; 
		arr1 == arr2; // 주소가 같다고 하는 것이랑 같음, 배열이 같다는게 아니라 .*/
		
		for(int i =0;i<arr1.length;i++) {
			// 배열 접근할 땐 기본적으로 0부터 시작 
			// arr1[i] = arr2[i];
			int tmp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = tmp;
			// 배열 교환 코드 
			
		}
		
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		for(int i =0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		//System.arraycopy(arr1, 0, arr2, 0, arr1.length); 
		// 원본 arr1(src)를 복사해서 arr2(destpos)에 붙여넣기
		System.arraycopy(arr1, 0, arr2, 1, arr1.length-2); 
		// int arr1[] = new int[4] 일때  arr1[i] = i : 0,1,2,3 이다.
		
		for(int i =0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		for(int i =0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		
	}
	

}
