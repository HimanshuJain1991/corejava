package in.com.class_test_practice;

public class Employee {
   public int id;
   public String name;
   public String address;
   public Employee(int id,String name,String address) {
	   this.id=id;
	   this.name=name;
	   this.address=address;
	
}
   public void setId(int id) {
	this.id = id;
}
   public int getId() {
	return id;
}
   public void setName(String name) {
	this.name = name;
}
   public String getName() {
	return name;
}
   public void setAddress(String address) {
	this.address = address;
}
   public String getAddress() {
	return address;
}
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+address;
	}
}
