package in.com.get_set_methods;

public class Car_Call {

	public static void main(String[] args) {
		Car_Details cd=new Car_Details();
		cd.setCar_Name("Hyundai ");
		cd.setCar_Model("Elite i20");
		cd.setCar_Price(255555);
		System.out.println(cd.getCar_Name());
		System.out.println(cd.getCar_Model());
		System.out.println(cd.getCar_Price());

	}

}
