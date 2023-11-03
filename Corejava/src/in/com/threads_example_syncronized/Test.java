package in.com.threads_example_syncronized;

public class Test {

	public static void main(String[] args) {
	 Racing r1=new Racing("Himanshu Jain");
	 Racing r2=new Racing("Ram Sharma");
	 r1.start();r2.start();

	}

}
