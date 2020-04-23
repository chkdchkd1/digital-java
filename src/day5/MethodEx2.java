package day5;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 기능 : 두 정수와 산술 연산자가 주어지면  산술 연산 결과를 알려주는 메소드. 단 , 예외 상황은 없을때 가정 
		 * 예외 상황이란 잘못된 연산자가 들어오거나 0으로 나누는 경우  */
		/* * 기능 : 산술 연산 결과를 알려줌 
		 * 매개변수 : 두 정수와 산술 연산자  
		 * 리턴타입 : int보단 double 로 왜냐하면 나머지 때문에 
		 * 메소드명: cal */ 
		
		System.out.println(cal(1,'/',2));
		
	
	}
	
	public static double cal(int num, char ch, int num1) {
		 
		double res = 0 ;
		if(ch == '+') {
			res = num+num1; // 정수형을 실수형으로 넣어도 뒤에 점.0만 붙는다.
		    } else if (ch == '/') { 
		    res = (double)num/num1; 
		    // 만약 앞에 형변환을 해주지 않았다면 .
		     // ex) 1/2 경우 뒤에 .0만 붙어서 0.0 이 나오기때문에  앞에 double 붙여서 num을 실수로 바꾸고 실수 *정수 = 실수로 0.5 잘나옴 
		    } else if (ch == '*') {  
		    res = num*num1; 
		    } else if (ch == '-') { 
		    res = num-num1;			 
		    } else {
		    res = num%num1; 
		    }
		
		return res;

	}
	
}


