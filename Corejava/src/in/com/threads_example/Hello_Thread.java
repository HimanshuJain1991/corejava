package in.com.threads_example;

public class Hello_Thread extends Thread {
	private String name=null;
	public Hello_Thread(String  name) {
	  this.name=name;	
	}
	@Override
	public void run() {
		for(int i=0;i<30;i++) {
			System.out.println(i+"#"+name);
			try {
				
				Thread.sleep(5000);
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

	}

	public static void main(String[] args) {
		Hello_Thread ht=new Hello_Thread("Himanshu Jain");
		Hello_Thread ht1=new Hello_Thread("Ram Sharma");
		//System.out.println(ht1.getName());
		
			ht.start();
			ht1.start();
		
		

	}

}
