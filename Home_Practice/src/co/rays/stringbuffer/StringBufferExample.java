package co.rays.stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Himanshu");
		sb.append(" Jain");
		System.out.println(sb);
		sb.insert(13, "Rays");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}

}
