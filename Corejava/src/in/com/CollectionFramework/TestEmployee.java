package in.com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Himanshu", "Indore");
		Employee e2=new Employee(201, "Ram", "Ujjain");
		ArrayList list=new ArrayList();
		list.add(e1);
		list.add(e2);
		System.out.println(list);
		//list.get(0);
		System.out.println("index 0 postion" +list.get(1));
		
		Iterator t=list.iterator();
		System.out.println(t.next());
		System.out.println("while loop");
         while(t.hasNext()) {
      	t.next();
      //	list.equals(0);  
     // 	System.out.println();
        	
   
		//Method 1
		Employee e=(Employee) list.get(0);
		System.out.println(e);//problem create it get hashcode so here we use toStrig() method
		
		
		//Method 2
		System.out.println("-----Using for Loop-------");
            for (int i = 0; i < list.size(); i++) {
				Employee e4=(Employee) list.get(i);
				System.out.println(e4);
			}
            
            //Method 3 foreach Loop
            System.out.println("-----Foreach loop---------");
            for (Object object : list) {
				Employee e5=(Employee) object;
				System.out.println(e5);
			
			}
            System.out.println("-------Iterator is working------");
            Iterator it=list.iterator();
            while(it.hasNext()) {
            	Employee em=(Employee) it.next();
            	System.out.println(em);
            }
            
	}

	}
}
