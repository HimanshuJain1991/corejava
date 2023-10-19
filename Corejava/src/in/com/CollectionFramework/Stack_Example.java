package in.com.collectionframework;

import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		Stack<Integer> s=new  Stack<Integer>();
		s.push(101);
		s.push(102);
		s.push(103);
		s.push(104);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println("Index of 1: "+s.get(1));
		//System.out.println(s);
	     s.insertElementAt(455, 1);
	     System.out.println(s);
	     System.out.println(s.capacity());
		

	}

}
