package day18;


import java.util.*;


public class Test1 {

	public static void main(String[] args) {
		// 1. 성적을 입력받아 입력받은 성적이 어떤 학점인지 판별하는 코드를 작성하세요.
		/* A : 90이상 100이하
		 * B : 80이상 90미만
		 * C : 70이상 80미만
		 * D : 60이상 70미만
		 * F : 0이상 60미만
		 */
		// 2. 1번에서 작성한 내용을 메소드로 만드세요.(올바른 점수가 아닌겨우 x)
		// 3. 영어사전을 프로그램으로 만들려고 한다. 이때 단어를 저장 할 수 있는 클래스를 생성해보시오 (기능 구현 X)
	
	
		 
		Scanner scan = new Scanner(System.in);
		//score(scan);
		System.out.println("성적을 입력하세요 ( 0~100 ) : ");
		int num = scan.nextInt();
		String grade = grade(num);
		if(grade.equals("X")) {
			System.out.println("올바른 점수가 아닙니다");
		} else {
			System.out.println(grade+"학점입니다.");
		} try {
			System.out.println(grade2(num)+"학점입니다.");
		} catch (Exception e){
			System.out.println(e.getMessage());
			
		}
		
	
		
	}
	
	/* 기능(구체적일수록좋다) : 정수 성적을 입력받아 입력받은 성적이 어떤 학점인지 출력하는 메서드
	 * 매개변수 : Scanner scan
	 * 리턴타입 : void (단순출력) => 출력하는 부분을 메소드안에 넣기 보다는 리턴값을 돌려주는 , 알려주고 메인에서 출력시키는 메서드가 더 재사용성이 좋다. 
	 * 								왜냐하면 결과값을 다른 곳에서 활용할 경우가 있기때문에. 
	 * 메소드명 : score */
	
	public static void score (Scanner scan) {
		
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		if (score <= 100 && score >= 90) {
			System.out.println("해당 점수는 A학점 입니다.");
		} else if (score < 90  && score >= 80) {
			System.out.println("해당 점수는 B학점 입니다.");
		} else if (score < 80  && score >= 70) {
			System.out.println("해당 점수는 C학점 입니다.");
		} else if (score < 70  && score >= 60) {
			System.out.println("해당 점수는 D학점 입니다.");
		} else if (score < 60  && score >= 0 ) {
			System.out.println("해당 점수는 F학점 입니다.");
		} else
			System.out.println("유효하지 않은 점수입니다.");
		} 

	/*기능 : 정수 성적이 주어지면 성적에 맞는 학점을 알려주는 메소드;
	 * 매개변수 : 정수 성적 => int score
	 * 리턴타입 : 학점(추후 +를 추가 할 수도 있기때문에 ) => String
	 * 메소드명 : grade
	 * 기능 : 점수를 입력받아 입력받은 성적을 알려주는 학점 
	 */
	/**
	 * 
	 * @param score : 정수 성적
	 * @return : 성적에 맞는 학점으로 ABCDF학점과 올바르지 않을때의 학점X를 반환 
	 */
	public static String grade(int score) {
		if(score < 0 || score > 100 ) 
			return "X";
		if(score >=90)
			return "A";
		if(score >=80)
			return "B";
		if(score >=70)
			return "C";
		if(score >=60)
			return "D";
		return "F";
	}
	
	/**
	 * 
	 * @param score : 정수 성적
	 * @return : 성적에 맞는 학점으로 ABCDF학점과 올바르지 않을때의 학점X를 반환 
	 */
	
	public static String grade2(int score) {
		if(score < 0 || score > 100 ) 
			throw new ArithmeticException("올바른 점수가 아닙니다.");
		if(score >=90)
			return "A";
		if(score >=80)
			return "B";
		if(score >=70)
			return "C";
		if(score >=60)
			return "D";
		return "F";
	}
	
}


/* 영어사전 프로그램을 만들려고 한다. 이때 단어를 저장할 수 있는 클래스를 생성해보시오
 * 단어저장에 필요한 것들..? 단어, 뜻, 품사, 
 * 단어 저장에 필요한 기능 : 기존 단어에 뜻이나 품사를 추가, 수정하는 기능, 입력한 정보와 일치하는 단어나 뜻 존재여부 , 출력하는 기능   */

class english {
	
	String word;
	String part[];
	String mean[];
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		english other = (english) obj;
		if (!Arrays.equals(mean, other.mean))
			return false;
		if (!Arrays.equals(part, other.part))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return word + "(" + part + ")" + mean ;
	}

	public english() {}

	public english(String word, String[] part, String[] mean) {
		this.word = word;
		this.part = part;
		this.mean = mean;
	}
	
	
	
	
	
	
}