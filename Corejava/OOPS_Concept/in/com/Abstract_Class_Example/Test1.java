package in.com.abstract_class_example;

public class Test1 {

	public static void main(String[] args) {
		Rectangel_New re=new Rectangel_New() {
               
			@Override
			public void total() {
				// TODO Auto-generated method stub
			
				System.out.println("total is calling");
				
			}
			
		};
		re.area(); 
		re.total();
		
		Shape1 s=new Shape1() {
         int i;
         String s;
			@Override
			public void area1( int i,String  s) {
				this.i=i;
				this.s=s; 
			System.out.println("Main class area method  "+i+"  "+ s);
				
			}

	};
	s.area1(105,"Himanshu");
	
	}}
