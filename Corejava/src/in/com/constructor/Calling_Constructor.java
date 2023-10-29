package in.com.constructor;

public class Calling_Constructor {
	public int id=0;
	public String name=null;
	Calling_Constructor(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println(this.id);
		System.out.println(this.name);
		
	}
	public Calling_Constructor(String n,int id,String name) {
		
		this(id,name);//1st line overloaded constructor
		
		System.out.println(n);
	}

	public static void main(String[] args) {
		Calling_Constructor c=new Calling_Constructor("Hiamnshu Jain", 101, "Indore");
 
	}

}
