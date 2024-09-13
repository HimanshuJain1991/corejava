package co.rays.systemclass;

import java.io.IOException;

public class SystemClassExample {

	public static void main(String[] args) throws IOException {
		System.out.print("enter the char ");
		int ch=System.in.read();
		char chr=(char)ch;
		System.out.println("you have entered"+chr);
		
		String path=System.getenv("PATH");
		System.out.println(path);

	}

}
