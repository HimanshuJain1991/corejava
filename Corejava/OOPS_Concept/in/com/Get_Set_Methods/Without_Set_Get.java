package in.com.get_set_methods;


class Pen{
	String color;
	String type;
	int price;
	public void printColor() {
		System.out.println(color);
	}
	public void printType() {
		System.out.println(type);
	}
	public void printPrice() {
		System.out.println(price);
	}
}
public class Without_Set_Get {

	public static void main(String[] args) {
		
Pen p=new Pen();
p.color="Red";
p.type="Flair Company";
p.price=100;
p.printColor();p.printPrice();p.printType();
Pen p1=new Pen();

p1.color="Black";
p1.type="Rendolds";
p1.price=98;
p1.printColor();p1.printPrice();p1.printType();
	}

}
