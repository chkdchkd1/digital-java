package day9;

public class FinalEx1 {

	public static void main(String[] args) {
		/* 지역변수는 자동 초기화가 안된다. but 클래스의 멤버 변수들은 자동으로 초기화가 된다. (이거 책 찾아보긔) */
		
		final double PI;
		PI = 3.141592; // 이 때 초기화를 함 
		// PI = 3.14; // 에러 발 생 : 초기화 된 final 실수를 수정하려 했기 때문에 
		A a = new A();
		a.print();
		
		int arr[] = new int[10]; //이건 배열 임 
		System.out.println(arr.length); // arr.length 이거 배열에서도 나온거 그 0번지에서 ~
		// arr.length = 11; //에러 발생, arr.length도 final 변수 이므로 수정 할 수 없음 
		Array array = new Array(5);
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		//System.out.println(array.get(3));
		//System.out.println(array.get(4));
		for(int i = 0; i<5; i++) {
			System.out.println(array.pop());
			
		}
	}
}



final class A{
	public void print() {
		System.out.println("A클래스입니다.");
	}
}

class B{ // extends A {클래스 A 는 final 클래스 이기 때문에 상속하려면 에러발생 }
	
}

class D{
	// print 메서드에 final을 붙이면 아래 클래스 E에서 print 메서드를 오버라이드 할 수 없다. 하려 하면 에러발생 
	public /* final*/ void print() {
		System.out.println("D클래스입니다.");
	}
}

class E extends D{
	@Override
	public void print() {
		System.out.println("E클래스입니다.");
	}
}

class Array{
	// public final int length = 0; -  length가 초기화된 값을 그대로 쓸거냐고 확인하는거 ? final 수정 불가능 한가 명시적 초기화로 확인해주는거  (이거 명시적초기화그부분에서 체크)
	public final int length;
	private int arr[];
	private int index = 0; //현재 저장된 원소의 수 
	
	public Array() {
		length = 10;
		arr = new int[length];
	}
	                     
	public Array(int length) {
		this.length = length;
		arr = new int[length];
	}
	
	public void push(int num) {
		if(index < length) {
			arr[index] = num;
			index++;
		}
	}
		
	public int get(int index) {
		if(this.index > index ) {
			return arr[index];
		}
		return 0; // 잘 못된 접근 이기 때문에 예외 처리 클래스를 이용하여 처리해야하는데 아직 배워서 0으로
		
	}
		
	public int pop() { //
		if ( index == 0) // 저장된 원소의 갯수가 0이란 뜻 
			{ return 0; //throw를 이용하여 예외를 발생시켜야하는데 아직 안배워서 그냥 0으로 리턴함 
		}
		return arr[--index];
		/* index --;
		 * int res = arr[index];
		 * return res; */
		
		
		
	}
		/*
		 *else {
		 *		//1. 안내 메세지만 처리 
		 *		//2. 배열의 확장하여 추가하는 경우 
		 *}
		 **/
	}


/* 출력값
 * A클래스입니다.
10
4
3
2
1
0
*/
