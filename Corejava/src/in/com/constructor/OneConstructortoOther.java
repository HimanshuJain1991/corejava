package in.com.constructor;

public class OneConstructortoOther {
	public int marks=0;
	public String name=null;
	public OneConstructortoOther(int marks,String name) {
		this.marks=marks;
		this.name=name;
		System.out.println("marks="+this.marks+"Name"+this.name);
	}
	public OneConstructortoOther(int marks,String name,String address) {
		this(marks,name);
		System.out.println("address is"+address);
		
	}

	public static void main(String[] args) {
      OneConstructortoOther one=new OneConstructortoOther(100, "Riyansh Jain", "Indore");

	}

}
