package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

	static	Student data[]= new Student[8];
	static{
				/*for (int i = 0; i < data.length; i++) 	
					data [i]= new Student(); 	
	              */
				//data= new Student[4];
				/*data [0] = new Student("Sekar", new int[]{35,35,35});
				data [1] = new Student(null, new int[]{11,22,33});
				data [2] = null;
				data [3] = new Student("Manoj", null);*/
		data [0] = new Student ("A1", new int [ ] {72, 73, 74});
		data [1] = new Student ("B1", new int [ ] {75, 76, 77});
		data [2] = new Student ("C1", new int[ ] {99, 99, 99});
		data [3] = new Student ("C3", new int[ ] {100, 100, 99});
		data [4] = new Student ("B2", new int[ ] {13, 88, 13});
		data [5] = new Student ("C3", new int[ ] {14, 14, 99});
		data [6] = new Student ("A2", new int[ ] {77, 55, 12});
		data [7] = new Student ("A5", new int[ ] {13, 88, 13});

	}

	public static void main(String args[])
	{
		StudentReport studentReport=new StudentReport();
		String x=null;
		for (int i = 0; i < data.length; i++)
		{
			try
			{
				/*String res=studentReport.validate(data[i]);
				if(res!=null)
				{
					System.out.println("Grade is ::"+res);
				}*/
				x = studentReport.validate (data [i]);
							
			}
			catch (NullNameException e)
			{
				x="NullNameException occurred";	
			} 
			catch (NullMarksArrayException e)
			{
				x="NullMarksArrayException occurred";
			}
			catch (NullStudentException e)
			{ 
				x="NullStudentException occurred "; 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println ("GRADE="+x);
		}
		
		StudentService studentServices=new StudentService();
		int nullMarkCount=studentServices.findNumberOfNullMarks(data);
		int nullNameCount=studentServices.findNumberOfNullNames(data);
		int nullObjectCount=studentServices.findNumberOfNullObjects(data);
		
		System.out.println ("Number of Objects with Marks array as null ="+nullMarkCount);
		System.out.println ("Number of Objects with Name as null="+nullNameCount);	
		System.out.println ("Number of Objects that are entirely null="+nullObjectCount);
		
	}
}
