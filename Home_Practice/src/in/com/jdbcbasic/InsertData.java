package in.com.jdbcbasic;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class c=Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/himanshu?autoReconnect=true&useSSL=false","root","root");
       Statement st=con.createStatement();
       int i=st.executeUpdate("insert into Employee(e_id,e_name,e_age)values(23,'ram',34)");
       System.out.println(i);
       System.out.println("done");
	}

}
