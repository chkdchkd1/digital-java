package day4;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "홍길동"; // string 참조변수 임으로 주소값을 가지는것 / 직접X
		String str1 = new String("임꺽정");
		String arr[] = new String[3];
		
		arr[0] = str; // str와 주소 값을 공유 하고있는것
		arr[1] = str1;
		arr[2] = "이순신";
		for(String s : arr) {
			System.out.println(s);
		}
		

	}

}
