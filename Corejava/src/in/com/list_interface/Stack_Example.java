package in.com.list_interface;

import java.util.List;
import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		Stack l=new Stack();
		l.add(54);
		l.add(1);
		l.add(65);
		l.add(2);l.add("Himanshu Jain");
		System.out.println(l);
		l.push(100);l.push(22);
		System.out.println(l);
		System.out.println("peek element"+l.peek());
         System.out.println("pop element"+l.pop());
         System.out.println(l);
	}

}
