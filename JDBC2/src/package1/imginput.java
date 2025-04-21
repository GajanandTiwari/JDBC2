package package1;
import java.sql.*;
import java.io.*;
public class imginput {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded and registered successfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
System.out.println("connection established successfully");
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");
ps.setInt(1,9);
FileInputStream fin=new FileInputStream("./butterfly.jpg");
ps.setBinaryStream(2,fin,fin.available());
int i=ps.executeUpdate();
System.out.println(i+" number of records are affected");
con.close();
ps.close();
	}

}
