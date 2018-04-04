

public class ConverterClass extends USDClass{

	String destCurrency;
	
	ConverterClass( float usdQty,String destCurrency){
		
		 super(usdQty);
		 this.destCurrency=destCurrency;
	}
	
	public float convertCurrency(){
		
		float destvalue=0f;
		
		switch(destCurrency){
		
		case "EUR":
			
			destvalue=usdQty*0.81f;
			break;
		
		case "INR":
			
			destvalue=usdQty*64.31f;
			break;
			
		case "MYR":
			
			destvalue=usdQty*3.95f;
			break;
			
		case "SGD":
			
			destvalue=usdQty*1.32f;
			break;
			
		case "GBP":
			
			destvalue=usdQty*0.72f;
			break;
			
		case "CAD":
			
			destvalue=usdQty*1.26f;
			break;
			
			default:
				//System.out.println("invalid input");
				break;
		}
		return destvalue;
		
	}
	
	public void display(){
		
		System.out.println("The"+" "+destCurrency+" "+"amount equivalent to"+" "+usdQty+" "+"USD is :"+" "+convertCurrency());
	}
	
}
