package in.com.CollectionFramework;

public class Employee_Same_Object {
	private int id=0;
	private String name=null;
	private String address=null;
	public Employee_Same_Object(int id ,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee_Same_Object)) {
			return false;
		}
        //return false;
        Employee_Same_Object e=(Employee_Same_Object) obj;
        boolean b=this.id==e.id &&this.name==e.name&&this.address==e.address;
        return b; 
	}
	@Override
	public int hashCode() {
		String str=id+" "+name+" "+address;
		//return str.hashCode();
		return str.hashCode();
	}

}
