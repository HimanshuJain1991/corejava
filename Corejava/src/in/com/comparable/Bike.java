package in.com.comparable;

public class Bike implements Comparable<Bike> {
  public int bike_number;
  public String bike_name;
  public int bike_gear;
  public Bike(int bike_number,String bike_name,int bike_gear) {
	this.bike_number=bike_number;
	this.bike_name=bike_name;
	this.bike_gear=bike_gear;
}
@Override
public int compareTo(Bike o) {
	// TODO Auto-generated method stub
	return (this.bike_gear) - (o.bike_gear);
}

	
@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return bike_number+" "+bike_name+" "+bike_gear;
	}
}
