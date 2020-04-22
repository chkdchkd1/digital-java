package day4;

public class TestEx3 {

	public static void main(String[] args) {
		/* 1. 정수 10개 짜리 배열에 값을 랜덤으로 생성하여 저장하고 (중복 o) 
		 * 저장된 배열 값중에서 가장 큰값과 가장 작은 값을 출력하는 코드를 작성하세요*/
        
		int arr [] = new int [10];
		int rmax = 20;
		int rmin = 1;
		int max, min = 0  ; 
	
		for(int i = 0;i<arr.length;i++) {
			int random = (int)(Math.random()*(rmax-rmin+1))+rmin;
			arr[i] = random;
		}
		
		for (int tmp : arr) {
			System.out.printf("%2d ",tmp);
		
		}
		
		System.out.println();
		
		min = max = arr[0]; //저장을 해주고 시작 
	    for (int i = 1;i<arr.length;i++) {
				if(max < arr[i]) {
					max = arr[i] ;
				}	
				if(min > arr[i]) {
					min = arr[i];
				}
			}
	    				
	    System.out.printf("배열의 최대값 : %d, 최소값 : %d\n", max, min);
				
				
			
	
			
		}
			
		
		
	}

