package in.com.exercise;

public class Second_Largest_Number {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,80,90,100,43 };
		
		int a=0;
		int b=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>b) {
				
				a=b;
				b=arr[i];
				
				
				
			}
			
			
			if (arr[i]<b && a> arr[i]) {
				
				a=arr[i];
				
			}
			
		}
		System.out.println(a);

	}

}
