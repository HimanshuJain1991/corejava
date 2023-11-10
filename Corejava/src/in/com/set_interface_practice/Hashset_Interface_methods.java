package in.com.set_interface_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_Interface_methods {

	public static void main(String[] args) {
		HashSet hash=new HashSet();
		hash.add("B");
		hash.add("I");
		hash.add("CHirag");
		hash.add(20);
		hash.add("D");
		hash.add("Z");
		hash.add(null);
		hash.add(10);
		hash.add("A");
		//System.out.println(hash.add("Z"));
		System.out.println(hash);
//		Iterator it=hash.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
