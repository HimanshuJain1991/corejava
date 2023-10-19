package in.com.get_set_methods;


 class Test {
	 int a;
     double b;
     String c;
     public Test() {
    	 a=10;b=20;c="Himanshu Jain";
    	 System.out.println("Default");
     }
     public Test(double y,String s) {
    	 
    	 b=y;
    	 c=s;
    	 System.out.println("parametized 2");
    	 
     }
     public Test(int t,double z,String e) {
    	 a=t;
    	 b=z;
    	 c=e;
    	 System.out.println("3 parametized");
    
     }
}
public class Overloading{
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(101,"Ram");
		Test t3=new Test(201,30.9,"Lokesh");
		System.out.println(t1.a+" "+t1.b+" "+" "+t1.c);
		System.out.println(t2.b+" "+t2.c);
		System.out.println(t3.a+" "+t3.b+" "+t3.c);
		//System.out.println(new Test().b);
		
		
	}
}