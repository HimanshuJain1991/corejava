package in.com.Batch;

public class Switch_New_Example {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int result;
		char [] operator={'+','*','-'};
		for(int i=0;i<operator.length;i++) {
		switch (operator[i]) {
		case '+':
			 result=num1+num2;
			System.out.println("Addition is "+result);
			break;
		case '-':
			 result=num1-num2;
			 System.out.println("subtraction"+result);
			
			break;
		case '*':
			result=num1*num2;
			System.out.println("Multiply "+result);
			break;
		default:
			System.out.println("default");
			break;
		}
		}
	}

}
