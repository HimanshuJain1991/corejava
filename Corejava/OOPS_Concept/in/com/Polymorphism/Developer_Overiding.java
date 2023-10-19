package in.com.polymorphism;

public class Developer_Overiding   extends Employee_Overiding{
   private String d_name;
   private int d_salary;
   
   public void setD_name(String d_name) {
	this.d_name = d_name;
}
   public String getD_name() {
	return d_name;
}
   public void setD_salary(int d_salary) {
	this.d_salary = d_salary;
}
   public int getD_salary() {
	return d_salary;
}
   public void showDetails() {
	   
	   System.out.println("Developer method is calling");
	   System.out.println("developer name"+ getD_name());
	   System.out.println("developer salary"+ getD_salary());
   }
}
