package in.com.set_interface_practice;

import java.util.EnumSet;

public class Enum_Set_Example {

	public static void main(String[] args) {
	EnumSet<Size> eset=EnumSet.allOf(Size.class); //inilization hai ye
	//public construcor nahi hota hai es class ka.
	System.out.println(eset);
	
	EnumSet<Size>eset1=EnumSet.range(Size.SMALL, Size.EXTRALARGE);
	System.out.println(eset1);
	EnumSet<Size>eset2=EnumSet.of(Size.LARGE, Size.MEDIUM);
	System.out.println(eset2);

	}

}
enum Size{
	SMALL,LARGE,EXTRALARGE,MEDIUM;
	
	
}
