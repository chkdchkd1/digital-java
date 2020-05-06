package student;

public class Subjcet {
	
	private String title;
	private int midscore;
	private int finalscore;
	private int performance;
	private int attendace;
	
	
	
	public void print() {
		System.out.printf(" - - - - - 성 적  정 보 - - - - \n");
		System.out.printf(" 과목명  : %s\n" , title );
		System.out.printf(" 중간고사  : %d\n" , midscore );
		System.out.printf(" 기말고사  : %d\n" , finalscore );	
		System.out.printf(" 수행평가  : %d\n" , performance );	
		System.out.printf(" 출석점수 : %d\n" , attendace );	
		System.out.printf(" - - - - - - - - - - - - - - - \n");
	}
	
	

	public Subjcet(String title, int midscore, int finalscore, int performance, int attendace) {
		super();
		this.title = title;
		this.midscore = midscore;
		this.finalscore = finalscore;
		this.performance = performance;
		this.attendace = attendace;
	}



	
	
	//복사 생성자 
	public Subjcet(Subjcet subjcet) {
		midscore = subjcet.midscore;
		finalscore = subjcet.finalscore;
		performance = subjcet.performance;
		attendace = subjcet.attendace;
		title = subjcet.title;
		
		
		
	}


	public int getMidscore() {
		return midscore;
	}
	public void setMidscore(int midscore) {
		this.midscore = midscore;
	}

	public int getFinalscore() {
		return finalscore;
	}

	public void setFinalscore(int finalscore) {
		this.finalscore = finalscore;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getAttendace() {
		return attendace;
	}

	public void setAttendace(int attendace) {
		this.attendace = attendace;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

	
	
	
	
	
	
}
