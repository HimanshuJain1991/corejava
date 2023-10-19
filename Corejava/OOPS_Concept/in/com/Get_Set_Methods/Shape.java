package in.com.get_set_methods;

public class Shape {
	private int border_Widht=0;
	private String color=null;
public void setBorder_Widht(int border_Widht) {
	this.border_Widht = border_Widht;
}
public int getBorder_Widht() {
	return border_Widht;
}
public void setColor(String color) {
	this.color = color;
} 
public String getColor() {
	return color;
	
}
public void area() {
	System.out.println("Shape class Area Call");
}


}
