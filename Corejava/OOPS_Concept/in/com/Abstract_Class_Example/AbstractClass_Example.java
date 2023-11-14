package in.com.abstract_class_example;

abstract class  Diamond{
	public abstract void diamond_details();
	
}

public class AbstractClass_Example  {
	public static void main(String[] args) {
		Diamond d=new Diamond() {
			
			@Override
			public void diamond_details() {
			System.out.println("diamond purity check here");
				
			}
		};
		d.diamond_details();
		
	}

	

	

}
