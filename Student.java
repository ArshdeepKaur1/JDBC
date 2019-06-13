package Student.main;

public class Student {
	
	/* SQL Command to create a table:
	 create table Student(
	 StudentID int primary key auto_increment,
	 Name varchar(256),
	 Class int,
	 Marks int
	 )
	 insert into Student values(null, 'Arshdeep', 10,95)
	 update Student set Name = 'Anmol Singh' where StudentID = 2
	
	select * from Student 
	 */
	
	public Student(int studentID, String name, int class1, int marks) {
		super();
		StudentID = studentID;
		Name = name;
		Class = class1;
		Marks = marks;
	}
	public int StudentID;
	public String Name;
	public int Class;
	public int Marks;
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", Name=" + Name + ", Class=" + Class + ", Marks=" + Marks + "]";
	}
	
	
	

}
