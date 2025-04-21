package package1;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class firstJDBCprog {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
		System.out.println("connection established successfullyu");
		Statement st =con.createStatement();
		System.out.println("statement object created successfully");
		ResultSet rs=st.executeQuery("select * from students");
		rs.next();
		int roll=rs.getInt(1);
		System.out.println("student id is"+roll);
		String name =rs.getString(2);
		System.out.println("Student name is "+name);
		rs.close();
		st.close();
		con.close();
			}

		}

	


