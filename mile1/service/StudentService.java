package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	public int findNumberOfNullMarks(Student data[])
	{
			int c=0;
	        try
	        {
	        	  
	        	for(int i=0;i<data.length;i++)
		        {
	        		if(data[i]!=null)
		        	{
	        			if(data[i].getMarks()==null)
	        				c++;
		        	}
		        }
	        }catch(Exception e)
	        {
	        	System.out.println(e);
	        }
			  
	        return c;
	}
	public int findNumberOfNullNames(Student data [])
	{
		int c=0;
        try
        {
        	  
        	for(int i=0;i<data.length;i++)
	        {
        		if(data[i]!=null)
	        	{
        			if(data[i].getName()==null)
        				c++;
	        	}
	        }
        }catch(Exception e)
        {
        	System.out.println(e);
        }
		  
        return c;
	}
	public int findNumberOfNullObjects(Student data [])
	{
		int c=0;
        try
        {
        	  
        	for(int i=0;i<data.length;i++)
	        {
        		if(data[i]==null)
	        	{
        			c++;
	        	}
	        }
        }catch(Exception e)
        {
        	System.out.println(e);
        }
		  
        return c;
	}


}
