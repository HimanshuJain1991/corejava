package in.com.comparator;

import java.util.Comparator;

public class CompareByLastName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.stu_last_name.compareTo(o2.stu_last_name);
	}

}
