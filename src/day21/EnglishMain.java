package day21;

import java.util.*;

public class EnglishMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		List<Word> list = new ArrayList<Word>(); //단어장
		Word word = null; //추가,수정,삭제,검색에서 사용할 임시 단어 
		char menu = '1'; 
		do {
			printMenu();
			menu = scan.next().charAt(0);
			switch(menu) {
			case '1':
				//추가
				System.out.println("추가할 단어와 그 단어의 품사, 뜻을 입력하세요");
				word = inputAllWord(scan);
				if(insertWord(list, word))
					System.out.println("단어장에 단어를 추가하였습니다.");
				else 
					System.out.println("단어 추가에 실패하였습니다.");
				break;
			case '2':
				//수정
				System.out.println("수정할 단어와 그 단어의 품사, 뜻을 입력하세요");
				word = inputAllWord(scan);
				if(modifyWord(list, word))
					System.out.println("단어장에 단어를 수정하였습니다.");
				else 
					System.out.println("단어수정에 실패하였습니다.");
				break;
			case '3':
				//삭제
				System.out.println("삭제할 단어를 입력하세요.");
				word = inputSearchWord(scan);
				if(deleteWord(list, word))
					System.out.println("단어장에 단어를 삭제하였습니다.");
				else 
					System.out.println("단어삭제에 실패하였습니다.");
				break;
			case '4':
				System.out.println("검색할 단어를 입력하세요.");
				word = inputSearchWord(scan);
				Word tmp = searchWord(list, word);
				if(tmp != null)
					System.out.println(tmp);
				else 
					System.out.println("단어장에" +word.word+"가 없습니다.");
				//검색
				break;
			case '5':
				//종료
				System.out.println(" *************** ");
				System.out.println("! 프로그램을 종료합니다.");
				System.out.println(" *************** ");
				break;
			default :
				System.out.println(" *************** ");
				System.out.println(" ! 잘못된 입력입니다.");
				System.out.println(" *************** ");
			}
		}while(menu !='5');
		
	}
	
	public static void printMenu() {
		System.out.println(" ==== 메 뉴 ==== ");
		System.out.println("   1.단어 추가");
		System.out.println("   2.단어 수정");
		System.out.println("   3.단어 삭제");
		System.out.println("   4.단어 검색");
		System.out.println("   5.종료");
		System.out.println(" ============= ");
		System.out.print("메뉴를 선택하세요 : ");
	}
	
	/* 기능 :단어장(리스트)에 단어를 추가하는 메소드, 단어장에 추가하면 true, 추가하지 못하면 false를 반환함
	 * 매개변수 : 추가할 공간 = 단어장 = 리스트 List<Word> list , 추가할 단어 Word word 
	 * 리턴타입 : boolean 
	 * 메소드명 : insertWord*/
	
	public static boolean insertWord(List<Word> list, Word word) {
		if(list == null || word == null || list.contains(word)) 
			return false;
		list.add(word);	
		return true;
	}
	
	/* 기능 : 단어,품사,뜻을 입력받아 단어를 만들어 반환하는 메소드
	 * 매개변수 : Scanner scan
	 * 리턴타입 : Word 
	 * 메소드명 : inputAllWord
	 * */
	
	public static Word inputAllWord (Scanner scan) {
		
		Word word = new Word(); //생성자 만들면 여기부분이 오류나는데 그 경우가 기본생성자를 만들지않아서임 
		char menu = 'y';//품사와 의미를 계속 추가할건지 마건지 
		String tmp ="";
		System.out.print("단어 : ");
		word.word = scan.next();
		do {
			System.out.print("품사 : ");
			/*while(true) {
				tmp = scan.nextLine();
				if(tmp.trim().length() != 0 ) { //엔터만 있는게 아니다 , 밑에 있는 거랑 같은 코드 
					break;

				};
			}*/
			while ((tmp = scan.nextLine()).trim().length() == 0 ); 
			//조건문이 참인데 실행문이 없다 그러면 다시 조건문으로 돌아간다 . 조건문의 거짓으로 되면 벗어나서 다음줄로간다.
			//scan.nextLine(); 같은 역할 ㅇㅇ .. scan.nextLine();보다 이게더 안정적이다 
			word.wordClass.add(tmp);
			System.out.print("의미 : ");
			while ((tmp = scan.nextLine()).trim().length() == 0 );
			word.meaning.add(tmp);
			System.out.print("품사와 의미를 더 입력하시겠습니까? (y/n) : ");
			menu = scan.next().charAt(0);
		}while(menu == 'y' || menu == 'Y');
		// 와일문의 조건식 강조를 와일문돌아가는데 둔것 조건식 
		return word;
	}
	
	
	/*	기능 : 단어장에 해당 단어가 있으면 검색해서 단어를 반환하고 없으면 null을 반환하는 메소드 
	 * 		//null은 모든객체가 가질수 있은 값이므로 null을 반환하는 경우보다 그 아닌 경우를 고려해서 메서드를 짜면됨 
	 * 매개변수 : 단어장 , 검색하려는 단어 =>List<Word> list, Word word 
	 * 리턴타입 : 검색된 단어 Word  
	 * 메소드명 : searchWord
	 * */
	
	public static Word searchWord(List<Word> list, Word word) {
		
		if(list == null || word == null)
			return null;
		
		//단어장에서 꺼내온 단어 tmp와 검색단어 word를 비교하여 같으면 단어장에서 꺼내온 단어를 반환
		for (Word tmp : list) {
			if(tmp.equals(word))
				return tmp;
		//contains은 포함 여부만 알려주지, 걔가 어디에 있는지는 알수 없음. 그럴땐 반복문을 통해서 하나하나 비교해서 반환해야한다.
		}
		//단어장을 다 확인했는데 검색 단어 word가 없으면 null을 반환;
		return null;
	}
	
	/* 기능 : 스캐너를 통해 검색어를 입력하여 검색어를 단어로 변환하여 반환하는 메소드  //equals 는 같은 클래스 객체여야지 비교할 수 있음 , 문자 바로 비교 X 
	 * 매개변수 : Scanner scan
	 * 리턴타입 : 검색어로 만들어진 단어 =>  Word 
	 * 메서드명 : inputSearchWord
	 * */
	
	public static Word inputSearchWord(Scanner scan) {
		System.out.print("검색 단어 : ");
		return new Word(scan.next(),null,null);
	}
	
	/* 기능 : 단어장에 삭제하려는 단어가 있으면 삭제하고 true를 반환, 없으면 false를 반환하는 메서드 
	 * 매개변수 : List<Word> list , Word word
	 * 리턴타입: 삭제여부 -> boolean
	 * 메서드명: deleteWord
	 * */
	
	public static boolean deleteWord(List<Word> list , Word word) {
		
		if (list == null || word == null)
		return false;
		return list.remove(word);
		//remove가 애초에 불리언이기때문에 리턴값을 자체적으로 제공한다. 따로 확인 필요 X 
		//또한 remove 자체적으로 equals..?(값이 같으면 지운다)를 제공하기에 또한 컨테인을 쓸 필요가없다..? 
	}
	
	
	/* 기능 : 수정할 단어가 주어지면 단어장에서 해당 단어를 찾아 단어를 교체하면(덮어쓰는) true를 반환하고 교체하지 못하면 false를  반환하는 메서드 
	 * 매개변수 : List<Word> list, Word word
	 * 리턴타입 : 수정여부  boolean
	 * 메소드명 : modifyWord
	 * */
	public static boolean modifyWord(List<Word> list, Word word) {
		
		if (list == null || word == null || !list.contains(word)) 
			return false;
		list.remove(word);
		list.add(word);
		return true;
	}

}

class Word{
	String word;//단어
	List<String> meaning = new ArrayList<String>();//뜻
	List<String> wordClass = new ArrayList<String>(); //품사
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
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
		String str = word + "\n";
		for(int i=0; i < meaning.size(); i++ )
			str += (i+1) + "." +" ("+ wordClass.get(i)+") "+ meaning.get(i)+"\n";
		return str;

	}
	//list, set은 toString 에서 대괄호가 디폴트, [ 값,값 ] 이렇게 표시됨 꾸밀려면 반복문으로 하나씩 꺼내와야 

	public Word() {}
	public Word(String word, List<String> meaning, List<String> wordClass) {
		super();
		this.word = word;
		this.meaning = meaning;
		this.wordClass = wordClass;
	}
	
	
}