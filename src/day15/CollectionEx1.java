package day15;


import java.util.*;

public class CollectionEx1 {

	public static void main(String[] args) {
		// 컬렉션 프레임 워크는 객체를 저장함 
		//arraylist 사이즈를 신경쓰지 않아도 되는 배열 , 넘치면 자동으로 추가 됨 
		ArrayList<Num> list = new ArrayList<Num>(); 
		// 클래스명 <클래스명 > 이름 = 생성자  = > 제네리클래스, Num 클래스의 객체만 저장가능한 list를 ArrayList로 생성   
		list.add(new Num());
		// list.add(new Ch()); 
		// Num클래스 이용한  객체가 아니라 Ch 클래스를 이용한 객체라서 에러 발생 
		//list.add(new Num2()); 
		// Num 클래스를 상속받은 자식 클래스 Num2를 이용한 객체는 에러 발생하지 않음, 자식 클래스는 부모 클래스로 자동 형변환 되기 때문에  
		//일반 자료형은 이콜스 메서드가 없기 때문에 래퍼클래쓰로 객체화 해서 이콜스 메서드를 사용한다 
		
		list.add(new Num());
		list.add(new Num(1));
		list.add(new Num(100));
		printList(list);
		list.remove(new Num()); 
		//이콜스를 만들어주고나서 지워야 중복값을 지운다. 그전에는 단순히 주소값이 같은지만 보기때문에 같은 값을 지울려면~
		System.out.println("Num가 0인 객체를 지운후 list ");
		printList(list);
		
		ArrayList<Num> list2 = new ArrayList<Num>(list);
		System.out.println("복사 생성자를 이용한 list2 ");
		printList(list2);
		list.add(1, new Num(200));
		System.out.println("1번지에 200을 추가 후 list");
		printList(list);
		list2.clear();
		System.out.println("list2를 clear한 후 list2");
		printList(list2);
		list2.addAll(list);
		System.out.println("list를 list2에 추가한 후의 list2");
		printList(list2);
		System.out.println("향상된 for문을 이용하지 않은 반복문");
		for (int i = 0; i <list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		System.out.println("iterator를 이용한 출력문");
		Iterator<Num> it = list.iterator();
		while(it.hasNext()) { //hasNext다음값이 있는지 true false , 있으면 it.next를 통해서 다음값을 가져온다. 
			System.out.print(it.next() + " "); 
			// Num tmp = it.next(); System.out.print(tmp + ""); = System.out.print(it.next() + " "); 같은뜻
		}
		System.out.println();
		list.ensureCapacity(100); //미리 100개 짜리 배열 미리 넉넉하게 만들어 놓겠다는 뜻 , list.size의 size는 저장된 객체의 수 
		List<Num> list3 = list.subList(0, 2);
		System.out.println("0번지에서 2번지 사이의 부분리스트(2번지 제외)");
		printList(list3);
		/* 익명클래스는 주로 메소드에서 인터페이스를 구현한 클래스가 필요한데 해당 메소드가 기능이 하나뿐이어서 따로 정의하기 귀찮은 경우 익명클래스를 이용한다. */
		list.sort(new Comparator<Num> () { //
			@Override
			public int compare(Num n0, Num n1) {
				if(n0.num > n1.num)
					return 1;
				if(n0.num < n1.num)
					return -1;
				return 0;
			}
		});
		System.out.println("정렬 후 list");
		printList(list);
	}

	private static void printList(List<Num> list) { // List를 매개변수로 넣으면 array list나 LinkedList 다 올 수있다 
		for (Num tmp : list) {
			System.out.print(tmp+" ");
			// 향상된 for문은 배열 뿐만아니라 프레임워크에서도 쓸 수 있다 
			}
		System.out.println();
	}

	
	}

class Num{
	int num;

	@Override
	public String toString() {
		return "[num=" + num + "]";
	}
	
	public Num() {
		
	}

	public Num(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
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
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
	
	
}

class Num2 extends Num{
	
}
class Ch{
	char ch;

	@Override
	public String toString() {
		return "Ch [ch=" + ch + "]";
	}
	
}