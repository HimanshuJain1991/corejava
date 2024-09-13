package co.rays.lamdaexpression;

public class Employee_Functional_Test {

	public static void main(String[] args) {
		Employee_Functonal_Iterface e1=(a,b)->"Employee Functional Interface"+a+" "+b;
System.out.println(e1.getName1(10, 20));
	}

}
