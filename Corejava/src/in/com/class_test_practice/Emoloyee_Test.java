package in.com.class_test_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Emoloyee_Test {

	public static void main(String[] args) {
		Employee e=new Employee(101, "Himanshu Jain", "Indore");
		Employee e1=new Employee(102,"Ram Sharma","Ujjain");
	ArrayList list=new ArrayList();
    list.add(e);list.add(e1);
    Employee e2=(Employee) list.get(0);
    System.out.println(e2);
   // System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getAddress());
    System.out.println("-----For Loop-------");
	for(int i=0;i<list.size();i++) {
		//System.out.println(list.get(i));
	Employee e4=(Employee)list.get(i);
	System.out.println(e4);
	}
	System.out.println("------For Each Loop-----");
	for (Object object : list) {
		System.out.println(object);
	}
	System.out.println("----Iterator---");
	Iterator it=list.iterator();
	while(it.hasNext()) {
		Employee e5=(Employee)it.next();
		System.out.println(e5);
	}
	}
	}

