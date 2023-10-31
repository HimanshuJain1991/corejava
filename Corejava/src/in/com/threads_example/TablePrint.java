package in.com.threads_example;


class Print{
	 public void table(int n) {
		 System.out.println("Table of: "+n);
		 for(int i=0;i<=10;i++) {
			 System.out.println(n*i);
			 try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.getMessage();
			}
		 }
	 }
 }

 class YouThread1 extends Thread{
	 Print tp;
	 public YouThread1(Print tp){
		this.tp=tp;
	}
	 @Override
	public void run() {
        tp.table(5);
	}
 }
 class YouThread2 extends Thread{
	 Print tp;
	 public YouThread2(Print tp) {
		this.tp=tp;
		
	}
	 @Override
	public void run() {
	  tp.table(4);
	}
	
 }
public class TablePrint {

	public static void main(String[] args) {
		Print p=new Print();
		YouThread1 y1=new YouThread1(p);
		YouThread2 y2=new YouThread2(p);
		y1.start();
		try {
			y1.join();
	 	} catch (Exception e) {
			// TODO: handle exception
		}
		y2.start();
		
		
	   

	}

}
