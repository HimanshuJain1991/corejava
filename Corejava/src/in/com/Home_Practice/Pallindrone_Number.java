package in.com.Home_Practice;

public class Pallindrone_Number {

	public static void main(String[] args) {
		int rem,sum=0,num=121;
		int temp=num;
   while(num>0) {
	   rem=num%10;
	   sum=(sum*10)+rem;
	   num=num/10;
	   
   }
   if(temp==sum) {
   System.out.println("Number Is Pallindrone");
	}
   else {
	   System.out.println("Number is not pallindrone");
   }
	}

}
