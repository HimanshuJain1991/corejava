package in.com.collectionframework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		s.add(11);s.add(45);s.add(78);s.add(58);s.add(45);
		System.out.println(s);
		Set<Integer>s1=new TreeSet<Integer>();
		s1.add(12);s1.add(76);s1.add(45);s1.add(45);
		System.out.println(s1);

	}

}
