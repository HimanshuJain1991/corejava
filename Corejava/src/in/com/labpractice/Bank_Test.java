package in.com.labpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank_Test {

	public static void main(String[] args) {
		Bank b=new Bank(101, "HDFC", "Ranjeet Hanumaan");
		Bank b1=new Bank(102, "Bank of India", "Vijay Nagar");
        ArrayList list=new ArrayList();
        list.add(b);list.add(b1);
       
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        for (Object object : list) {
			System.out.println(object);
			
		}
        Iterator it=list.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
	}

}
