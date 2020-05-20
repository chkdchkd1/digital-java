package day20;

import java.util.*;

public class TestEx1 {

	public static void main(String[] args) {
		/* 영어 단어장 프로그램을 작성하세요
		 * 1.영어 단어 등록
		 * 2.영어 단어 수정
		 * 3.영어 단어 삭제
		 * 4.영어 단어 검색
		 * 5.영어 단어 출력
		 * 6.종료*/
		
		Scanner scan = new Scanner(System.in);
		List<Word> list = new ArrayList<Word>();
		Word w;
		int menu = 0;
		while(menu!=6) {
			printMenu();
			menu = scan.nextInt();
				switch(menu) {
					case 1 :
						//등록
						w = inputWord(scan);
						if(!insertWord(list, w))
							System.out.println("이미 존재하는 단어정보입니다.");
						break;
						
					case 2 :
						//수정
						System.out.println("수정하고싶은 단어정보를 입력하세요.");
						w = inputWord(scan);
						if(!modifyWord(list, w))
							System.out.println("존재하지 않는 단어정보입니다. ");
						else System.out.println("수정을 완료하였습니다.");
						break;
						
					case 3 :
						//삭제
						System.out.println("삭제하고싶은 단어정보를 입력하세요.");
						w = inputW(scan);
						if(!deleteWord(list, w))
							System.out.println("존재하지 않는 단어정보입니다.");
						else System.out.println("삭제를 완료하였습니다.");
						break;
						
					case 4 : 
						//검색
						w = inputW(scan);
						if(!searchWord(list, w)) 
							System.out.println("존재하지 않는 단어 입니다.");
						break;
					case 5 :
						//출력
						printWord(list);
						break;
					case 6 :
						System.out.println("! 프로그램을 종료합니다.");
						break;
						
					default :
						System.out.println("! 잘못된 입력입니다.");
				}
		}
		
	}
	

	private static void printWord(List<Word> list) {
		
		if(list == null || list.size()== 0) {
			System.out.println("! 단어정보가 없습니다.");
		} else {
			System.out.println("================");
			for(Word tmp : list)
				System.out.println(tmp);
			System.out.println("================");
		}
	}
	
		

	private static void printMenu() {
		
		System.out.println(" ====== 메뉴 ====== ");
		System.out.println("   1.영어단어 등록");
		System.out.println("   2.영어단어 수정");
		System.out.println("   3.영어단어 삭제");
		System.out.println("   4.영어단어 검색");
		System.out.println("   5.영어단어 출력");
		System.out.println("   6.프로그램 종료");
		System.out.println(" ================ ");
		System.out.print("메뉴를 입력하세요 : ");

	}


	/* 기능 : Scanner를 이용하여 영어 단어 정보를 입력하면 객체로 반환하는 메서드  //조건에 상관없이 최소 1번은 실행하는 do-while문
	 * 매개변수 : Scanner Scan
	 * 리턴타입 : Word 
	 * 메서드명: inputWord
	 */
	public static Word inputWord(Scanner scan) {
		
		List<String> classList = new ArrayList<String>() ;
		List<String> meaningList = new ArrayList<String>() ;
		char answer;
		System.out.print("단어를 입력하세요 : ");
		String word = scan.next();
		do {	
			System.out.print("단어의 품사를 입력하세요 : ");
			String wclass = scan.next();
			classList.add(wclass);
			scan.nextLine();
			System.out.print("단어의 뜻을 입력하세요 : ");
			String meaning = scan.nextLine();
			meaningList.add(meaning);
			System.out.print("계속 입력하시겠습니까? (y/n)");
			answer = scan.next().charAt(0);
		} while(answer!='n');
		Word w = new Word();
		w.setWord(word);
		w.setWclass(classList);
		w.setMeaning(meaningList);
		return w;
	}
	
	/* 기능 : Scanner를 이용하여 단어 값을 입력하여 객체로 반환하는 메서드 
	 * 매개변수 : Scanner Scan
	 * 리턴타입 : Word 
	 * 메서드명: inputW
	 */
	
	public static Word inputW(Scanner scan) {
		System.out.print("검색하고 싶은 단어를 입력하세요 : ");
		String searchw = scan.next();
		Word w = new Word(); 
		w.setWord(searchw);
		
		return w;
	}
	

	
	/* 기능 : 주어진 단어를 단어 리스트에 저장 하려는 메소드, 있으면 저장을 안하고 없으면 저장한다. => 최대한 반환값이 있는것이 좋다(재활용성)
	 * 매개변수 : 저장할 공간 List<Word>, 저장하려는 정보 Word w 
	 * 리턴타입 : boolean
	 * 메서드명: insertWord
	 */
	
	 public static boolean insertWord(List<Word> list, Word w) {
		 
		 if( list == null || w == null) {
			 return false;
		 }
		 if(!list.contains(w)) {
			 list.add(w);
		 	return true;
		 }
		 return false;
	 }
	 
	 
	 /* 기능 :  주어진 단어(이때 단어는 기존과 같고 품사나, 뜻을 수정하려 함) 가 기존 리스트에 있으면 수정하고 true , 없으면 false
		* 매개변수 : 기존 저장 공간 List<Word> list, 삭제하려는 정보 Word w
		* 리턴타입 : boolean
		* 메서드명: modifyWord
		*/
	 
	 
	 public static boolean modifyWord (List<Word> list, Word w ) {
		 
		 if( list == null || w == null) {
			 return false;
		 }
		 
		 if(list.contains(w)) {
			 list.remove(w);
			 list.add(w);
		 	return true;
		 }
		 return false;
	 }
	 
	 
	/* 기능 :  주어진 단어(이때 단어만 같으면 oK) 가 기존 리스트에 있으면 삭제하고 true , 없으면 false
	* 매개변수 : 기존 저장 공간 List<Word> list, 삭제하려는 단어 Word w (이때 단어만 주려고함) 
	* 리턴타입 : boolean
	* 메서드명: deleteWord
	*/
	 
	 public static boolean deleteWord(List<Word> list, Word w) {
		 
		 if( list == null || w == null) {
			 return false;
		 }
		 
		 if(list.contains(w)) {
			 list.remove(w);
		 return true;
		 } 
		 	return false;
	 }
	 
	 
		/* 기능 :  영어단어 검색 , 주어진 단어(이때 단어값만줌) 와 일치하는 정보가 기존 리스트에 있으면 해당 단어와 품사 뜻을 출력 
		* 매개변수 : 기존 저장 공간 List<Word> list, 검색하려는 정보(단어값만입력) word w 
		* 리턴타입 : boolean
		* 메서드명: searchWord
		*/
		
	 public static boolean searchWord (List<Word> list, Word w ) {
		
		 if( list == null || w == null) {
			 return false;
		 }
		 
		 for (int i = 0; i<list.size(); i++) {
			 if(list.get(i).equals(w)) {
				 System.out.println(list.get(i));
				 return true;
			 } 
		 }
		 return false;
	 }
	 
	
}


class Word{
	
	String word;
	List<String> wclass ;
	List<String> meaning;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	
	//단어가 중복되면 안되니까 이콜스 기준은 단어
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		String str ="";
		str += word + " ";
		for(int i=0; i<wclass.size(); i++) {
			if(i == wclass.size()-1)
			str += "("+wclass.get(i)+") " + meaning.get(i) + ". ";
			else 
				str += "("+wclass.get(i)+") " + meaning.get(i) + ", ";
		}
		return str;
	}
	
	// a+=b => a = a + b;
	
	public Word() {}
	
	public Word(String word, List<String> wclass, List<String> meaning) {
		this.word = word;
		this.wclass = wclass;
		this.meaning = meaning;
	}
	
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public List<String> getWclass() {
		return wclass;
	}
	public void setWclass(List<String> wclass) {
		this.wclass = wclass;
	}
	public List<String> getMeaning() {
		return meaning;
	}
	public void setMeaning(List<String> meaning) {
		this.meaning = meaning;
	}
	
	
	
	
}