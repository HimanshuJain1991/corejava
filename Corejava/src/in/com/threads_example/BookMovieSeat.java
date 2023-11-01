package in.com.threads_example;

public class BookMovieSeat {//use Synchnized keywords
 int total_seats=10;
 void  bookSeat(int seats) {
	 if(total_seats>=seats) {
		 System.out.println("Seats Booked Successfully....");
		 total_seats=total_seats-seats;
		 System.out.println(" Seats left"+total_seats);
	 }
	 else {
		 System.out.println("Seats cannot be booked");
		// System.out.println("Seats left"+total_seats);
	 }
 }
 
 
}
