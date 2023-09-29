package in.com.Batch;

public class String_Buffer_Home {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Himanshu Kumar");
		sb.append(" Jain");
		System.out.println(""+sb);
		//System.out.println("Reverse "+sb.reverse());
		System.out.println("length "+sb.length() );
		System.out.println("capacity"+sb.capacity());
		System.out.println("index of "+sb.indexOf("i"));
		System.out.println("char at "+sb.charAt(12));
		System.out.println("replace "+sb.replace(0, 8, "Suresh "));
		

	}

}
