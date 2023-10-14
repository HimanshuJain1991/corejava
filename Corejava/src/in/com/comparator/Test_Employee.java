package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class Test_Employee {

	public static void main(String[] args) {
      ArrayList <Employee>al=new ArrayList<Employee>();
      al.add(new Employee(501, "Himanshu Jain", "9826"));
      al.add(new Employee(101, "Ram Sharma", "68 "));
      al.add(new Employee(103, "Amit Bansal", "12"));
      al.add(new Employee(111,"Sunil Shau Sir", "1"));
       System.out.println("list"+al);
    
      Collections.sort(al,new CompareById());
      System.out.println("Compare By Id");
      System.out.println(al);
      
      
    ArrayList<Employee> a2=new ArrayList<Employee>(al);
    
      Collections.sort(a2, new CompareByName());
      System.out.println("Compare By Name");
      System.out.println(a2);
        
      ArrayList<Employee> a3=new ArrayList<Employee>(al);
      Collections.sort(a3,new CompareByPhone());
      System.out.println("Compare By Phone");
      System.out.println(a3);
      
      

	}

}
