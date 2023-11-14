package in.com.string_practice;

public class StringBuffer_Example {

	public static void main(String[] args) {
	  //StrinBuuffer  class is used to create mutable string.String Buffer is 
	  //same as String.except it is mutable i.e it can be changed.
     StringBuffer sb=new StringBuffer("This is Java");
     sb.append(" Java is OOps");
     sb.append(" Java is promising Job");
     System.out.println(sb);
     System.out.println(sb.length());
     System.out.println(sb.capacity());
     System.out.println(sb.charAt(2));
     System.out.println(sb.indexOf("Job"));
     System.out.println(sb.replace(44, 47, "Placement"));
     System.out.println(sb.reverse());
     
	}

}
