package in.com.equalsvshascode;

public class Employee {
public int emp_id;
public String emp_name;
public int emp_salary;
public Employee(int emp_id,String emp_name,int  emp_salary) {
	this.emp_id=emp_id;
	this.emp_name=emp_name;
	this.emp_salary=emp_salary;
}
@Override
	public boolean equals(Object obj) {
		if((obj instanceof Employee)) {
		return true;
	}
       Employee e=(Employee)obj; 
       boolean b=this.emp_id==e.emp_id&& this.emp_name==e.emp_name&&this.emp_salary==e.emp_salary;
       return b;
}
@Override
	public int hashCode() {
		String str=emp_id+emp_name+emp_salary;
		return str.hashCode();
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return emp_id+emp_name+emp_salary;
	}
}
