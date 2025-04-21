package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class addback2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded and registered successfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
		System.out.println("connection established successfully");
		Statement st=con.createStatement();
		PreparedStatement ps = con.prepareStatement("insert into fruits values(?,?)");
	for(int c=0;c<=5;c++)
	{
	System.out.println("enter fruit Price");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("Enter Fruit name");
	Scanner sc1=new Scanner(System.in);
	String b=sc1.nextLine();
	ps.setInt(1, a);
	ps.setString(2,b);
	ps.addBatch();
		}
    	int arr1[]=ps.executeBatch();
		System.out.println("Number of updated querys are "+arr1.length);
		ps.close();
		st.close();
		con.close();
	}

}
