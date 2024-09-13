package co.rays.wrapperclass;

public class WrappingExample {

	public static void main(String[] args) {
		int i=100;
		Integer iObj=new Integer(i);
		System.out.println("wrapper class ==>> "+iObj);
		int j=iObj.intValue();
		System.out.println(j);

	}

}
