package in.com.CollectionFramework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Example {

	public static void main(String[] args) {
		Queue<Integer> num= new PriorityQueue<Integer>(Comparator.reverseOrder());
		num.offer(199+1);num.offer(2);
		num.offer(5);num.offer(4);num.add(1);
		num.offer(125);
		System.out.println(num);
//		//System.out.println(num.element());
//		System.out.println(num.peek());
//       num.poll();
//       System.out.println(num);
       Iterator it=num.iterator();
      
      while(it.hasNext()) {
    	    Object obj=it.next();
	   System.out.println(obj);
       }

	}

}
