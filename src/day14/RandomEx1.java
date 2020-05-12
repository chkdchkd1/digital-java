package day14;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// p500 java.util.Random 클래스 
		// 9번째 줄과 13~14번째 줄은 같은것이다. 시드값을 설정 할 수 있느냐 없느냐의 차이 일뿐 
		
		double r1 = Math.random(); // 0보다 크거가나 같고 1보다 작은 랜덤한 수 
		System.out.println(r1);
		//현재시간을 기준으로 Random 객체를 생성
		Random random = new Random(100); //가로안의 값을 시드값이라고 하는데 이 시드값을 넣어주면 생성되는 값이 고정된다.
		double r2 = random.nextDouble();
		System.out.println(r2);
		double r3 = new Random().nextDouble(); //주로 많이 쓰임 new를 통해 랜덤이라는 객체를 만들고 Random()생성자를 호출하여 초기한 후에 넥스트 더블이라는 ㅁㅔ서드를  호출하는.. 
		System.out.println(r3);  
		double r4 = random.nextDouble();
		System.out.println(r4);
		String str = "123 afd \t1 \n";
		//trim 메서드는 결과가 String(문자열)이기 때문에 trim을 하고나서 이어서 바로 String의 멤버 메서소인 charAt()을 호출 할 수 있다.
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.trim().charAt(2));
		System.out.println(" - - - - - - - - ");
		int max = 10, min =1 ; 
		int ran1 = (int)(Math.random()*(max-min+1)+min);
		System.out.println(ran1);
		//nextInt(a) : 0~a 사이의 랜덤한 수를 만듦 
		int ran2 = random.nextInt(max-min)+min;
		System.out.println(ran2);
}
}