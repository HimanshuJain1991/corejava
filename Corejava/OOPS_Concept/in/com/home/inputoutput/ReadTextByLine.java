package in.com.home.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextByLine {

	public static void main(String[] args) {
		try {
			FileReader reader =new FileReader("C:\\Users\\ADMIN\\Desktop\\File\\test\\Data.txt");
			BufferedReader br=new BufferedReader(reader);
			String s=br.readLine();
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
			reader.close();br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
