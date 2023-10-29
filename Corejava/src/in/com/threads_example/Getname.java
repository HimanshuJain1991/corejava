package in.com.threads_example;
class Name_Thread extends Thread{
//	public Name_Thread(String name) {
//		super(name);
//	}
	@Override
	public void run()  {
		
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Thread Runnin name= "+getName()+"\n");
			
				Thread.sleep(5000);
			}
			
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		super.run();
	}
}

public class Getname {

	public static void main(String[] args) {
		Name_Thread nt=new Name_Thread();
		Name_Thread nt1=new Name_Thread();
		nt.setName("Thread 1 start");
		nt1.setName("Thread 2 start");
  nt.start();
  nt1.start();
  
	}

}
