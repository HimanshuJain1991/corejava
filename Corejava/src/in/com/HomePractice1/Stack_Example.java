package in.com.HomePractice1;

import java.util.Iterator;
import java.util.Stack;

public class Stack_Example {

	public static void main(String[] args) {
		Stack<String> animals=new Stack();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Camel");
		animals.add("Monkey");
//		System.out.println(animals);
//		for (String string : animals) {
//		System.out.println(string);
//		}
//		Iterator it=animals.iterator();
//		while(it.hasNext()) {
//			System.out.println("iterator is working="+it.next());
//		}
		
		animals.push("Donkey");
		System.out.println(animals);
		animals.pop();//delete karne ke liye
		System.out.println(animals);
		System.out.println(animals.peek());//check top of the value
		animals.pop();
		System.out.println(animals);
		
		//System.out.println(animals.peek());
		//System.out.println(animals.pop());
//		//	System.out.println(animals.peek());
//			animals.pop();
//			System.out.println(animals);
//			animals.push("hen");
//			System.out.println(animals);
//			
		
		
		
		}
	}


