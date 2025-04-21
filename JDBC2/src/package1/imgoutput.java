package package1;
import java.io.FileOutputStream;
import java.sql.*;
public class imgoutput {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded and registered successfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
System.out.println("connection established successfully");
PreparedStatement ps=con.prepareStatement("select * from imgOtable");
ResultSet rs=ps.executeQuery();
if(rs.next())
{
Blob b=rs.getBlob(2);
byte barr[]=b.getBytes(1,(int)b.length());
FileOutputStream fout=new FileOutputStream("./butterfly.jpg");
fout.write(barr);
fout.close();
}
System.out.println("file written");
con.close();
rs.close();
	}

}
