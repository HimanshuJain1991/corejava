package in.com.abstract_class_example;

public class Student_Marks_Test {

	public static void main(String[] args) {
		Student_Marks sm=new Student_Marks() {
			
			@Override
			public void calculate(int a, int b) {
				int c=a+b;
				System.out.println("calculated method is call: "+c);
				
			}
		};
		sm.calculate(10, 20);
		
		

	}

}
