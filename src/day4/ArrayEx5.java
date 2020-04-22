package day4;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 배열의 내용을 정렬하는 예제 (앞뒤 

		int arr [] = new int [14];
		int rmax = 100;
		int rmin = 1;
	
		for(int i = 0;i<arr.length;i++) {
			int random = (int)(Math.random()*(rmax-rmin+1))+rmin;
			arr[i] = random;
		}
		
		for (int tmp : arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();
		System.out.println();
		
		// 37 5 14 2 41 15 31 42 85 51
		// 5 14 2 37 15 31 41 42 51 85
		// 5 2 14 15 31 37 41 42 51 85
		for(int i = 0; i < arr.length-1;i++) {
			//9번 돌리면 한자리는 자동으로 확정되기 때문에 10번까지 돌릴필요 X
			for(int j = 0; j<arr.length-1-i;j++) {
				//시작이 0 부터이고 마지막 10번지가 없기때문에 -1 빼주는것  (앞뒤로 비교했을때 9번만 하면됨 )
				// -i를 한바퀴씩 돌때마다 확정 된것을 빼주기 위해 
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			for (int tmp : arr) {
				System.out.printf("%3d ",tmp);
			}
			System.out.println();
		}
		
		
	}
}

