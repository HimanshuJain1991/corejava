package in.com.threads_example;

class Book{
	 synchronized void writing() {
		 String s=Thread.currentThread().getName();
	
		 System.out.println(s+"Authore writing book");
		 try {
			Thread.sleep(2000);
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		 System.out.println("Book is avilable");
	 }
	 synchronized void reading() {
		 String s1=Thread.currentThread().getName();
		 System.out.println(s1+"  :reading book!!");
		 try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	 }
	
}
class Author implements Runnable{
	Thread t;
	Book b;
	public Author(Book b) {
		this.b=b;
		t=new Thread(this,"Authore name");
	}
	@Override
	public void run() {
		
		b.writing();
	}
}
class Student implements Runnable{
	Thread t;
	Book b2;
	public Student(Book b2) {
		this.b2=b2;
		t=new Thread(this,"Student");
	}
	@Override
	public void run() {
		b2.reading();
		
	}
}
public class BookReadWrite {

	public static void main(String[] args) {
	  Book b=new Book();
	  //Student s=new Student(b);
	  Thread t=new Thread(new Student(b));
	  t.start();
//	  Student s1=new Student(b);
//	  Thread t1=new Thread(s,"Ram");
//	  t1.start();
//	  Student s2=new Student(b);
//	  Thread t2=new Thread(s,"Rahul");
//	   Author a=new Author(b);
//	   Thread t4=new Thread(a,"Sahu Sir");
//	   t4.start();
//
	}

}
