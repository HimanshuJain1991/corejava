package in.com.Batch;

public class StringBuffer_Example {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Vijay ");
		sb.append("Dinanath Chouhan");
		System.out.println(sb);
		System.out.println("Length"+ sb.length());
		System.out.println("Capacity"+sb.capacity());
		System.out.println("char At:"+sb.charAt(9));
		System.out.println("Index of"+sb.indexOf("Dinanath"));
		System.out.println("replace "+sb.replace(0,5,"Jay"));
		System.out.println("Revrse"+sb.reverse());

	}

}
