package day7;

public class MethodEx5 {

	public static void main(String[] args) {
		// 주어진 정수가 소수인지 아닌지 알려주는 메서드 + 효율 

		int num = 13;
		if(isPrime(num)) {System.out.println(num+"는 소수 입니다");
		} else {System.out.println(num+"는 소수가 아닙니다 ");
		}
		
		if(isPrime1(num)) {System.out.println(num+"는 소수 입니다");
		} else {System.out.println(num+"는 소수가 아닙니다 ");
		}
		
	}
	
	
	/* 기능 : 주어진 정수가 소수인지 아닌지 알려주는 메서드
	 * 매개변수 : 정수 
	 * 리턴타입 : boolean..? 인지 아닌지를 알려줘야  
	 * 메서드명 : isPrime
	 * 소수 구분 코드 
		for(int i = 2; i<num; 1++){
		if(num%i == 0) { cnt++;
		}
		if ( cnt == 0 ) { //소수
		} else { 
		}  // 1과 자기자신을 뺀 약수가 없어야 (i는 2 부터 시작하고 i<=num에서 =를뺌) 소수 이기때문에 0이면 소수 
	 */
	
	
	public static boolean isPrime(int num) {
		
		int cnt = 0;
		if ( num == 1) //1은 소수가 아니다. 이렇게 걸러주지 않으면 return true가 나옴 
			return false;
		for(int i=1;i*i<=num;i++) {   
			if (num %i == 0) {cnt++;
			}  	 
		} 
		if (cnt==1) { 
			return true; 
		} 
		return false; 
	}
	
	public static boolean isPrime1(int num) {
		if ( num == 1 )
			return false; //1은 소수가 아니다. 이렇게 걸러주지 않으면 return true가 나옴 
		for(int i=2;i<num;i++) {   
			if (num %i == 0) { 
				return false;
			}  	 
		} 
		return true; 
		} 
	// 1과 자기자신을 뺀 약수가 없어야 (i는 2 부터 시작하고 i<=num에서 =를뺌) 소수 이기때문에 나머지가 0인 수가 또 나오면 소수 아님.
		
		 
		


}
