package in.com.CollectionFramework;

public class Test_Same_Object {

	public static void main(String[] args) {
	Employee_Same_Object es=new Employee_Same_Object(101, "Himanshu Jain", "Indore");
	Employee_Same_Object es1=new Employee_Same_Object(101, "Himanshu Jain", "Indore");
	
	System.out.println(es.equals(es1));
	System.out.println(es.hashCode());
	System.out.println(es1.hashCode());

	}

}
