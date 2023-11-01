package in.com.class_test_practice;

public class Rays_Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Rays2 r3=new Rays2("Himanshu Jain", 205);
		Rays2 r4=(Rays2) r3.clone();
		r4.name="Ram";
		r4.r1.rays_Id=505;
		System.out.print(r3.name+" ");System.out.println(r3.r1.rays_Id);
		System.out.print(r4.name+" ");System.out.println(r4.r1.rays_Id);

	}

}
