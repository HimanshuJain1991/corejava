package in.com.queue_interface_practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_Example {

	public static void main(String[] args) {//here we can us comparato.reverseOrder()
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.offer(175);
		pq.offer(145);
		pq.add(444);
		pq.add(15);
	
		//pq.add(null); we cannot add null elements in this
		System.out.println("Queue elements: "+pq);
		System.out.println("poll method is calling"+pq.poll());
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.peek());

	}

}
