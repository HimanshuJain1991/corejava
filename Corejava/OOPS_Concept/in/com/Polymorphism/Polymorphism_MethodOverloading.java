package in.com.Polymorphism;

public class Polymorphism_MethodOverloading {
	public void read() {
		System.out.println("Students reads book");
	}
	public void read(int price,String b_name) {
		System.out.println("book price and Name= "+price);
	    System.out.println("book name: "+b_name);
	}
	public void read(int page,String b_name,String b_color) {
		System.out.println("book page"+page);
		System.out.println("book name"+b_name);
		System.out.println("book color "+b_color);
	}
	public static void main(String[] args) {
		Polymorphism_MethodOverloading pe=new Polymorphism_MethodOverloading();
		pe.read();
		pe.read(1548, "Java");
		pe.read(100, "Core_Java", "Red");
	}

}
