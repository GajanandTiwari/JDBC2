package package1;
import java.sql.*;    

public class resultSET {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
//allows the java to access database
System.out.println("Driver loaded and registered");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
//to get connection with database (SQL)
System.out.println("Connection is established");
Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//to execute SQL statements(to receive data from SQL)
System.out.println("Statement created successfully");
ResultSet rs = st.executeQuery("select * from students");
//to access the result of SQL query
System.out.println(" ");

System.out.println("outputs of first row are as below:");
rs.first();
int i=rs.getInt(1);
String ss=rs.getString(2);
System.out.println("roll no is "+i);
System.out.println("name is "+ss);
System.out.println(" ");
System.out.println("outputs of absolute 3rd row are :");
rs.absolute(3);
int ii=rs.getInt(1);
String s=rs.getString(2);
System.out.println("roll is "+ii);
System.out.println("name is "+s);
System.out.println(" ");
System.out.println("outputs of the previous row are:");
rs.previous(); 
int n=rs.getInt(1);
String na=rs.getString(2);
System.out.println("roll no is "+n);
System.out.println("name is "+na);
System.out.println(" ");
System.out.println("outputs of the next row are:");
rs.next();
int m=rs.getInt(1);
String sr=rs.getString(2);
System.out.println("Roll non is "+m);
System.out.println("nae is "+sr);
System.out.println(" ");
System.out.println("outputs of the last row are:");
rs.last();
int la=rs.getInt(1);
String as=rs.getString(2);
System.out.println("the roll number is "+la);
System.out.println("the name is "+as);
rs.close();
st.close();
con.close();
	}

}
