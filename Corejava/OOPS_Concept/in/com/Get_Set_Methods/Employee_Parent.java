package in.com.Get_Set_Methods;

 class Employee_Parent {
	private int emp_id;
	private int emp_salary;
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}public int getEmp_id() {
		return emp_id;
		
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	public int getEmp_salary() {
		return emp_salary;
	}

}
 class Railway_Employee extends Employee_Parent{
	private  String emp_department;
	
	
	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	public String getEmp_department() {
		return emp_department;
	}
 }
 
 class Bus_Employee extends Railway_Employee {
	 private String bus_num;
	 public void setBus_num(String bus_num) {
		this.bus_num = bus_num;
	}
	 public String getBus_num() {
		return bus_num;
	}
 }
