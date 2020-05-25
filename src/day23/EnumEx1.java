package day23;

import java.util.*;

public class EnumEx1 {

	public static void main(String[] args) {
		/* p.691
		 * 열거형은 서로 관련된 상수를 편리하게 선언하기 위한것  
		 */

		Type t = null; 
		Scanner scan = new Scanner (System.in);
		String type;
		
		//Type arr[]= Type.values();
		//열거형에 있는 모든 값들 각각을 하나의 열거형으로 만들어서 배열을 생성 
		//ex ) arr[0]  = Type.통신비, arr[1] = Type.교통비 
		do {
				int cnt = 1;
				System.out.println("분류 리스트");
				for (Type tmp : Type.values()) {
					System.out.println(cnt++ + "."+tmp);
				}
				System.out.println();
				System.out.print("분류를 입력하세요  : ");
				type = scan.next();
		
				for(Type tmp : Type.values()) {
					if(tmp.toString().equals(type)) {
						t = Type.valueOf(type);	
					}	
			}	
			}while(t == null); 
		System.out.println(t);
		
		//t = Type.valueOf(type); 
		//열거형.valueOf(문자열) : 문자열을 열거형으로 변환시키는 것 
		
	}

}

enum Type{
	통신비, 교통비, 식비, 월세, 세금, 월급 
}