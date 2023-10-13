package in.com.CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue <Integer> pr=new PriorityQueue<Integer>(Comparator.reverseOrder());
         pr.offer(101);
         pr.offer(201);
         pr.offer(301);
         pr.offer(10 );
         pr.offer(1);
         System.out.println(pr);
         
         pr.poll();
         System.out.println(pr);
         pr.poll();
         System.out.println(pr);
         pr.offer(122);
         System.out.println(pr);
        // pr.peek();
         System.out.println(pr.peek());
	}

}
