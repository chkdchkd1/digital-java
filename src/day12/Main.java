package student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
		Student tmpStudent; // 스위치내에서 선언한면 스위치 브레이크 만나는 범위까지만 쓸수 있기에 위에 선언해준다 . 
		int size = 30;
		Student std[] = new Student[size];
		int cnt = 0; // 현재 저장된 학생 수 
		int menu = 0;
		
		/* Subjcet subjectList[]; // 자료형이 subjcet 클래스 라는건 모슨 의미 ..?  ㅁ = subjectlist
		String title;
		int midscore, finalscore, performance, attendace; 안쓰는 부분 다 메서드 처리했기에 
		*/
		
		String name;
		
		while (menu !=5) {
			printMenu();
			menu = scan.nextInt();
			switch(menu){
			case 1 :
				System.out.println("추가할 학생 정보를 입력하세요.");
				tmpStudent = searchinfo(scan);
				System.out.print("이름을 입력하세요. : ");
				name = scan.next();
				tmpStudent.setName(name);
			
				if(isDuplicated(std, cnt, tmpStudent) != -1) {
					System.out.println("이미 있는 학생입니다.");
					break;
				}
				std[cnt] = tmpStudent;  // 연결후에 cnt증가해주는 것  후위연산자 
				//과목정보에 대한 작업을 해야함 
				System.out.print("과목정보를 입력하시겠습니까? (y/n)");
				char subjectMenu = scan.next().charAt(0);
				switch(subjectMenu) {
				case 'y' :  
					inputSubject(scan,std[cnt]);
					break;
				case 'n' :
					break;
				}
				cnt++;
				tmpStudent = null; // tmpstudent와 생성된 객체의 연결을 끊어주는 것 
				break;
			case 2 :
				modifyStudent(std, cnt, scan);
				break;
				
			case 3 :
				System.out.print("삭제할 학생 정보를 입력하세요. (검색)");
				tmpStudent = searchinfo(scan);
				if(deleteStudent(std, tmpStudent, cnt)) cnt--;
				break;
				
			case 4 :  
				printStudent(std,cnt);
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다,");
				
							
			}
		}
	}
	
	
	
	public static void printMenu() { //메인 메소드가 클래스 메소드이기때문에 static이 되기에, 프린트 메소드는 객체 메소드가 드가 되고 객체메소드는 클래스에서 그냥 둘수 없다 . 
		System.out.println("- - - 메 뉴 - - -");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.프로그래밍종료");
		System.out.println("- - - - - - - - - - - ");
		System.out.print("메뉴를 선택하세요.");
		
	}
		
		
		


	/*검색할 때 사용하기에 서치인포, 이것을 부르면  하나의 학생정보를 돌려 주기로 했기때문에 리턴타입이 student 
	스캐너를 메서드안으로 넣으면 나중에 사용할 때 문제가 될 수 있기때문에 매개변수로 쓴다 */
	 //즉 이말은 리턴타입이 클래스라는거 ? 반환타입이 참조형이라는건 메서드가 객체 주소를 복사 해서 반환한다. 즉 매개변수로 넘겨받은 객체에 저장된 주소를 복사해서 반환한다. 
	public static Student searchinfo(Scanner scan){
		
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classnum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		Student s = new Student();
		s.setGrade(grade);
		s.setClassnum(classnum);
		s.setNum(num);
		
		return s;
	}
		
	/*
	 * 학생정보를 전체를 단순 출력 하는 기능  = void
	 * 리턴타입:  student는 하나의 학생 정보값? 이라서 안된다. 
	 * 			int 출력학생수를 확인,
	 * 			boolean 학생정보를 출력하면  true, 실패하면 false 
	 * 매개변수 : Student 한명의 학생정보 
	 * 		 : Student [] : 여러명의 학생정보 
	 * 		: cnt   현재 출력할 학생의 수 
	 */
	
	public static void printStudent(Student []std, int cnt){
		
		for(int i = 0; i<cnt; i++) {
			System.out.println("- - - - - - - - - - -");
			System.out.println("학년 : " + std[i].getGrade());
			System.out.println("학반 : " + std[i].getClassnum());
			System.out.println("번호 : " + std[i].getNum());
			System.out.println("이름 : " + std[i].getName());
			System.out.println("- - - - - - - - - - -");
			std[i].printScore();
		}
	}
	
	/*기능 : 콘솔에서 정보를 입력받고 입력받은 정보를 통해 과목들을 저장하고 저장한 과목을 학생정보에 추가하는 기능
	 * 리턴타입 : X 매개변수를 통해서 원본값을 바꿀 수 있기에 값을 안돌려줘도 됨..? = void 
	 * 원본에 값이 추가 되었기 때문에 돌려줄 필요가 없음 
	 * 매개변수 : scanner 스캔..? 입력받은걸 . 콘솔에서 입력받아야하니까 
	 * 		  Student  : 학생정보에 추가해야하기에  , 넣어줄것  = 참조변수를 매개변수로 쓰면 주소값이 복사된다. 
	 * 		매개변수가 일반변수면  매개변수의 값이 변경 되는것. 원본값에 영향을 주지 않는다. (매개변수는 들어올 값의 형태를 잡아주는 것..?) 
	 *  > 매개변수가 참조형이면  값이 복사되는 일반형과 돠르게 주소가 복사 되기때문에 즉 값이 저장된 주소를 메서드에게 넘겨줌, 메서드에서 값이 변경 되면 메서드밖에서도 변경된 값으로 적용된다 
	 * 	 */
	
	public static void inputSubject(Scanner scan, Student s){

		System.out.print("입력할 과목의 수 : ");
		int subjectCnt = scan.nextInt();
		Subjcet []subjectList = new Subjcet[subjectCnt];
		//여러 과목 정보를 입력 받아야 
		for(int i =0; i<subjectCnt;i++) {
			System.out.print("과목명 : ");
			String title = scan.next();
			System.out.print("중간고사 : ");
			int midscore = scan.nextInt();
			System.out.print("기말고사 : ");
			int finalscore = scan.nextInt();
			System.out.print("수행평가 : ");
			int performance = scan.nextInt();
			System.out.print("출석점수 : ");
			int attendace = scan.nextInt();
			subjectList[i] = new Subjcet(title, midscore, finalscore, performance, attendace);
		} if( s == null)
			return;
		s.setScore(subjectList);
	}
	
	/* A 리턴타입 
	 * void : 학생이 삭제 됐는지 아닌지 없음 
	 * int 삭제된 뒤의 학생수 ?
	 * boolean : 삭제 여부  > 대신 이건 삭제처리는 메인에서 조건문으로 
	 * B 매개변수
	 * int cnt : 현재 학생수 
	 * Student []std : 저장된 학생정보 (이게 있어야 검색을 할 수있음) 
	 * Student s : 삭제할 학생 정보 */
	
	public static boolean deleteStudent(Student std[], Student deleteStudent, int cnt) {
		if(std == null || deleteStudent == null || cnt <= 0 ) return false;
		int pos = isDuplicated(std, cnt, deleteStudent); //삭제할 요소가 배열에서의 어느번지에 있는지 
			//하나씩 검색해서 tmpstudent와 같은 학생이 있는지 확인, 있으면 삭제 후 하나씩 당겨와야한다.  
			if(pos !=-1) {
				for(int j=pos; j<cnt-1 ;j++) {
					std[j] = std[j+1];
				}
				System.out.println("삭제가 완료되었습니다.");
				return true;
			}
		
		return false;
	}
	
	/* A  리턴타입
	 * boolean..? 중복된 학생정보가 있는지 없는지 
	 * int : 중복되면 중복된 번지를 알려주고 중복 안되면 -1을 반환한다. 또한 삭제에서도 사용할 수 있다. (효율) 
	 * B 매개변수  
	 * 원래 있는 기존정보..?  Student []std ,
	 * 비교할 값  Student s
	 * 배열 30개짜리 만들었지만 다 볼 필요없고 저장된 갯수만 비교하면 되니까 int cnt
	 */
	
	public static int isDuplicated(Student []std, int cnt, Student s ) {
		for(int i= 0; i<cnt; i++) {
			if(std[i].equal(s)) {
				return i;
			}
		}
		return -1;
	}
	
	/* A 리턴타입 void..? 참조변수를 매개변수로 넘겨주기에 원본값이 자동으로 바뀌니까 넘겨줄 값이 없다 .
	 * 
	 * B 매개변수  
	 * student [] std  : 학생들 정보
	 * int cnt : 
	 * Scanner scan : 수정하고싶은 이름 <- 이건 입력받을거임 매서드 안에서    */
	
	public static void modifyStudent(Student std[], int cnt,Scanner scan) {
		
		System.out.println("수정할 학생 정보를 입력하세요. (검색)"); //아래에선 우선 이름을 수정한다. 
		Student tmpStudent = searchinfo(scan);
		int pos = isDuplicated(std, cnt, tmpStudent);
		if (pos == -1) {
			System.out.println("없는 학생 정보 입니다.");
			return ;
		} 		
		System.out.print("이름 : ");
		String name = scan.next();
		tmpStudent.setName(name);
		System.out.println("- - - 과 목 수 정  - - -");
		System.out.println("1. 수정");
		System.out.println("2. 추가");
		System.out.println("3. 종료");
		System.out.print("과목을 수정하시겠습니까?");
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1: 
			//해당 학생의 과목정보를 가져오고, 검색하기전에 정보가 없으면 종료 될수 있게 
			Subjcet sList[] = std[pos].getScore();
			if(sList == null) {
				System.out.println("수정할 과목이 없습니다.");
				break;
			}
			// 수정할 과목을 입력 받기 
			System.out.print("과목 : ");
			String title = scan.next();
			// 입력받은 과목이 있는지 찾아야함 , 있으면 아래의 작업을 하고, 없으면 종료 
			int subPos = -1;
			for(int i = 0; i<sList.length;i++) {
				if(sList[i].getTitle().equals(title)) {
					subPos = i ;
					break; //subPos에 같은 내용이 있는 번지를 저장하고 빠져나온다..
				}
			}
			if(subPos == -1) {
				System.out.println("등록되지않은 과목입니다.");
				break;
			}
			// 중간, 기말, 수행평가, 출석점수 다 새로 수정 (개별로 할 수 있지만 편리성을 위해서)
			System.out.print("중간고사 : ");
			int midscore = scan.nextInt();
			System.out.print("기말고사 : ");
			int finalscore = scan.nextInt();
			System.out.print("수행평가 : ");
			int performance = scan.nextInt();
			System.out.print("출석점수 : ");
			int attendace = scan.nextInt();
			sList[subPos].setMidscore(midscore);
			sList[subPos].setFinalscore(finalscore);
			sList[subPos].setPerformance(performance);
			sList[subPos].setAttendace(attendace);
			break;
		case 2:
			Student s = new Student();
			inputSubject(scan, s);
			std[pos].addScore(s.getScore());
			//.setscore로 하면 기존에 있던 정보에 씌우는거라 이전 정보들이 사라짐 
			break;
		}
		
		
	}
}

/*  Student s1 = new Student(); // 이때 객체 s1은 학생 1명의 정보값을 넣기위한 객체 
s1.setScore(new Subjcet("국어",40,40,10,10), // 이때 생성자 발생  public (복사생성자X) 하고 setScore로간다. 컨트롤 하고 코드 누르면 코드로 간다 
		new Subjcet("영어",30,30,10,10),
		new Subjcet("수학",10,20,10,10));
		
s1.printScore(); */

