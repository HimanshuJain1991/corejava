package in.com.thrad_test_class;
class My_Rays extends Thread{
	@Override
	public void run() {
		synchronized (this) {
		for(int i=0;i<3;i++) {
			
			try {
				wait();
				//Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+"Himanshu Jain");
			} catch (Exception e) {
				e.printStackTrace();
			}
			notifyAll();
			
		}
		
	}
}
}
class My_Rays1 implements Runnable{

	@Override
	public void run() {
		 synchronized (this) {
		 for(int i=0;i<=3;i++) {
				try {
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName()+" "+"Ram Sharma");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
				
			}
		}
	
	
}
public class MyThread_Create  {
	public static void main(String[] args) {
		My_Rays my=new My_Rays();
		my.start();
	  My_Rays1 my1=new My_Rays1();
	  Thread t2=new Thread(my1);
	  t2.start();
	
		
		
	
	}
	
	
}
