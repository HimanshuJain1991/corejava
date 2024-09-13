package in.com.functionalinterface;

//es package mai kese se link nahi hai ye means kise bhi class se
interface Delhi {
	public String add(int a, int b);
}

public class PracticeFunctionInterface {

	public static void main(String[] args) {
		Delhi d = (a, b) -> "Hello Delhi answer is=" + (a + b);
		System.out.println(d.add(10, 20));
		// Delhi d=(a,b)->System.out.println(""+d.add(10, 20));
	}

}
