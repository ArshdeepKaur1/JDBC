package Student.dao;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Student.main.Student;
import com.mysql.jdbc.Driver;
public class DBHelper {
	
	Connection con;
	
	public DBHelper() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
	}catch (Exception e) {
	System.out.println("Some exception: "+e);
	
	}
	}


public void createConnection() {
try {
	String url = "jdbc:mysql://localhost/student";
	String username = "root";
	String password = "";
	
	con = DriverManager.getConnection(url,username,password);
	System.out.println(">>Connection Created");
		
	}catch (Exception e) {
	System.out.println("Some exception: "+e);
	
	}
	
}

public void insertStudent(Student Student) {
try {
	String sql = "insert into student values(null,'"+Student.Name+"', '"+Student.Class+"','"+Student.Marks+"')";
	Statement stmt = con.createStatement();
	int i = stmt.executeUpdate(sql);
	
	if(i>0) {
		System.out.println(">>Student"+Student.Name+"inserted");
	}
		 
	}catch (Exception e) {
	System.out.println("Some exception: "+e);
	
	}
	

}

public void closeConnection() {

	try {
		con.close();
		System.out.println("Connection closed");
}catch (Exception e) {
System.out.println("Some exception: "+e);

}

	
	
	
}




}