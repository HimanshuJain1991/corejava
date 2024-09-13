package co.rays.stringbuffer;

public class StringMethods {

	public static void main(String[] args) {
		String n="Himanshu Kumar Jain";
		System.out.println(n.charAt(1));
		System.out.println(n.length());
		System.out.println(n.indexOf("i"));
		System.out.println(n.lastIndexOf("i"));
		System.out.println("replace method==>"+n.replace("i", "k"));
		System.out.println("to lower case method"+n.toLowerCase());
		System.out.println("upper case method"+n.toUpperCase());
		System.out.println(n.substring(8));
		System.out.println("substring"+n.substring(0, 8));

	}

}
	