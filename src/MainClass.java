import java.util.*;
public class MainClass {
	
	boolean validateInputs(int studentID,int semesterNo,int total_subjects,int points_earned)
	{
		
		if(studentID>=1000 && studentID<=9999 && semesterNo>=1 && semesterNo<=7 && total_subjects>=1 && total_subjects<=7 && points_earned>=1 && points_earned<=20)
			return true;	
		/*if(semesterNo>=1 && semesterNo<=7)
			return true;
		if(total_subjects>=1 && total_subjects<=7)
			return true;
		if(points_earned>=1 && points_earned<=20)
			return true;*/
		else
			return false;
	

	}

	
	public static void main(String args[])
	{
		System.out.println("Enter StudentID,studentName,departmentName,semesterNo,total_subjects,points_earned");

		Scanner sc=new Scanner(System.in);
		int studentID=sc.nextInt();
        String studentName=sc.next();
        String departmentName=sc.next();
        int semesterNo=sc.nextInt();
        int total_subjects=sc.nextInt();
        int points_earned=sc.nextInt();
       
        MainClass m=new MainClass();
       boolean b= m.validateInputs(studentID,semesterNo,total_subjects,points_earned);
		if(b==true)
		{
			StudentReportCard reportObject= new StudentReportCard(studentID,studentName,departmentName,semesterNo,total_subjects,points_earned);
			reportObject.display();
		}
		else
			System.out.println("Invalid data");
	}
}
