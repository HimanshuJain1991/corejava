package in.com.set_interface_practice;

import java.util.HashSet;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
	Set s=new HashSet();
	s.add("Ram");s.add(null);
	//System.out.println(s.add(null));
	s.add("null2");s.add("Ram");

	System.out.println(s);

	}

}
