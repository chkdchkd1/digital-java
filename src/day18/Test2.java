package day18;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		/*3. 영어사전 프로그램을 만들려고 한다. 이때 단어를 저장할 수 있는 클래스를 생성해보시오.
		이때 단어를 저장할 수 있는 클래스를 생성해보시오 (기능 구현 X) 
		단어 클래스 
		 - 단어, 품사, 뜻을 저장하는 클래스 */

	}
}

	
	class Word{
		String word;
		//String wordClass[];
		//String meaning[]
		List<String> wordClass = new ArrayList<String>() ; 
		// set( X 순서가 유지가 안되서 품사랑 뜻이랑 같이 갈 수가 없음, 또한  Set은 중복을 거르는데 한단어에서 중복되는 품사가 들어갈수도있으므로.. )  list (o) 로 해야한다  
		// 그냥 배열보다 컬렉션 프레임워크를 활용하는게 더 좋다, 
		List<String> meaning = new ArrayList<String>() ;
		//단어는 중복되면 안되기 때문에, 해당하는 단어와 같은지 판별하는 equals 가 필요 , 단어만 비교 

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
	
		

		
}
class Dic{
	List<Word> list = new ArrayList<Word>();
	//단어추가
	//단어 수정 => 품사 수정 하거나 뜻을 수정
	//단어 삭제
	//사전 출력 = > 한단어의 정보를 출력하거나 특정단어가 들어간 단어들을 출력 	
}
	
	


