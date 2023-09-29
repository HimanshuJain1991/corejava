package in.com.Polymorphism;


public class MethodOverloading_TypePromation {

	public static  void sum(int a,int b) {
		long add=a+b;
		System.out.println("sum is "+ add);
	}
	public static void sum(long a,long b) {
		long sum1=a+b;
		System.out.println("2nd sum method s ");
	}
	public static void main(String[] args) {
		//static method can call both way through Object and Static way
		
		//new MethodOverloading_TypePromation().sum(15, 85);
		//new MethodOverloading_TypePromation().sum(45,78);
         //MethodOverloading_TypePromation mtp=new MethodOverloading_TypePromation();
         //mtp.sum(45, 78);
        // mtp.sum(45, 78);
		MethodOverloading_TypePromation.sum(45, 4);
		MethodOverloading_TypePromation.sum(12, 36);
	}

}
