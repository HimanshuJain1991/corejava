package in.com.batch;

public class ForEach {
  public static void main(String[] args) {
	 int i[]= {1,2,3,4,5,6};
	 
	 for(int j:i) {
		 
		 System.out.println("number is"+j);
		 
		for(int r=i.length-1;r>=0;r--) {
			 System.out.println("reverse"+r);
		 }
	 }
}
}


