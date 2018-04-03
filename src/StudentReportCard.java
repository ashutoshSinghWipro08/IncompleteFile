
public class StudentReportCard extends Student{
	
	int total_subjects;
	int points_earned;
	float gpa;
	float  cgpa;
	
	
	StudentReportCard(int studentID,String studentName,String departmentName,int semesterNo,int total_subjects,int points_earned)
	{
		super(studentID,studentName,departmentName,semesterNo);
		this.total_subjects=total_subjects;
		this.points_earned=points_earned;
	}
	
	float gpaCalculater()
	{
		gpa=(total_subjects*points_earned)/7;
		return gpa;
	}
	
	float cgpaCalculater(float gpa)
	{
		cgpa=(gpa)/(semesterNo);
		return cgpa;
	}
	
	void display()
	{ 
		gpaCalculater();
		cgpaCalculater(gpa);
		System.out.println("studentID: "+studentID);
		System.out.println("studentName: "+studentName);
		System.out.println("departmentName: "+departmentName);
		System.out.println("semesterNo: "+semesterNo);
		System.out.println("GPA Computed: "+gpa);
		System.out.println("CGPA Computed: "+cgpa);
		
		
	}


}
