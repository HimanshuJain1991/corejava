package in.com.class_test_practice;

public class Shallow_Cloning_Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Shallow_Cloning sc=new Shallow_Cloning(101, "Himanshu Jain", "Indore");
		Shallow_Cloning sc1=(Shallow_Cloning) sc.clone();
		 sc1.id=555;
		 sc1.name="Ram";
		 sc1.address="Ujjain";
		 System.out.println(sc.id);
		 System.out.println(sc.name);
		 System.out.println(sc.address);
		 System.out.println(sc1.id);
		 System.out.println(sc1.name);
		 System.out.println(sc1.address);
	}
	

}
