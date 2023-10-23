package in.com.homepractice;


import java.io.FileWriter;

public class WriteTextInFile {

	public static void main(String[] args) {
		try {
	    FileWriter write=new FileWriter("C:\\Users\\ADMIN\\Desktop\\File\\test\\Create.txt");
		write.write("Hello i am writing in file");
		System.out.println("File write completed ");
		
		write.close();
		}catch (Exception e) {
		System.out.println(e.getMessage());
		
		}
		catch(Throwable t){
			System.out.println(t.getMessage());
		}
	 

	}

}
