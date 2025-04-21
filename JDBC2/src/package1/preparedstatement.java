package package1;
import java.sql.*;
public class preparedstatement {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver"); //to access database
System.out.println("Driver loaded successfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");//to connect with database(sql)
System.out.println("Connection is established");
PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?,?)");//numbr of columns are denoted as ??
System.out.println("Prepared statement object created successfully");
ps.setInt(1,6); //inserting roll  
ps.setString(2,"vishal"); //inserting name       //inserted 4 columns
ps.setInt(3,7);//inserting rank 
ps.setString(4,"football");//inserting sports
int num =ps.executeUpdate();
System.out.println("Row inserted successfully "+num);
ps.close();
con.close();

	}

}
