package in.com.cloning;

public class Himanshu_Clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Lokesh_Clone lk= new Lokesh_Clone("Ram",101);
		Lokesh_Clone lk1=(Lokesh_Clone) lk.clone();
		lk1.name="Hariom";
		lk1.ac.balance=145;
		System.out.println(lk.name);
		System.out.println(lk.ac.balance);
		System.out.println(lk1.name);
		System.out.println(lk1.ac.balance);

	}

}
