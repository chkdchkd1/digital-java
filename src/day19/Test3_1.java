package day19;

import java.util.*;


public class Test3_1 {

	public static void main(String[] args) {
		
	
		/* 아래 Student 클래스를 이용하여 학생 관리 프로그램을 만들려고한다.
		 * 기능은 학생정보 추가, 학생정보 수정, 학생 정보 삭제가 있다.
		 * 이 때 필요한 메소드를 선언부만 정의하시오 (구현X)
		 */
		
		Scanner scan = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		Student s; 
		// 매번 새로 만드는게아니라 밖에 하나 만들어 놓고 쑬 때 마다 정보값을 교체하는것 
		int menu = 0;
		while (menu !=5) {
				printMenu();
				menu = scan.nextInt();
					switch(menu) {
						case 1 : 
							s = inputStduent(scan);
							if(insertStudent(list, s)) 
								System.out.println("입력한 정보가 추가 되었습니다.");
							else
								System.out.println("이미 존재하는 정보이거나 정보 추가에 실패하였습니다.");
							break;
						case 2 :
							//수정
							System.out.println(" >> 수정하고싶은 정보를 입력하세요.  ");
							s = inputStduent(scan);
							if(modifyStudent(list, s))
								System.out.println("수정을 완료하였습니다.");
							else 
								System.out.println("존재하지 않는 정보이거나 수정에 실패하였습니다.");
							break;
						case 3 :
							//삭제 
							System.out.println(" >> 삭제하고싶은 정보를 입력하세요. ");
							s = inputStduent(scan);
							if(deletStudent(list, s)) 
								System.out.println("삭제를 완료하였습니다.");
							else 
								System.out.println("존재하지 않는 정보이거나 삭제에 실패하였습니다.");
							break;
						case 4 :
							//출력
							printStudent(list);
							break;
						case 5:
							System.out.println("프로그램을 종료합니다!");
							break;
						default:
							System.out.println(" * * 잘못된 입력입니다 ! * * ");
					}
		}
		
	}
	
	
	
	
	private static void printMenu() {
		
		System.out.println(" ====== 메뉴 ====== ");
		System.out.println("   1.학생정보 추가");
		System.out.println("   2.학생정보 수정");
		System.out.println("   3.학생정보 삭제");
		System.out.println("   4.학생정보 출력");
		System.out.println("   5.프로그램 종료");
		System.out.println(" ================ ");
		System.out.print("메뉴를 입력하세요 : ");
		
	}




	/*기능 : Scanner를 이용하여 학생정보를 입력하면 학생객체를 반환하는 메소드
	 * 매개변수 : Scanner scan
	 * 리턴타입 : student
	 * 메소드 명: inputStudent
	 */
	
	public static Student inputStduent(Scanner scan) {

		System.out.print("학번을 입력하세요 : " );
		String num = scan.next();
		System.out.print("전공을 입력하세요 : ");
		String major = scan.next();
		System.out.print("학년을 입력하세요 : " );
		String grade = scan.next();
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		Student s = new Student();
		s.setName(name);
		s.setNum(num);
		s.setMajor(major);
		s.setGrade(grade);
		// get,set 없이도 s.num = num, s.name = name .. 이런식으로 해도 됨 
		return s;
	}
	
	/* 기능 : 주어진 학생정보를 학생정보 리스트에 저장하는 메소드로 이미 있는 학생이면 저장하지 않고 없는 학생이면 저장 
	 * 매개변수 : 학생정보 리스트, 주어진 학생정보 = > list<Student> list, Student s;
	 * 리턴타입 : void or boolean;
	 * 메소드명 : insertStudnet*/
	
	public static boolean insertStudent(List<Student> list, Student s) {
		if(list == null || s == null ) 
			return false;
		//참조변수를 매개로 쓸 때는 이처리를 해주는게 좋다. => 예외 발생 
		//학생정보 리스트가 없거나, 학생정보가 없으면 추가 할 수 없기 때문에 실패
		
		
		// 이미 있는 학생인지 확인 => contains(object o)  
		//없으면 배열에 저장하고 true 
		if(!list.contains(s)) { 
			// 이콜스를 만들었기때문에 객체를 넘겨줬을 때 밑에 클래스 이콜스 에 해놓은 넘버를 기준으로 비교 ㅇ 
			// 그리고 contains은 객체를 넣어 비교하는거임 변수를 넣는게아니라 s.num(x)
			list.add(s);
			return true;
		}
		// 있으면 false; 
		return false;
	}
	
	/*기능 : 주어진 학생정보를 학생정보 리스트에 수정하는 메소드로 학생정보가 없으면 수정실패  있으먄 수정성공 을 알려줌
	 * 매개변수 : 매개변수 : 학생정보 리스트, 주어진 학생정보 = > list<Student> list, Student s;
	 * 리턴타입 : 수정여부 -> boolean
	 * '메소드명 : modifyStudent */
	 // 이건 
	public static boolean modifyStudent(List<Student> list, Student s) {
		
		if(list == null || s == null ) 
			return false;
		// 일단 주어진 정보가 기존정보 학생리스트에 있는지
		if(list.contains(s)) {
			list.remove(s); //해당하는 이콜스를(밑에 클래스 이콜스에서 학번을 썼기때문에) 호출하는거라서  학번이 같은걸 지움
			list.add(s);
			return true;
		}
			return false;
			
		// 있으면 수정하고픈 정보를 받고 교체하기.
		// 없으면 false 돌려주기 
		
	}

	
	/*기능 : 주어진 학생정보를 학생정보 리스트에 삭제하는 메소드로 학생정보가 없으면 삭제실패  있으먄 삭제정성공 을 알려줌
	 * 매개변수 : 매개변수 : 학생정보 리스트, 주어진 학생정보 = > list<Student> list, Student s;
	 * 리턴타입 : boolean
	 * '메소드명 : deletStudent */
	 
	public static boolean deletStudent(List<Student> list, Student s) {
	
		if(list == null || s == null ) 
			return false;
		// 일단 주어진 정보가 기존정보 학생리스트에 있는지
		if(list.contains(s)) {
			list.remove(s);
			return true;
		}
		return false;
	}
	
	
	public static void printStudent(List<Student> list) {
		
		if(list == null || list.size()== 0) {
			System.out.println("학생정보가 없습니다.");
		} else
			System.out.println("===========");
			for(Student tmp : list)
				System.out.println(tmp);
			System.out.println("===========");
		}
	}
		

class Student{
	String name; //이름
	String num;  //학번 => 고유번호(중복X)
	String major; //전공 
	String grade; //학년
	
	
	public Student() {}
	
	public Student(String name, String num, String major, String grade) {
		
		this.name = name;
		this.num = num;
		this.major = major;
		this.grade = grade;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 학번 : " + num + " / 전공 : " + major + " / 학년 : " + grade + "";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
