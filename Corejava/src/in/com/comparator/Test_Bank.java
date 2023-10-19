package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Bank {

	public static void main(String[] args) {
		ArrayList<Bank> list=new ArrayList<Bank>(); 
		list.add(new Bank(101, "Himanshu Jain"));
		list.add(new Bank(540, "Shruti jain"));
		list.add(new Bank(8, "Ram Sharma"));
		System.out.println(list);
		Collections.sort(list,new BankbyId());
		System.out.println(list);

	}
 
}
