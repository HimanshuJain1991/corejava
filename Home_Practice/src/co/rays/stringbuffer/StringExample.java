
package co.rays.stringbuffer;

public class StringExample {

public static void main(String[] args) {
	String s1="Himanshu";
	String s2="Himanshu";
	String s3=new String("Jain");
	String s4=new String("Jain");
	boolean result=(s1==s2);
	System.out.println(result);
	boolean result1=(s3==s4);
	System.out.println(result1);
	boolean result3=s3.equals(s4);
	System.out.println(result3);
	
}
}
