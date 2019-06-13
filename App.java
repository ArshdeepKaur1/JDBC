package Student.main;
import 	Student.dao.DBHelper;
import Student.main.Student;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student (0,"Arshdeep",10,95);
	
System.out.println(s1);

DBHelper db = new DBHelper();
db.createConnection();
db.insertStudent(s1);
db.closeConnection();
	}

}
