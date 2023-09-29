package in.com.Batch;

public class Calculator {

	public static void main(String[] args) {
		double num1=100.05;
		double num2=20.35;
		char operator='+';
		double result;
		switch (operator) {
		case '+':
			result=num1+num2;
			System.out.println("Addition is= "+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("Subtraction is ="+result);
			break;
		case '/':
			result=num1/num2;
			System.out.println("Division is ="+result);
			break;
		case '%':
			result=num1%num2;
			System.out.println("Remainder is= "+result);
			break;
		case'*':
			result=num1*num2;
			System.out.println("Multiply is= "+result);
			break;
		default:
			System.out.println("Wrong Input");
			break;
		}

	}

}
