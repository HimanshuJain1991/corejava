package in.com.threads_example;
class Employee{
	public int emp_id=0;
	public String emp_name=null;
	public Employee(int emp_id,String emp_name) {
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	synchronized void registration(Employee e4) {
		try {
			
			 System.out.println("Emplyee Registration");
			 String s=Thread.currentThread().getName();
			System.out.println(s+"="+e4.getEmp_id()+" "+e4.getEmp_name());
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
     
	}
}

class MyThread_Demo extends Thread{
	Employee e1;	
	public MyThread_Demo(Employee e1) {
		this.e1=e1;
	
	}
	public void run() {
		e1.registration(e1);
		super.run();
	}
}

public class Demo_Test {

	public static void main(String[] args) {
		Employee e2=new Employee(1001, "Himanshu");
		Employee e3=new Employee(4545, "Ram Sharma");
		
		Thread t1=new Thread(new MyThread_Demo(e2));
		t1.start();
		
		try {
			Thread.sleep(5000);
			Thread t2=new Thread(new MyThread_Demo(e3));
			t2.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
		


	}

}
