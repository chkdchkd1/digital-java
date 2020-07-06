package day53;

import java.util.*;

public class ifEx {

	public static void main(String[] args) {
		/* 성적을  정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요
		 * a+ : 100~95
		 * a  : 94~90
		 * b+ : 89~85
		 * b  : 84~80
		 * c+ : 79~75
		 * c  : 74~70
		 * D+ : 69~65
		 * D  : 64~60
		 * F  : 0 ~ 59*/
		
		int score = 0;
		System.out.printf("점수를 입력하세요 (0 ~ 100) : ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
//		if (score >= 90 && score <= 100) {
//			if (score >=94)
//				System.out.println("A+");
//			else 
//				System.out.println("A");
//		}
		
		if(score >= 95 && score <= 100) {
			System.out.println("학생의 성적은  A+ 입니다");
		} else if(score >= 90 && score <=94) {
			System.out.println("학생의 성적은 A 입니다 ");
		} else if(score >= 85 && score <=89) {
			System.out.println("학생의 성적은 B+ 입니다 ");
		} else if(score >= 80 && score <=84) {
			System.out.println("학생의 성적은 B 입니다 ");
		} else if(score >= 75 && score <=79) {
			System.out.println("학생의 성적은 C+ 입니다 ");
		} else if(score >= 70 && score <=74) {
			System.out.println("학생의 성적은 C 입니다 ");
		} else if(score >= 65 && score <=69) {
			System.out.println("학생의 성적은 D+ 입니다 ");
		} else if(score >= 60 && score <=64) {
			System.out.println("학생의 성적은 D 입니다 ");
		} else if(score >= 0 && score <=59){
			System.out.println("학생의 성적은 F입니다. ");
		} else {
			System.out.println("잘못된 성적입니다.");
		}
		
		scan.close();
		

	}

}
