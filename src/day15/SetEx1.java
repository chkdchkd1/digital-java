package day15;

import java.util.*;

public class SetEx1 {

	public static void main(String[] args) {
		// 중복되지 않은 랜덤한 수를 저장하는 코드  (int의 객체는 Integer)
		HashSet <Integer>  hs = new HashSet();
		int size = 3;
		int min = 1, max = 9;
		while (hs.size()<size) {
			int random = new Random().nextInt(max-min) + min;
			System.out.print(random + " ");
			hs.add(random);
		} //여기서 중복값이 나온다고해도 그게 중복되어 저장된게 아니라 랜덤값이 중복으로 출력 됐을 뿐 hs를 출력하면 중복되지 않은 수들이 나온다 
		System.out.println();
		for(Integer tmp : hs) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		HashSet<Num3> hs2 = new HashSet<Num3>();
		// 클래스에 이꼴스 오버라이드를 만들지않으면 부모오브젝트의 이꼴스를 사용하고 그 이꼴스는 주소를 비교한다.  그러면 밑에 코드는 두개의 객체가 주소값이 달라서 다르다고 인식 
		hs2.add(new Num3(1));
		hs2.add(new Num3(1));
		for(Num3 tmp : hs2) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		

		
	}

}

class Num3{
	int num;
	public Num3() {}
	public Num3(int num) {
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
		Num3 other = (Num3) obj;
		if (num != other.num)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Num3 [num=" + num + "]";
	}

}
