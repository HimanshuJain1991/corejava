package in.com.clone_practice;

public class Customer_Employee_Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e=new Employee(101, "Himanshu Jain", "Indore");
		Employee e1=(Employee) e.clone();
		e1.c.id=222;e1.empName="Shruti Jain";e1.empAddress="Ujjain";
		System.out.println(e.c.id+" "+e.empName+" "+e.empAddress);
		System.out.println(e1.c.id+" "+e1.empName+" "+e1.empAddress);
	

	}

}
