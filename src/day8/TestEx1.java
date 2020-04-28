package day8;

public class TestEx1 {

	public static void main(String[] args) {
		/*  5 > 7 > 8 > 17 > 18 > 8 > 9 > 15 ( 12~14줄이 주석인경우) | } 끝에서 끝났다 
		int num1 = 1, num2 = 2;
		int res = sum(num1,num2);
		System.out.println(res);*/
		
		// 5 > 12> 13 > 22 >23 > 17> 18 >  23 > 13 > 14> 15 (위 주석처리 된것을 뺀경우 7~9쥴)
		int num1 = 1, num2 = 2;
		int res = sum2(num1,num2,3);
		System.out.println(res);
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2; 
		// return을 맡나면 바로 종료  밑의 코드, 끝ㄲㅏ지 갈필요 X void 였으면 끝까지 가야햇을것 
	}
	
	public static int sum2(int num1, int num2, int num3) {
		return sum(num1,num2) + num3;
	}

}
