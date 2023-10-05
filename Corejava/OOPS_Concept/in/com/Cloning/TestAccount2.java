package in.com.Cloning;

public class TestAccount2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer2 c2=new Customer2(105, 60000, "Himanshu Jain");
		Customer2 c3= (Customer2) c2.clone();
//		c3.c_id=444;
//		c3.a2.salary=787878;
//		c3.a2.name="Ram bhai";
		System.out.println(c2.c_id);
		System.out.println(c2.a2.name);
		System.out.println(c2.a2.salary);
		System.out.println(c3.c_id);
		System.out.println(c3.a2.name);
		System.out.println(c3.a2.salary);
		

	}

}
