package in.com.threads_example;

class Task1 implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				
			System.out.println("Task1= "+i);
			Thread.sleep(2000);
			}
		} catch (Exception e) {
		e.getStackTrace();
		}
		
		
		
	}
	
}
class Task2 implements Runnable{

	
	
	@Override
	public void run() {
		try {
			for(int j=0;j<5;j++) {
				
				System.out.println("Task2= "+j);
				Thread.sleep(2000);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}

public class Task {

	public static void main(String[] args) {
   Thread t=new Thread(new Task1());
   t.start(); 
   
   try {
	t.join();
	   
} catch (Exception e) {
	// TODO: handle exception
}
   Thread t1=new Thread(new Task2());
   t1.start();
 
	}

}
