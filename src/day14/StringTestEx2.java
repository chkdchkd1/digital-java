package day14;

import java.util.Scanner;

public class StringTestEx2 {

	public static void main(String[] args) {
		/* 
		 * * 문제2) 주민등록번호를 입력하여 남자인지 여자인지를 판별하세요.
		 * 예) 주민번호를 입력하세요 021001-3000110
		 * 해당 주민번호는 남성입니다. 	 
		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("문제2) ");
		System.out.printf("주민등록번호를 입력하여 남자인지 여자인지를 판별하세요 : ");
		String s2 = scan.nextLine();
		s2 = s2.replaceAll("-", ""); // - 제거
		s2 = s2.replaceAll(" ", ""); //공백제거
		if(s2.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		if(s2.length() !=13 ) {
			System.out.println("주민번호 길이가 잘못되었습니다.");
			scan.close();
			return; //메인은 리턴타입이 void라서 리턴값이 없음 = 강제종료 
		}
		if(!isValid(s2.substring(0, 6))) {
			System.out.println("유효하지 않은 생년월일입니다.");
			scan.close();
			return;
		}
		
		char gender = s2.charAt(6);
		switch (gender) {
			case '1': case '3': case '9':		
			System.out.println("해당 주민번호는 남성입니다.");
			break;
			case'2': case '4' : case '0' :
			System.out.println("해당 주민번호는 여성입니다.");
			break;
			case '5' : case '7' :
			System.out.println("해당 주민번호는 외국인 남성입니다.");
			break;
			case '6' : case '8' :
			System.out.println("해당 주민번호는 외국인 여성입니다.");
			break;
		}
		 }
		scan.nextLine();
		scan.close();
		
	}
 //생년월일이 유효한 생년월일 인지 체크
	public static boolean isValid(String birth) {
		if(birth == null || birth.length() != 6 ) 
			return false;
		//0번지에서 2번지 앞까지 부분문자열 생성 => 0~1번지까지 부분문자열 
		String sYear = birth.substring(0, 2);
		String sMonth = birth.substring(2, 4);
		String sDay = birth.substring(4, 6);
		int year, day, month;
		//입력을 잘못해서 숫자가 아닌 수가 들어가면 예외처리 해주는 코드 
		try { 
			year = Integer.parseInt(sYear);
		//문자열을 정수로만들어줌
		day = Integer.parseInt(sYear);
		month = Integer.parseInt(sMonth);
		}catch(Exception e) {
			return false;
		}
		int lastDay =31;
		//if (month <1 || month > 12) return false;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31; break;
		case 4: case 6: case 9: case 11: 
			lastDay = 30; break;
		case 2 : 
			lastDay = 28; break;
		default :
			return false;
		}
		
		if(day < 1 || day > lastDay) return false;
		return true;
	}
}

