package in.com.wrraperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		int i=5;
		Integer iobj=new Integer(i);
//		Integer iobj=i;//autoboxing
//		System.out.println(i);
//		int j=iobj;//unboxing
//		
		
		
		int o=10;
		Integer obj=new Integer(o);
		int a=obj.intValue();
		System.out.println(a);
		
		int p=Integer.parseInt("9");
		System.out.println(p);
		String name=String.valueOf(5);
		System.out.println(name);

	}

}
