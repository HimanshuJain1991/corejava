package in.com.HomePractice1;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList_Queue {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.offer("Himanshu Jain");
		q.offer("Shruti");
		q.offer("akshat");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        
	}

}
