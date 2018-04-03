package com.mile1.bean;

public class Student {

	String name;
	int marks[];
	public Student()
	{
		name=null;
		marks=null;
	}
	public Student(String name,int marks[])
	{
		try
		{
			this.name=name;
			
			if(marks!=null)
			{	this.marks=new int[3];
				for(int i=0;i<marks.length;i++)
				{
					this.marks[i]=marks[i];
				}
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
}
