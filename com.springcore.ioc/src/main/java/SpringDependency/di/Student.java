package SpringDependency.di;

public class Student {

	
	private String studentName;
	private int id;
	

	
	public Student(String studentName, int id) {
		this.studentName = studentName;
		this.id = id;
	}



	public void displayInfo()
	{
		System.out.println("Sutdnet Name : "+ studentName + " Student ID : "+id);
	}
	
}
