package in.com.rays.marksheet;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class MarksheetModel {
	public static void insertData( MarksheetBean bean1) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java06", "root", "root");
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, bean1.getId());ps.setString(2, bean1.getName());ps.setInt(3,bean1.getRoll_no() );
		ps.setInt(4, bean1.getPhyscis());ps.setInt(5, bean1.getChemistry());ps.setInt(6, bean1.getMaths());
		int i=ps.executeUpdate();
	    System.out.println("Data Inserted ="+ i);
	}
	public static void deleteData(MarksheetBean bean3)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java06", "root", "root");
		PreparedStatement ps=conn.prepareStatement("delete from marksheet where id=?");	
	    ps.setInt(1, bean3.getId());
	   int i= ps.executeUpdate();
	   System.out.println("Record Deleted "+i);
	}
	
	public static void getData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java06", "root", "root");
		PreparedStatement ps=conn.prepareStatement("select * from marksheet ");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getInt(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getInt(5));
			System.out.println("\t"+rs.getInt(6));
		}
		
	}
	public static void alter(MarksheetBean bean6) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java06", "root", "root");
		PreparedStatement ps=conn.prepareStatement("alter table marksheet add =? varchar(50) ");
		ps.setString(1,bean6.getTotal() );
		int i=ps.executeUpdate();
		System.out.println("table alter table "+i);
	}

}
