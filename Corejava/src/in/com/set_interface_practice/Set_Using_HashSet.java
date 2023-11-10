package in.com.set_interface_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Using_HashSet {

	public static void main(String[] args) {
	Set  s=new HashSet();
	s.add(101);s.add(45);
	s.add(87);s.add(null);
	s.add(null);
	s.add(47);s.add(14);
	s.add(45);
	System.out.println(s);
	System.out.println(s.contains(45));
	Set synSet=Collections.synchronizedSet(s);
	System.out.println(synSet);
//	s.remove(45);
//	System.out.println(s);

//	s.removeAll(s);
//	System.out.println(s);
//	Iterator it=s.iterator();
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}
//	for (Object object : s) {
//		System.out.println(object);
//		
//	}
	
	}

}
