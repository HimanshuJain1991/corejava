package in.com.threads_example;
class Book1{
	synchronized void Reading() {
		System.out.println("Reading Book");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class StundentName implements Runnable{
	Book1 b1;
	Thread t1;
	public StundentName(Book1 b1) {
		this.b1=b1;
	}

	@Override
	public void run() {
		b1.Reading();	
	}
}
public class BookReadWrite1 {

	public static void main(String[] args) {
		Book1 b1=new Book1();
	
		Thread t1=new Thread();
		

	}

}
