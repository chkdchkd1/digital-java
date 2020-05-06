package student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1 = new Student();
		s1.setScore(new Subjcet("국어",40,40,10,10),
				new Subjcet("영어",30,30,10,10),
				new Subjcet("수학",10,20,10,10));
				
				
		s1.printScore();

		
		
		
	}
	
	

}


/* 출력결과 
- - - - - 성 적  정 보 - - - - 
과목명  : 국어
중간고사  : 40
기말고사  : 40
수행평가  : 10
출석점수 : 10
- - - - - - - - - - - - - - - 
- - - - - 성 적  정 보 - - - - 
과목명  : 영어
중간고사  : 30
기말고사  : 30
수행평가  : 10
출석점수 : 10
- - - - - - - - - - - - - - - 
- - - - - 성 적  정 보 - - - - 
과목명  : 수학
중간고사  : 10
기말고사  : 20
수행평가  : 10
출석점수 : 10
- - - - - - - - - - - - - - - 

*/