package in.com.class_test_practice;

public class Bank {
	public int bank_id;
	public String bank_name;
	public String bank_area;
    public Bank(int bank_id,String bank_name,String bank_area) {
		this.bank_id=bank_id;
		this.bank_name=bank_name;
		this.bank_area=bank_area;
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return bank_id+" "+bank_name+" "+bank_area;
    }
}
