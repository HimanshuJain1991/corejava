
public class Instanceof_Check {

	public static void main(String[] args) {
		Instanceof_Check cl=new Instanceof_Check();
		boolean result= (cl instanceof Instanceof_Check);
		System.out.println(result);
		
		String i="Hi";
		boolean b=(i instanceof String);
		System.out.println(b);
		
		
		//Escape Sequence
		System.out.println("Himanshu Jain \" Shruti\".");
		
		System.out.println("Welcome to rays \t Himanshu Jain");
        System.out.println("Ram is true \b ");
        //System.out.println("my name is himanshu jain \n good morning");
        System.out.println("my name is himanshu jain \r good morning");
        System.out.println("my name is himanshu jain \f good morning");
        System.out.println("my name is himanshu jain  \'good morning\'");
        System.out.println("\\-my name is himanshu jain  good morning");
	}
}
