package in.com.Batch;

public class Practice_All {

	public static void main(String[] args) {
		String name="Himanshu Kumar Jain";
		System.out.println("length= "+name.length());
		System.out.println("upper case="+ name.toUpperCase());
		System.out.println("lower case"+name.toLowerCase());
		System.out.println("start with ="+name.startsWith("Himanshu"));
		System.out.println("Ends with= "+name.endsWith("Jain"));
		System.out.println("index of=  "+name.indexOf("m"));
		System.out.println("last index of n ="+name.lastIndexOf("n"));
		System.out.println("char at ="+name.charAt(2));
		System.out.println("replace "+name.replace("i", "a"));
		System.out.println("index of Jain="+name.indexOf("Jain"));
		System.out.println("Substring "+name.substring(7));
		
		//String Buffer
		StringBuffer sb=new StringBuffer("Riyansh ");
		System.out.println("String append using string buffer"+sb.append("  Kumar Jain"));
		System.out.println("String Length using String Buffer"+sb.length());
		System.out.println("String capacity using String Buffer"+sb.capacity());
		System.out.println("String Buffer char At  ="+ sb.charAt(5));
		// System.out.println("String Buffer Reverse"+sb.reverse());
		System.out.println("String Buffer replace "+sb.replace(0, 6, "Himanshu"));
		System.out.println("String Buffer index of"+sb.indexOf("Jain"));
		
		

	}

}
