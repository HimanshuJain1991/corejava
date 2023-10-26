package in.com.equalsvshascode;

public class Employee_Test {

	public static void main(String[] args) {
		Employee e=new Employee(111, "Himanshu Jain", 505000);
		Employee e1=new Employee(111, "Himanshu Jain", 505000);
          System.out.println(e);
          System.out.println(e1);
          System.out.println(e.equals(e1));
          System.out.println(e.hashCode()+" "+e1.hashCode());
	}

}
