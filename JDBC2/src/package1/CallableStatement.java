package package1;
import java.sql.*;
public class CallableStatement {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");//allows the access to database 
System.out.println("Driver loaded successfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
System.out.println("connection established successfully");
java.sql.CallableStatement cs=con.prepareCall("{call fruitsss(?,?)}");//calling the procedure
cs.setInt(1,100);
cs.registerOutParameter(2,Types.VARCHAR);
cs.execute();
String FN=cs.getString(2);
System.out.println("Fruit name is "+FN);
cs.close();
con.close();
	}
}
