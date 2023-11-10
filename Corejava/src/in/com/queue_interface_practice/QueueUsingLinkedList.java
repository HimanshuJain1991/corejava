package in.com.queue_interface_practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		LinkedList link= new LinkedList();
		Queue q=link;
		q.offer(101);q.offer(215);
		q.offer(587);
		q.add(4590);
		q.add(1);
		q.add(null);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());

	}

}
