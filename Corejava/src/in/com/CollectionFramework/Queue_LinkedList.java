package in.com.collectionframework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_LinkedList {

	public static void main(String[] args) {
		Queue<String> q= new LinkedList<String>();
//		//q.add("Indore");q.add("Ujjain");q.add("Mumbai");q.add("Delhi");
//		System.out.println(q);
//		q.poll();//delete first enter
//		System.out.println(q);
//		
//		System.out.println(q.element());//first element show
        q.offer("Neemauch");
		q.offer("Agar");
		q.offer("Delhi");
		q.offer("Ujjain");
		System.out.println(q);
		System.out.println("deleted city is: "+q.poll());//delete the elements
		System.out.println(q);
		System.out.println(q.peek());

	}

}
