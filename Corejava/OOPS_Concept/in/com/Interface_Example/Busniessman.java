package in.com.Interface_Example;

public class Busniessman  implements Richman,SocialWorker{

	@Override
	public void helpToOthers() {
		System.out.println("SocialWorker interface method");
		
	}

	@Override
	public void earnMoney(int a,int b) {
		int c, d;
		c=a;
		d=b;
		int add=c+d;
		
		System.out.println("Richman interface Method"+add);
		
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	Richman r= new Busniessman();
	r.earnMoney(100,200);
	
	SocialWorker sw=new Busniessman();
	sw.helpToOthers();
	
	
//	Busniessman b=new Busniessman();
//	b.earnMoney();
}

	

}
