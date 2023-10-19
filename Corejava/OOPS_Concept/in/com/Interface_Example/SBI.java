package in.com.interface_example;

public class SBI implements Bank {
double saving_intrest,Fd_intrest;
	@Override
	public void savingIntrestRate() {
		double principle=50000,time=6,rate=3.5;
		saving_intrest=(principle *rate *time)/100;
		System.out.println("Saving Intrest is:"+saving_intrest);
		
	}

	@Override
	public void FdIntrestRate() {
		//i=300;
		double principle=50000,time=6,rate=7.5;
		Fd_intrest=(principle *rate *time)/100;
		System.out.println("FD intrest is:"+Fd_intrest);
    
		
	}

	@Override
	public void diffRate() {
	  
		double diff=Fd_intrest-saving_intrest;
		System.out.println("difference rate is: "+diff);
	}
	public static void main(String[] args) {
		SBI sbi= new SBI();
		sbi.FdIntrestRate();
		sbi.savingIntrestRate();
		sbi.diffRate();
		
		Bank b=new SBI(); 
		b.FdIntrestRate();
		b.savingIntrestRate();
		b.diffRate();
	}
 
}
