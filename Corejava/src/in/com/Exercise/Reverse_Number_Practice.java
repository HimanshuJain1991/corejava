package in.com.Exercise;

public class Reverse_Number_Practice {

	public static void main(String[] args) {
		int num=371;
		int sum=0;
		int rem;
		int temp=num;
//		while(num>0) {
//			rem=num%10;
//			sum=sum*10+rem;
//			num=num/10;
//		}
//System.out.println(sum);
//	}
       while(num>0) {
    	   rem=num%10;
    	   sum=sum+(rem*rem*rem);
    	   num=num/10;
       }
       if(temp==sum) {
       System.out.println("aremstrong"+sum);
       }
       else {
    	   System.out.println("not");
       }
}
}
