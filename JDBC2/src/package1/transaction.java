package package1;
import java.sql.*;
public class transaction {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
//allows the java to access database
System.out.println("Driver loaded successfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
//to get connection with database (SQL)
System.out.println("connection established successfully");
con.setAutoCommit(false);//in order to set the autocommit to false
Statement st=con.createStatement();
//to execute SQL statements(to receive data from SQL) 
System.out.println("statement created successfuly");
System.out.println("");
System.out.println("");

try {
	st.executeUpdate("update unionbank set balance =0 where acno=961");
	st.executeUpdate("update kotakbank set balance =90000 where acno=799");
	System.out.println("transaction completed successfully");
}

catch(Exception ee)
{
con.rollback();
System.out.println("Transaction is failed ");
System.out.println("Your money will be debited back shortly");
}

con.setAutoCommit(true);

con.close();
	}}
