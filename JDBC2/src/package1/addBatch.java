 package package1;
import java.sql.*;
public class addBatch {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded and registered successfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/joins","root","tiwari");
System.out.println("connection established successfully");
Statement st = con.createStatement();
st.addBatch("insert into family values(18,'vishal')");
st.addBatch("insert into family values(19,'vivek')");
st.addBatch("insert into family values(20,'vikas')");
st.addBatch("insert into family values(21,'tiwari')");
st.addBatch("insert into family values(24,'rishi')");
st.addBatch("insert into family values(25,'vaibhav')");
st.addBatch("insert into family values(25,'shraddha')");
st.addBatch("insert into family values(26,'harsha')");
st.addBatch("insert into family values(27,'ashu')");
st.addBatch("insert into family values(28,'laddu')");
st.addBatch("insert into family values(27,'sonam')");
st.addBatch("insert into family values(35,'anitha')");
st.addBatch("insert into family values(36,'vanitha')");
st.addBatch("insert into family values(40,'sujata')");
st.addBatch("insert into family values(45,'alka')");
st.addBatch("insert into family values(43,'shivram')");
st.addBatch("insert into family values(45,'dwaraka')");
st.addBatch("insert into family values(50,'rameshwar')");
st.addBatch("insert into family values(55,'laxman')");
st.addBatch("insert into family values(85,'saraswathi')");
st.addBatch("insert into family values(95,'kishan')");
st.addBatch("insert into family values(16,'tejasvi')");
st.addBatch("insert into family values(18,'shreya')");
st.addBatch("insert into family values(12,'shobith')");
st.addBatch("insert into family values(10,'riyansh')");
st.addBatch("insert into family values(9,'nishanth')");
st.addBatch("insert into family values(8,'akhil')");
st.addBatch("insert into family values(8,'vedansh')");
st.addBatch("insert into family values(10,'arushi')");
st.addBatch("insert into family values(40,'sonu')");
st.addBatch("insert into family values(65,'prema')");
st.addBatch("insert into family values(46,'tuljesh')");
st.addBatch("insert into family values(40,'ram')");
st.addBatch("insert into family values(40,'ashish')");
st.addBatch("insert into family values(22,'vara')");
st.addBatch("insert into family values(22,'abhishek')");
st.addBatch("insert into family values(23,'vikas')");
st.addBatch("insert into family values(4,'krithika')");
st.addBatch("insert into family values(2,'pratha')");
st.addBatch("insert into family values(12,'yatharth')");
st.addBatch("insert into family values(9,'atharv')");
st.addBatch("insert into family values(5,'chinni')");
st.addBatch("insert into family values(30,'rinku')");
st.addBatch("insert into family values(25,'lisa')");
st.addBatch("insert into family values(22,'pranay')");
st.addBatch("insert into family values(25,'swenel')");
st.addBatch("insert into family values(22,'meghanath')");
st.addBatch("insert into family values(22,'joy')");
st.addBatch("insert into family values(24,'prthik')");
st.addBatch("insert into family values(5,'vishika')");

int arr1[]=st.executeBatch();
System.out.println(arr1.length);
st.close();
	}

}
