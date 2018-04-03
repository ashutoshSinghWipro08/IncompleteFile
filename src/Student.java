
public class Student {
	int studentID;
	String studentName;
	String departmentName;
	int semesterNo;
	
	
	Student(int studentID,String studentName,String departmentName,int semesterNo)
	{
		this.studentID=studentID;
		this.studentName=studentName;
		this.departmentName=departmentName;
		this.semesterNo=semesterNo;
	}
	
	void display()
	{
		System.out.println("studentID: "+studentID);
		System.out.println("studentName: "+studentName);
		System.out.println("departmentName: "+departmentName);
		System.out.println("semesterNo: "+semesterNo);
	}
	
	

}
