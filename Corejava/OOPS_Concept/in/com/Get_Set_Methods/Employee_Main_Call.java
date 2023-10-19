package in.com.get_set_methods;

public class Employee_Main_Call {

	public static void main(String[] args) {
		Bus_Employee bs=new  Bus_Employee();
		bs.setBus_num("MP-09 RC 5452");
		bs.setEmp_department("Bus Driver");
		bs.setEmp_id(101);
		bs.setEmp_salary(25000);
		
		
		System.out.println(bs.getBus_num());
        System.out.println(bs.getEmp_department());
        System.out.println(bs.getEmp_id());
        System.out.println(bs.getEmp_salary());
        
        bs.setEmp_department("Railway department");
       System.out.println(bs.getEmp_department());
       
       bs.setEmp_salary(5648);
       System.out.println(bs.getEmp_salary());
	}

}
