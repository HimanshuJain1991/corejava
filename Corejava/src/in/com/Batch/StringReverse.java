package in.com.batch;

public class StringReverse {
	
	public static void main(String[] args) {
		String name="Himanshu Jain";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			 reverse=reverse+name.charAt(i);
		}
		System.out.println(name);
		System.out.println(reverse);
	}

}
