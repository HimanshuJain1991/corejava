package in.com.threads_example;



class MyThread5 extends Thread{
	PrintTable p;
	public MyThread5(PrintTable p) {
		this.p=p;
	}
	@Override
	public void run() {
		p.printTable(2);
		
	}
	
}
class MyThread7 extends Thread{
	PrintTable pt;
	public MyThread7(PrintTable pt) {
		this.pt=pt;
	}
	@Override
	public void run() {
		pt.printTable(5);
	}
}
 class PrintTable {
	public synchronized void printTable(int n) {
		System.out.println("Table of:"+n);
		for(int i=0;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
 

public class Syncronized_Example {

	public static void main(String[] args) {
		PrintTable obj=new PrintTable();
		MyThread5 m5=new MyThread5(obj);
		MyThread7 m7=new MyThread7(obj);
		m5.start();
		
		m7.start();

	}

}
