package student;

public class Student {
	
	private String name;  
	private int grade;
	private int classnum;
	private Subjcet score[];
	
	
	//기능설정 (추가, 수정, 삭제 , 출력) 
	
	// 참조변수는 같은 값을 비교할려면 같다라고 == 표현하면 이꼴스 기능을 활용해야함 string 역시 참조변수 이기에 ==라 하면 가르키는 주소값을 비교하는 것 
	public boolean equal(String name, int grade, int classnum) {
		if(this.grade != grade) {
			return false;
		}
		if(this.classnum != classnum) {
			return false;
		}
		if(!this.name.equals(name)) {
			return false;
		}
			return true;
	}
	

		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassnum() {
		return classnum;
	}

	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}

	
	public void setScore(Subjcet...score) { //입력한 점수 갯수만큼 과목에 설정해주는거.. 
		this.score = new Subjcet[score.length]; // 새로넘어온 성적을 저장하기 위한 배열
		for(int i = 0; i<score.length; i++) {
			//this.score[i] = score[i];
			this.score[i] = new Subjcet(score[i]); // 참조변수는 new연산자를 통해서 subjcet를 만들어줘야 ..
			
		}
	}
		
		public void printScore() {
			for(Subjcet tmp : score) {
				tmp.print();
			}
		}
		
		
	}
	
	
	
	

	
	


