package day54;

public class extendsEx1 {

	public static void main(String[] args) {
		//* 상 속 *
		// * - 자식 클래스들의 객체들을 부모 클래스의 객체로 관리 할 수 있다. */

		parent arr[] = new parent[10];
		arr[0] = new child1();
//		arr[1] = new child2();
		// 위의 child2 는 상속 받지 않아 부모 클래스의 객체로 관리 X 
		
	}

}



class parent{
	int x;
	int y;
}

class child1 extends parent{
	int x,y;
	int z;
}

class child2{
	int x,y,z,w;
}


