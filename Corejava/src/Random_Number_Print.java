
public class Random_Number_Print {

	public static void main(String[] args) {
		 int min=200,max=500;
	      for(int i=1;i<=5;i++) {
	     int a= (int)(Math.random()*((max-min+1)+min));
	     System.out.println("random"+a);
	      }

	}

}
