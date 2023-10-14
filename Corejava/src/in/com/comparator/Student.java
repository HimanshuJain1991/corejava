package in.com.comparator;

public class Student {
     String stu_last_name;
     public Student( String stu_last_name) {
		this.stu_last_name=stu_last_name;
	}
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return stu_last_name.toString();
    }
}

