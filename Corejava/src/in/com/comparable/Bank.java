package in.com.comparable;

public class Bank implements Comparable<Bank> {
   public int bank_id;
   public String bank_name;
   public int bank_number;
   public Bank(int bank_id,String bank_name,int bank_number) {
	this.bank_id=bank_id;
	this.bank_name=bank_name;
	this.bank_number=bank_number;
}
@Override
public int compareTo(Bank o) {
	
	return this.bank_id-o.bank_id;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bank_id+" "+bank_name+" "+bank_number;
	}
   
}
