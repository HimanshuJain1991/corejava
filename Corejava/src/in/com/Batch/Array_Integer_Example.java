package in.com.Batch;

public class Array_Integer_Example {

	public static void main(String[] args) {
		int []num=new int[6];
		num[0]=101;
		num[1]=102;
		num[2]=103;
		num[3]=104;
		num[4]=105;
		num[5]=106;
		for(int i=0;i<num.length;i++) {
			//System.out.print("  "+num[i]);
			if(num[i]%2==0) {
				System.out.println("Even numbers is="+num[i]);
			}
			else {
				System.out.println("Odd numbers is="+num[i]);
			}
			
		}

	}

}
