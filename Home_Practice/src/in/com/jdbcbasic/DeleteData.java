package in.com.jdbcbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {
		try {
			Class c=Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/himanshu?autoReconnect=true&useSSL=false","root","root");
		  Statement st= con.createStatement();
		  int i=st.executeUpdate("delete from employee where e_id=13 ");
		  if(i==1) {
		  System.out.println("already deleted record");
		  }
		  else {
			  System.out.println("record already deleted");
			  System.out.println("done");
		  }
		 
		  
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
