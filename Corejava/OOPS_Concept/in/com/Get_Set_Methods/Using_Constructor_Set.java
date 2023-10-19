package in.com.get_set_methods;

class Test2{
		String name;
		int salary;
	  public Test2(String name,int salary){
			this.name=name;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
		public int getSalary() {
			return salary;
		}
}
public class Using_Constructor_Set{
	public static void main(String[] args) {
		Test2 t2=new Test2("Himanshu Jain",50000);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
	}
	
}

