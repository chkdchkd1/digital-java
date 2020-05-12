package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class regexsEx1 {

	public static void main(String[] args) {
		// p.505 정규표현식
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
		Pattern p = Pattern.compile("(\\d{6}-\\d{7})|(\\d{13})");
		Matcher m = p.matcher(s2);
		if(!m.matches()) { // if(!p.matcher(s2).matches()) 랑 같음
			System.out.println("올바른 주민번호 형태가 아닙니다.");
			scan.close();
			return; //올바른 주민번호의 형태가 아니니까 밑의 코드를 더이상 진행할 필요가 없다 
		}
		
		if(s2.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		if(!isValid(s2.substring(0, 6))) {
			System.out.println("유효하지 않은 생년월일입니다.");
			scan.close();
			return;
		}
		
		char gender ;
		if(s2.contains("-")) 
			gender = s2.charAt(7);
		else 
			gender = s2.charAt(6);
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
		String sYear = birth.substring(0, 2);
		String sMonth = birth.substring(2, 4);
		String sDay = birth.substring(4, 6);
		int year, day, month;
		try { 
			year = Integer.parseInt(sYear);
		day = Integer.parseInt(sYear);
		month = Integer.parseInt(sMonth);
		}catch(Exception e) {
			return false;
		}
		int lastDay =31;
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


