package in.com.Polymorphism;

public class Method_Overriding_Test {

	public static void main(String[] args) {
//		Employee_Overiding eo=new Employee_Overiding();
//		eo.setE_id(101);
//		eo.setE_name("Ram ");
//		eo.showDetails();
//		
	//	overriding
Developer_Overiding doe=new Developer_Overiding();
		doe.setD_name("Himanshu Jain");
		doe.setD_salary(54878);	//	doe.showDetails();
		
		
		Employee_Overiding eo1= new Developer_Overiding();
		//new Developer_Overiding().setD_name("Lokesh");
		//new Developer_Overiding().setD_salary(454545);
		eo1.showDetails();
	
	

	}

}
