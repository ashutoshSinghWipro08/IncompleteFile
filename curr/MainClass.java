
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       boolean status;
       
       System.out.println("enter the usd quantity you want to convert");
       
       float usdqty=sc.nextFloat();
       
       System.out.println("enter the destination currency");
       
       String destcurrency=sc.next();
       
       MainClass obj=new  MainClass();
       
       status=obj.validate(usdqty,destcurrency);
       //System.out.println(status);
       
       ConverterClass obj1=new ConverterClass(usdqty,destcurrency);
    	   
    	if(status==true)
    		
    	{
    		obj1.display();
    	}
       
    	else
    	{
    		System.out.println("Unable to convert the given input");
    	}
       
		
	}

	
	boolean validate(float usdQty, String destination){
		
		boolean status;
		
		//float usd=(float)usdQty;
		
		if(usdQty>=0){
			
		  	 status=true;
		}
		
		if(destination.equals("EUR") ||destination.equals("INR")||destination.equals("MYR")
				||destination.equals("SGD")||destination.equals("GBP")||destination.equals("CAD")
				){
			
			status=true;
		}
		
		else
			status=false;
		
		return status;
	}
	
}
