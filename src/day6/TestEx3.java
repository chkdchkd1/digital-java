package day6;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		/* 여려명의 성적을 입력 받아 해당 학생의 성적을 학점으로 출력하세요 -> 다섯명의 점수를 받고 성적을 출력하세요 (앞의것을 다섯번 반복하세요 )
		 * 학생의 성적이 음수가 입력되면 종료 되도록 하세요. 
		 * 100~90 : A
		 * 89 ~ 80 : B
		 * 79 ~ 70 : C
		 * 69 ~ 60 : D
		 * 59 ~ 0 : F
		 * 100점 이상 : 잘 못된 수입니다 */
		
		int score = 0;
		Scanner scan = new Scanner(System.in);
		// a학점 와 b학점가 중복되지 않는 조건이기에 else-if로 써주는게 더효율
		// 지금까지 몇명의 학생의 점수를 입력받았는지 표시하려면 for(i=1; ;i++) {} 일반 무한루트는 for(;;){}
		for(int i=1; ;i++) { 
			System.out.printf("점수를 입력하세요(종료하려면 음수를 입력하세요.) : ");
			score = scan.nextInt();
		  if (score >=90  && score <=100) {
			System.out.printf("해당 학생의 성적은 %d점으로 A입니다.\n",score);
		} else if(score <= 89 && score >= 80) {
			System.out.printf("해당 학생의 성적은 %d점으로 B입니다.\n",score);
		} else if(score <= 79 && score >= 70) {
			System.out.printf("해당 학생의 성적은 %d점으로 C입니다.\n",score);
		} else if(score <= 69 && score >= 60) {
			System.out.printf("해당 학생의 성적은 %d점으로 D입니다.\n",score);
		} else if(score <= 59 && score >= 0) {
			System.out.printf("해당 학생의 성적은 %d점으로 F입니다.\n",score);
		} else if(score > 100) {
			System.out.printf("입력된 점수는 잘못된 점수 입니다.\n" );
		} else {
			System.out.printf("지금까지 입력확인한 학생의 수는 %d명입니다\n",i-1); //마지막에 종료를 하기 위해 입력한 음수도 카운트하기 때문에 그것도 빼주어야
			System.out.printf("종료합니다.");
			   break;
		}
		}
			scan.close();

	}

}
