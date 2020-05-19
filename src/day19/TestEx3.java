package day19;

import java.util.*;

public class TestEx3 {

	/* 아래 Student 클래스를 이용하여 학생 관리 프로그램을 만들려고한다.
	 * 기능은 학생정보 추가, 학생정보 수정, 학생 정보 삭제가 있다.
	 * 이 때 필요한 메소드를 선언부만 정의하시오 (구현X)
	 */
	
	public static void main(String[] args) {
		
	}
		/* 기능 : 학생 정보를 입력 받아 입력받은 학생정보를 배열에 추가 
		 * 매개변수 : Student stdList[] 저장할공간, Scanner scan (추가하고싶은 학생 정보) 
		 * 리턴타입 : void (참조변수를 매개변수로 넘겨주면 원본값도 바뀜 )
		 * 메소드명 : addStudent*/
		
	public static void addStudent(Student stdList[], Scanner scan) {
		
	}
	
	/* 기능 : 기존 학생 정보에서 내가 수정을 원하는 정보가 있는지 확인하고 있으면  입력받은 정보로 수정
	 * 매개변수 : 기존학생정보.., 수정하고싶은 정보 
	 * 리턴타입 : void..
	 * 메소드명 : modifyStudent*/
	
	public static void modifyStudent(Student stdList[], Scanner scan) {
		
	}
	

	/* 기능 : 기존 학생 정보에서 내가 삭제하고싶은 학생 정보가 있는지 확인하고 있으면  정보 삭제
	 * 매개변수 : 기존학생정보, 삭제하고싶은 학생정보 (입력받음)
	 * 리턴타입 : void ?
	 * 메소드명 : deleteStudent */
		
	public static void deleteStudent(Student stdList[], Scanner scan) {
		
	}

	/*기능 : 기존학생정보에 주어진 학생정보가 있는지 없는지 판단하기 위한 매서드 
	 * 매개변수 :List<Student> (학생정보리스트) student s (줄 학생정보 ) 
	 * 리턴타입 : boolean 
	 * 메소드명 : isDuplicated*/
	
	public static boolean isDuplicated(List<Student> list, Student s ) {
		return true;
	} // 중복검사할때 이렇게 해도 좋지만 클래스 메서드에 이꼴스를 활용한 컨테인을 사용하면 더 쉽게 할 수 있다 . 
	
	// 이꼴스 같다 , 컨테인 포함하고있다. 
	// 내가 삭제하거나 수정하고 싶은 정보를 매번 메소드마다  스캐너를 통해서 입력 받기보다는 그걸 따로 메소드로 만들어서 호출하는 식이 좋음...
	// 그리고 그거 (스캐너가 매개변수인 메소드(이건 매개변수가 스캐너라 안에서 스캐너를 선언해줄필요없다) 를 , 메소드 안에 넣을려고하면 메소드 마다 스캐너를 선언해주어야한다. 그러니 그건 메인에서 호출해주는 게좋다  
}
	
class Students{
	String name; //이름
	String num;  //학번 => 고유번호(중복X)
	String major; //전공 
	String grade; //학년
}
