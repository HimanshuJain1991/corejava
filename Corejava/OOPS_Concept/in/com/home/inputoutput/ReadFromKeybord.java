package in.com.home.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeybord {

	public static void main(String[] args) {
		try {
			PrintWriter pw=new PrintWriter("C:\\Users\\ADMIN\\Desktop\\File\\test\\Demo.txt");
			System.out.println("Type Here");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String data=br.readLine();
			while(!data.equals("End")) {
				pw.println(data);
				data=br.readLine();
			}
			System.out.println("stop");
			pw.close();isr.close();
		
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	   

	}

}
