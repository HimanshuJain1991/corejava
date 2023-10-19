package in.com.comparator;

public class Bank {
	int b_id;
	String b_name; 
public Bank(int b_id,String b_name) {
	this.b_id=b_id;
	this.b_name=b_name;
	
} public void setB_id(int b_id) {
	this.b_id = b_id;
}
public int getB_id() {
	return b_id;
}
public void setB_name(String b_name) {
	this.b_name = b_name;
}
public String getB_name() {
	return b_name;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return b_id+" "+b_name;
}

}
