package in.com.threads_example;

 class MyThread implements Runnable {
	 Thread t;
	 public MyThread() {
	   t.start();
	}
	@Override
	public void run() {
		
	System.out.println("MyThread1 start...");
	}
}
 class AnotherThread implements Runnable{
	 public AnotherThread() {
		// TODO Auto-generated constructor stub
	}
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("2nd Thread start...");
	}
 }

public class Thread_Sleep {

	public static void main(String[] args) {
		MyThread my=new MyThread();
		
		
		
		
	}

}
