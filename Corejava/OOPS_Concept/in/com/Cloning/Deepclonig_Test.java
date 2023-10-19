package in.com.cloning;

public class Deepclonig_Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Deepcloning2 d4=new Deepcloning2("Himanshu Jain", 101);
		Deepcloning2 d5=(Deepcloning2) d4.clone();
		d5.name="Ram Sharma";
		d5.d1.id=504;
		System.out.println(d4.name);
		System.out.println(d4.d1.id);
		System.out.println(d5.name);
		System.out.println(d5.d1.id);
	}

}
