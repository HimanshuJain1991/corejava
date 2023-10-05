package in.com.Polymorphism;

public class Employee_Overiding  {
	private  int e_id;
	private String e_name;
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getE_id() {
		return e_id;
	} 
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_name() {
		return e_name;
	}
    public void showDetails() {
    	
    	System.out.println("Employee Details call");
    	System.out.println("Employee id"+getE_id());
    	System.out.println("Employee name "+getE_name());
    	
    	
    	
    }
}
