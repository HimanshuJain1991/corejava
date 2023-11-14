package in.com.string_practice;

public class StringOperations {

	public static void main(String[] args) {
	  String  name="Himanshu Kumar Jain";
	  String add=" is software developer";
	  //String name1="Himanshu Jain";
     //  System.out.println(name.hashCode()+" = "+name1.hashCode());
       System.out.println(name.charAt(2));
       System.out.println(name.length());
       System.out.println(name.concat(add));
       System.out.println(name.replace("Kumar","New"));
      System.out.println(name.startsWith("H"));
      System.out.println(name.endsWith("Jain"));
      System.out.println(name.substring(8));
      

	}

}
