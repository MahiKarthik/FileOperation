package orf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sql {
public static void main(String[] arg) throws ClassNotFoundException, SQLException {
		
		//1.Load the Driver
	 Class.forName("oracle.jdbc.driver.OracleDriver");		
	     // connect to DataBase
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","maheswari"); 
	
	      //3.write SQl qurey
	String s="select * from course";
	//4 prepare the statement
	
	PreparedStatement  prepareStatement=c.prepareStatement(s);
	//5.Exeute Qurey
	ResultSet rs=prepareStatement.executeQuery();
	//6.Iterate the result
	while(rs.next()) {
		
		String result=rs.getString("CNAME");
		System.out.println(result);
	}
	//7.close the db connection
	c.close();
	
	
	}

	}

