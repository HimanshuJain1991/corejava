package in.com.home_practice;

public class Pallindrone_Number {

	public static void main(String[] args) {
		int rem,sum=0,num=458;
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
