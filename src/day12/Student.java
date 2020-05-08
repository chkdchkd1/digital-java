package student;

public class Student {
	
	private String name;  
	private int grade;
	private int classnum;
	private int num;
	private Subjcet score[];   //일반변수가 아닌 변수는 다 참조변수 자체로 만든 클래스 서브젝트를 참조변수 
	
	
	//기능설정 (추가, 수정, 삭제 , 출력) 
	
	// 참조변수는 같은 값을 비교할려면 같다라고 == 표현하면 이꼴 기능을 활용해야함 string 역시 참조변수 이기에 ==라 하면 가르키는 주소값을 비교하는 것 
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
	
	public boolean equal(Student s) {
		if(this.grade != s.grade) {
			return false;
		}
		if(this.classnum != s.classnum) {
			return false;
		}
		if(this.num != s.num) {
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

	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}
	
	



	public Subjcet[] getScore() {
		return score;
	}

	public void setScore(Subjcet...score) { // 3개짜리 배열이 들어오는거 
		this.score = new Subjcet[score.length]; // 생성자가 아님! () 가 없음 , 3개짜리 배열을 만드는  ㅁ ㅁㅁㅁ
		for(int i = 0; i<score.length; i++) {
			//this.score[i] = score[i];
			this.score[i] = new Subjcet(score[i]); // 참조변수는 new연산자를 통해서 subjcet를 만들어줘야 .. 0번지의 과목  1번지의 과목 
			
		}
	}
		
		public void printScore() {
			if(score == null) return;
			for(Subjcet tmp : score) {
				tmp.print();
			}
		}

		public void addScore(Subjcet[] addscore) {
			int aSize = 0, bSize = 0; 
			if(score != null) {
				aSize = score.length;
			}
			if(addscore != null) {
				bSize = addscore.length;
			}
			// 과목을 하나도 입력안하면 score.length에 null 값이 들어가기에 그냥 돌리면 에러가 된다. 
			//처음에 생성할 과목수 만큼만 배열을 만들어 놨기에 추가할려면 더해줘야 
			Subjcet [] tmp = new Subjcet[aSize + bSize];
			for(int i=0; i<aSize; i++) {
				tmp[i] = score[i];				
			}
			for(int j=0; j<bSize;j++) {
				tmp[aSize+j] = addscore[j];
			}
			
			score = tmp; // 새로만든배열을 원래 score에 연결하는 것 템프는 ㅂ ㅐ열이뉙ㄱ까 ...
			
		}
		
		
		
		
		
		
		
	
		
		
	}
	
	
	
	

	
	


