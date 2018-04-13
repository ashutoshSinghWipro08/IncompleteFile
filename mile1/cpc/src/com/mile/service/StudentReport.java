package com.mile.service;

import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

import col.mine1.bean.Student;

public class StudentReport {
	int sum=0;
	
	public String findGread(Student studentObject)
	{
		int arr[]=studentObject.getMarks();
		if(arr[0]<35)
		{
			return "F grade";
		}
		
		else if(arr[1]<35)
		{
			return "F grade";
		}
		else if(arr[2]<35)
		{
			return "F grade";
	
		}
		else
		{
			sum=arr[0]+arr[1]+arr[2];
			
			if(sum<=150)
				return "D grade";
			else if(sum>150 && sum<=200)
				return "C grade";
			else if(sum>200 && sum<=250)
				return "B grade";
			else if(sum>250 && sum<=300)
				return "A grade";
			return "";
		}
	}
	
	public String validate(Student studentObject) throws NullStudentException,NullNameException,NullMarksArrayException
	{
		if(studentObject==null)
			throw new NullStudentException();
		
		else if(studentObject.getName()==null || studentObject.getName().equals(""))
			throw new NullNameException();
		
		else if(studentObject.getMarks()==null)
			throw new NullMarksArrayException();
		else
		{
			String grade=findGread(studentObject);
			return grade;
		}
		 
	}
}
