package in.com.threads_example;

public class Amount extends Thread {
	 public static int amount = 0;

	  public static void main(String[] args) throws InterruptedException {
	    Amount thread = new Amount();
	    thread.start();
	    // Wait for the thread to finish
	    while(thread.isAlive()) {
	    System.out.println("Waiting...");
	  }
	    for(int i=0;i<5;i++) {
	    	Thread.sleep(3000);
	  // Update amount and print its value
	  System.out.println("Main: " + amount);
	  amount++;
	  
	  System.out.println("Main: " + amount);
	  }
	  }
	  public void run() {
	    amount++;
	  }

}
