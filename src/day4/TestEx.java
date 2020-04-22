package day4;

import java.util.Scanner;

public class TestEx {

	public static void main(String[] args) {
		// 두 정수와 문자 하나를 입력 받아 출력 하는 코드를 작성하세요 
		
		int num = 0, num1 = 0;
		//String ch;
		char chr;
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("두 정수와 문자를 입력하세요(ex: 1 * 2) : ");
		// 스캐너는 공백 엔터를 기준으로 구분한다.
		num = scan.nextInt();	
		//ch = scan.next();
		chr = scan.next().charAt(0); //
		num1 = scan.nextInt();
	
		

	 System.out.printf("입력하신 두 정수와 문자는 %d %c %d 입니다 " , num,chr,num1);
		//System.out.printf("입력하신 정수 1는 %d , 문자는 %s, 정수 2는 %d 입니다 " , num,ch,num1);
		/*  System.out.println(num + " " + op + " " +num1); 으로 써줘야함 
		 *  System.out.println(num+ch+num1) 으로 쓰는경우 op가 아스키코드로 전환되어 상수로 나옴 , 정수 입력 받을때 
		 *   문자열 + 정수= 문자열  */
				   				
		
		scan.close();
		
		
	   /* 입력받은 문자가 + 이면 두 수의 합을 출력하고 (~면 if )
	    *  -이면 두수의 차를 출력하고 
	    *  /이면 두수의 나눈 결과를 출력하고 
	    *  *이면 두수의 곱한 결과를 출력하고  
	    *  %이면 두수의 나머지 결과를 출력하는 코드를 작성하세요 */
	    
		
		
		
		
	System.out.println();
	    if(chr == '+') {
	    	System.out.printf("%d %c %d = %d", num, chr, num1, num+num1 );
	    } else if (chr == '/') {
	    		System.out.printf("%d %c %d =  %.2f ", num, chr, num1, (double)num/num1);
	    } else if (chr == '*') { 
	    		System.out.printf("%d %c %d =  %d ",num, chr, num1, num*num1);
	    } else if (chr == '-') {
	    		System.out.printf("%d %c %d =  %d" , num, chr, num1, num-num1);			
	    } else if (chr == '%'){
	    		System.out.printf("%d %c %d =  %d", num, num1,num%num1);
	    }else {
	    	System.out.printf( "%c 은 올바른 산술연사자가 아닙니다." , chr);
	    }
	    
	    
	    System.out.println();
	    
	    
	    switch(chr) {
	    case '+' :
	    	System.out.printf("%d %c %d = %d", num, chr, num1, num+num1);
	    	break;
	    case '*' :
	    	System.out.printf("%d %c %d =  %d ",num, chr, num1, num*num1);
	    	break;
	    case '/' : 
	    	System.out.printf("%d %c %d =  %.2f ", num, chr, num1, (double)num/num1);
	    	break;
	    case '-' :
	    	System.out.printf("%d %c %d =  %d" , num, chr, num1, num-num1);		
	    	break;
	    case '%' :
	    	System.out.printf("%d %c %d =  %d", num, num1,num%num1);
	    	break;
	    default :
	    	System.out.printf( "%c 은 올바른 산술연사자가 아닙니다." , chr);
	    	
	    }
	    
	    
	}	
}
