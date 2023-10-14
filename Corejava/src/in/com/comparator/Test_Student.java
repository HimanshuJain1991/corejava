package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Student {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student("Jain"));
		al.add(new Student("Agrawal"));
		al.add(new Student("Bansal"));
		System.out.println(al);
		Collections.sort(al,new CompareByLastName());
		System.out.println(al);
		

	}

}
