package in.com.batch;

public class Array_Example1 {

	public static void main(String[] args) {
		String []name=new String[5];
		name[0]="Himanshu";
		name[1]="Lokesh";
		name[2]="Ram";
		name[3]="Kush";
		name[4]="Rohan";
//		String s=name.getClass().getName();
//		System.out.println(s);
//		float array1[]=new float [5];
//		String d=array1.getClass().getName();
//		System.out.println(d);
//		// String is terminate by null;default value
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
			
			
		}

	}

}
