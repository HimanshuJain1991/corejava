package in.com.encapsulation;


 class Shape_Data {
	private String color=null;
	private int borderWidth=0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	

}
 public class Shape{
	 public static void main(String[] args) {
		 System.out.println("Encapsulation Example");
		Shape_Data sh=new Shape_Data();
		sh.setColor("yellow");sh.setBorderWidth(15);
		System.out.println(sh.getColor());
		System.out.println(sh.getBorderWidth());
	}
 }
