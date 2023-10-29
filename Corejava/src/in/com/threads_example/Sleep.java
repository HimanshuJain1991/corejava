package in.com.threads_example;

public class Sleep extends Thread {
	
	
   @Override
public void run() {
	try {
		  for(int i=0;i<=5;i++) {
			  System.out.println(Thread.currentThread().getState());
			  Thread.sleep(3000);
			  
			  
			 
		  }
//		  for(int j=0;j<=5;j++) {
//			  
//		  }
		  
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
   public static void main(String[] args) {
     Sleep s=new Sleep();
	s.start();

	
//	Sleep s1=new Sleep();
//	s1.start();
//	
	try {
		s.join();
		for(int j=0;j<=5;j++) {
			//System.out.println(j+"="+"Main class");
			System.out.println(Thread.currentThread().getName());
			
			Thread.sleep(3000);
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	
}
  
}

