package in.com.batch;

public class Array_Sort_Example {

	public static void main(String[] args) {
		int array1[]= new int[] {200,5,10,40,60,55,45,89};
		//int array2[]= {2,3,4,5,6};
		int max=array1[0];
		//System.out.println(array1[0]);
		for (int i = 0; i < array1.length; i++) {
			
			if(array1[i]>max) {
				//System.out.println(array1[i]);
				max=array1[i];
				
			}
			
		}
		System.out.println("max is:"+max);
		}

	}


