package in.com.cloning;

public class Shallow_Details {

	public static void main(String[] args) throws CloneNotSupportedException {
	Shallow_Cloning s=new Shallow_Cloning(101,"Himanshu","Indore");
	Shallow_Cloning s2=(Shallow_Cloning) s.clone();
	s2.id=504;
	s2.name="Himanshu";
	s2.address="Ujjain";
	System.out.println(s.name);
	System.out.println(s.id);
	System.out.println(s.address);
	
	

	}

}
