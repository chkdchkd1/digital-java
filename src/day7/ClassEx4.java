package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student s1 = new Student();
	s1.in(); //입실했다는 뜻
	s1.studentInfo();
	Student s2 = new Student("디지털 컨버전스 ...... 자바","김순신");
	s2.in();
	s2.out();
	s2.studentInfo();
	
	}

}

class Student{
	//클래스 변수 ( 모든 객체가 공유해도 되면 클래스 변수 static을 )
	
	//객체 변수 (멤버변수의 일반 접근제한자는 private)
	private String studentName; 
	// static = 어떠한 정보가 만들어지기 전에 확인할 수 있느냐를 따지면 되는데 . 만들어지기전에 확인 할 수 있으면 static을 붙인다... 는 대체로 안붙는다고 생각하면 됨 
	private String subject; // 한 반의 객체만 만드는거면 공유해도 되지만 학원 전체를 대상으로 하면 static을 붙이면 X 
	private boolean isEntracne;
	private String intime;
	private String outtime;
	
	/* int intime;
	int outtime; 시, 분을 나타나기 위해 string */
	
	//클래스 메서드
	
	//객체 메서드
	
	public void in() {
		System.out.println(studentName +"님이 입실 했습니다.");
		isEntracne = true;	
		intime = "9시";
	}
	
	public void out() {
		System.out.println(studentName +"님이 퇴실 했습니다.");
		isEntracne = false;
		outtime = "18시";
	}
		
		
	public void studentInfo() {
		System.out.println("수강 강좌 : " + subject);
		System.out.println("학생 이름 : " + studentName);
		if(isEntracne) {
			System.out.println("입실 중입니다.");
			System.out.println("입실 시간 : " + intime );
		}else {
			System.out.println("퇴실 했습니다.");
		System.out.println("입실 시간 : " + intime );
		System.out.println("퇴실 시간 : " + outtime );
		}
		
	}
	
	
	// 멤버변수가 프라이빗일 ㄸ ㅐ ... 
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public boolean isEntracne() {
		return isEntracne;
	}
	public void setEntracne(boolean isEntracne) {
		this.isEntracne = isEntracne;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	
	//생성자
	public Student() {
		subject = "자바";
		studentName = "홍길동";
	}

	public Student(String subject, String studentName ) {
		this.subject = subject;
		this.studentName = studentName;

	}
}
