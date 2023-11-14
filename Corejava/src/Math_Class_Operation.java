import java.util.Random;

public class Math_Class_Operation {

	public static void main(String[] args) {
	System.out.println(Math.sqrt(5));
	System.out.println(Math.abs(22));
	System.out.println(Math.PI);
	System.out.println(Math.ceil(4.5));
	System.out.println(Math.max(25, 84));
	System.out.println(Math.min(58, 2));
	System.out.println(Math.cbrt(2));
	System.out.println(Math.E);
	System.out.println(Math.random());
	int r=(int)Math.random()*100;
System.out.println(r);
      Random ran=new Random();
      
      for(int i=0;i<=5;i++) {
    	int r1=  ran.nextInt(100 );
    	//System.out.println("random number"+i+"st is= "+r1);
    	System.out.println(r1);
      }
      
      
     
     
	}

}
