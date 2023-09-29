package in.com.Batch;

public class Str_Opration_Home {

	public static void main(String[] args) {
		String str="Himanshu Kumar Jain";
		System.out.println("length is: "+str.length());
		System.out.println("Upper case: "+str.toUpperCase());
		System.out.println("lower case: "+str.toLowerCase());
		System.out.println("chat At 5th "+str.charAt(4));
		System.out.println("replace"+str.replace("a", "b"));
		System.out.println("index fof m"+str.indexOf("m"));
		System.out.println("index of Jain: "+str.indexOf("Jain"));
		System.out.println("last index of i "+str.lastIndexOf("i"));
		System.out.println("start with Himanshu: "+str.startsWith("Himanshu"));
		System.out.println("End with Jain "+str.endsWith("Jain"));
		System.out.println("Substring "+str.substring(15));
		
		

	}

}
