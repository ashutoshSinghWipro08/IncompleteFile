package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	public String findGrade(Student student)
	{
		String res="";
		for(int i=0;i<student.getMarks().length;i++)
		{
			if(student.getMarks()[i]<35)
				return "F";
		}
		int s=0;
		for(int i=0;i<student.getMarks().length;i++)
		{
			s+=student.getMarks()[i];
		}
		if(s<=150)
			res="D";
		else if(s>150 && s<=200)
			res="C";
		else if(s>200 && s<=250)
			res="B";
		else if(s>250 && s<=300)
			res="A";
		return res;
		
	}
	public String validate(Student student)	throws NullStudentException,NullNameException,NullMarksArrayException
	{
		String res=null;
		
		if(student==null)
			throw new NullStudentException();
		else
		{
			if(student.getName()==null || student.getName().length()==0)
				throw new NullNameException();
			if(student.getMarks()==null)
				throw new NullMarksArrayException();
			res=findGrade(student);
			
		}
		return res;
	}
}
