package in.com.batch;

public class Mind_Test {

	public static void main(String[] args) {
		String str="Himanshu Kumar Jain";
		
		System.out.println(str.charAt(5));
		System.out.println(str.substring(5));
		System.out.println(str.indexOf("m"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("a", "b"));
		System.out.println(str.concat("Hariom"));
		System.out.println(str.startsWith("Himanshu"));
		System.out.println(str.endsWith("n"));
		
		StringBuffer sdb=new StringBuffer("Ram Ji Sharma indore ");
      // System.out.println(sdb);
       System.out.println(sdb.append("Hariom"));
       System.out.println(sdb.capacity());
       System.out.println(sdb.length());
       System.out.println(sdb.charAt(5));
       System.out.println(sdb.indexOf("i"));
       System.out.println(sdb.replace(0, 5, "Himan"));
       System.out.println(sdb.reverse());
       
	}

}
