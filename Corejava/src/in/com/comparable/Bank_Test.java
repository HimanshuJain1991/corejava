package in.com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Bank_Test {

	public static void main(String[] args) {
   ArrayList<Bank> list=new ArrayList<Bank>();
   list.add(new Bank(101, "Hdfc", 0731));
   list.add(new Bank(54, "UCO",72555));
   list.add(new Bank(48, "BOI", 5498));
   System.out.println(list);
   Collections.sort(list);
   System.out.println(list);
   
   

	}

}
