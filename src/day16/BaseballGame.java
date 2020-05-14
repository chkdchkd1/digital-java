package day16;

import java.util.*;

public class BaseballGame {

	public static void main(String[] args) {
		// ArrayList를 활용하여  숫자야구게임 ~ 
		
		ArrayList<Integer> com  = new ArrayList<Integer>(); 
		ArrayList<Integer> user ; 
		int size = 3;
		
		int min = 1, max = 9;
		int s = 0, b = 0;
		Scanner scan = new Scanner(System.in);
		createArray(min, max, size, com);
		printArray(com);
		//반복시작(3S)
		while(s != 3) {
			user  = new ArrayList<Integer>(); 
			while(user.size() < 3) {
				int unum = scan.nextInt();
				user.add(unum);
			}
			//스트라이크 판별
			s = strike(com, user);
			if(s != 0)
				System.out.print(s+"S");
			//볼을 판별
			b = ball(com, user);
			if(b != 0)
				System.out.print(b+"B");
			if(s == 0 && b == 0)
				System.out.print("3O");
			System.out.println();
			
		
		}
		System.out.println("종료!");
		scan.close();
	}
	public static int strike(ArrayList<Integer> com, ArrayList<Integer> user) {
		int cnt = 0;
		for(int i = 0; i<com.size(); i++) {
			if(com.get(i).equals(user.get(i))) {
				cnt++;
			}
		}
		return cnt;
	}
	public static int ball(ArrayList<Integer> com, ArrayList<Integer> user) {
		int cnt = 0;
		for (Integer tmp : user) {
			if (com.contains(tmp)) {
				cnt++;
			}
	}	
		return cnt - strike(com,user);
	}
	public static boolean createArray(int min, int max, int size, ArrayList<Integer> com) {
		if(com == null)
			return false;
		if(max - min + 1 < size)
			return false;
		while(com.size() < size) {
			int r = random(min, max);
			if(!com.contains(r)) {
				com.add(r);
			}
		}
		return true;
	}

	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1) + min);
	}
	public static void printArray(ArrayList<Integer> com) {
		for (Integer tmp : com) {
			System.out.print(tmp+" ");
			}
		System.out.println();
	}
	public static boolean isDuplicated(int []arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}

}


