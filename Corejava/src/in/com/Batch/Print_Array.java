package in.com.Batch;

public class Print_Array {

	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
	   printArray(new int[] {100,200,300,400});

	}

}
