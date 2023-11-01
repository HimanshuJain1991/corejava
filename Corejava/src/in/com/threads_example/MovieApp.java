package in.com.threads_example;

public class MovieApp  extends Thread{
   static BookMovieSeat bms;
   int seats;
    @Override
    public void run() {
    	bms.bookSeat(seats);
    }
	public static void main(String[] args) {
		bms=new BookMovieSeat();
		MovieApp ma=new MovieApp();
		ma.seats=7;
		ma.start();
//		try {
//			ma.sleep(5000);
//		} catch (Exception e) {
//			// TODO: handle exception
		
		MovieApp ma1=new MovieApp();
		ma1.seats=9;
		ma1.start();
		

	}

}
