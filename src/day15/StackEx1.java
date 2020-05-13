package day15;

import java.util.*;
public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>(); //Stack 클래스를 통해서 만든다 
		 stack.push(1);
		 stack.push(new Integer(2));
		 stack.push(Integer.parseInt("3"));
		 System.out.println(stack.pop()+ "을 스택에서 꺼냈습니다.");
		 System.out.println(stack.pop()+ "을 스택에서 꺼냈습니다.");
		  //pop은 마지막 요소를 꺼낸다 => 마지막 요소를 반환한다 
		 for(Integer tmp : stack) {
			 System.out.println(tmp);
		 }
		 
			
	}

}

/* 출력결과 
2
3
*/