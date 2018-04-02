import java.util.*;
import java.math.*;
import java.security.*;
import java.text.*;

class Finalv2
{
	
	public static void main(String args[])
	{
		Finalv2 obj=new Finalv2();
		obj.generateKey();
		while(true)
		{
			obj.generateSignature("hello world");
			//0<r<q or 0<s<q
			if(obj.r.compareTo(obj.q)<0 && obj.s.compareTo(obj.q)<0)
				break;
		}
		
		System.out.println("r = "+obj.r);
  		System.out.println("s = "+obj.s);	
		obj.verifySignature("hello world");
	
	}
	public void verifySignature(String message)
	{	
		BigInteger tw=new BigInteger("1");
		System.out.println(" s = "+s);
		
		BigDecimal ttw=new BigDecimal(tw.divide(s));
		//tw=s.pow(-1);
		System.out.println(" tw = "+ttw);
		BigDecimal w=tw.mod(new BigDecimal(q));
		System.out.println("W = "+w);
		BigInteger sh=null;
		
		/*try
		{
			//MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			//crypt.reset();
			//crypt.update(message.getBytes("UTF-8"));
			//sha1 = byteToHex(crypt.digest());
			MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			crypt.reset();
			crypt.update(message.getBytes("UTF-8"));

			sh=new BigInteger(1,crypt.digest());		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//u 1 = H ( m ) ⋅ w mod q
		BigInteger tu1=sh.multiply(w);
		BigInteger u1=tu1.mod(q); 
		
		System.out.println(" u1 = "+u1);
		// u 2 = r ⋅ w mod q		
		BigInteger u2=r.multiply(w);
		u2=u2.mod(q);	
		System.out.println(" u2 = "+u2);
		
		// v = ( g u 1 y u 2 mod p ) mod q
		/*BigInteger prd=g.pow(u1);
		prd=prd.multiply(y.pow(u2));
		prd=prd.mod(u2);
		BigInteger v=prd.mod(q);
		System.out.println(" v = "+v);
		if(v.compareTo(r)==0)
			System.out.println("correct signture  ");
		else
			System.out.println(" incorrect signature ");
		*/

	}
	BigInteger r=null,s=null;
	public void generateSignature(String message)
	{	
		BigInteger k=null;
		
		while(true)
		{
			k=new BigInteger(q.bitLength(),new Random());
			BigInteger rt=(g).modPow(k,p);
			r=(rt).mod(q);	
			if(r.compareTo(new BigInteger("0"))>0)
				break;		
		}
		//System.out.println("r = "+r);


		String sha1 = "";
		//String message="hello world";
		
		BigInteger sh=null;		
		try
		{
			//MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			//crypt.reset();
			//crypt.update(message.getBytes("UTF-8"));
			//sha1 = byteToHex(crypt.digest());
			MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			crypt.reset();
			crypt.update(message.getBytes("UTF-8"));

			sh=new BigInteger(1,crypt.digest());		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println("sha1 = "+sha1);

		//s = k − 1 ( H ( m ) + x r ) mod q
		//sh=new BigInteger(sha1);		
		//System.out.println("sh = "+sh);
		BigInteger prd=null;
		while(true)
		{
			prd=x.multiply(r);
			prd=prd.add(sh);		
			prd=prd.divide(k);
			prd=prd.mod(q);
			if(prd.compareTo(new BigInteger("0"))>0)
				break;		
		}
		s=prd;
		//System.out.println("s = "+s);
	}
	BigInteger q=null,p=null,g=null,y=null,x=null; 
	public void generateKey()
	{		
		for(int i=512;i<=1024;i++)
		{
			if(i%64==0)
			{
				q=BigInteger.probablePrime(160,new Random());
				p=BigInteger.probablePrime(i,new Random());
				if(p.mod(q).compareTo(new BigInteger("1"))==0)
				{
					System.out.println("in if block");
					break;
				}			
			}
		}
		//System.out.println(q);
		//System.out.println(p);	
		BigInteger z=(p.subtract(new BigInteger("1"))).divide(q);
		//System.out.println(z);
		BigInteger fh=null;	
		BigInteger c=new BigInteger("1");;		
		BigInteger sub=p.subtract(new BigInteger("1")).divide(new BigInteger("100"));		
		for(BigInteger h=new BigInteger("2");h.compareTo(p.subtract(new BigInteger("1")))<0;h=h.add(new BigInteger("1")))
		{
			BigInteger temp=(h).modPow(z,p);
			if(temp.compareTo(new BigInteger("1"))>0)
			{
				g=temp;
				fh=h;	
				break;
			}
		}
		x=null;
		while(true)
		{
			x=new BigInteger(q.bitLength(),new Random());			
			if(x.compareTo(new BigInteger("0"))>0 && x.compareTo(q)<0)
				break;		
		}		
		
		//System.out.println(" g ="+g);
		//System.out.println(" h ="+fh);
		
		y=g.modPow(x,p);
		//System.out.println(y);

	}
	
}

