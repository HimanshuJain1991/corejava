
public class LocalVariable {
 private int id=0;//instance variable we need to create constructor
  static final  double PI=3.14;
    public LocalVariable(int id1) {
		id=id1;
		 System.out.println("instance variable="+id);
	}
 
	public static void main(String[] args) {
		final int a=10;//local variable
		System.out.println("local variable="+a);
		LocalVariable l=new LocalVariable(1);
		//System.out.println(PI);
		System.out.println(LocalVariable.PI);
	
	
      
	}

}
