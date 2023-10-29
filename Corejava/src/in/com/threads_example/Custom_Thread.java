package in.com.threads_example;
class MyThread1 extends Thread{
	public String name;
	public MyThread1(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		
	try {
		for(int i=0;i<=5;i++) {
			
			System.out.println(i+" ->"+name);
			Thread.sleep(2000);
		}
		
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
}
  
public class Custom_Thread extends Thread {
	
	 public String name;
	public Custom_Thread(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				
				System.out.println(i+"="+name);
				Thread.sleep(4000);
		  //		Thread.onSpinWait();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

	public static void main(String[] args) {
		
		MyThread1 m =new MyThread1("Ram sharma");
		m.start();
		Custom_Thread th=new Custom_Thread("Himanshu Jain");
		th.start();
		
		
		
	}

}
