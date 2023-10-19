package in.com.home_practice;

public class Second_Largest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,80,90,100,33 ,6,9,8};
		
		int a=0;
		int b=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>b) {
				
				a=b;
	 			b=arr[i];
				
				
				
			}
			
			
			if (arr[i]<b && a< arr[i]) {
				
				a=arr[i];
				
			}
			
		}
		System.out.println(a);

	} 


}
