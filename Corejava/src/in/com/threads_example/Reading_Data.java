package in.com.threads_example;

class Book3{
	synchronized void  reading() {
		
		
		String s=Thread.currentThread().getName();
		System.out.println(s+" :Student reading book");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	synchronized void writeName() {
		String s=Thread.currentThread().getName();
		System.out.println(s+":Author write");
		try {
			Thread.sleep(2000);
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}
class StudentThread implements Runnable{
	Book3 b3;
	public StudentThread(Book3 b3) {
		this.b3=b3;
	
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		b3.reading();
		
	}
	  
}
class Author2 implements Runnable{
	Book3 b3;
	public Author2(Book3 b3) {
		this.b3=b3;
	}
   
	@Override
	public void run() {
	b3.writeName();
		
	}
	
}
public class Reading_Data {

	public static void main(String[] args) {
      	Book3 b3= new Book3();
      	Thread t3=new Thread(new StudentThread(b3));
     // t3.setName("Student");
      	t3.start();
      	
      	Thread t4=new Thread(new StudentThread(b3));
      	t4.start();
      	Thread t5=new Thread(new Author2(b3));
      	t5.setName("Thread ");
      	t5.start();
      	

	}

}
