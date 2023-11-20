package in.com.array;

public class ArrayOneDimensional {

	public static void main(String[] args) {
		int array[]=new int[5];
		for(int i=0;i<5;i++) {
			array[i]=i;
			System.out.println(array[i]);
			if(array[i]==3) {
				System.out.println("Stop");
				System.exit(1);
				
			}
		}
		

	}

}
