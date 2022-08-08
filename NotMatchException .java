import java.util.*;
class NotMatchException extends Exception
{
    void varify(String p)
    {
       if(p.equals("India"))
       {
	  System.out.println("string matched successfuly!!!!!!!!!!!!");
       }
       else
       {
         try
         {
		throw new NotMatchException("String not matched");

	}catch( NotMatchException e) 
	 {
	        System.out.println("Strings not matched!!!!!!!!!!!!");  
	 }
       }
     }

    public static void main(String args[])
    {
   	String s1;
	NotMatchException  p1=new NotMatchException ();
 	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a STRING"); 
	s1=sc.next();
	p1.varify(s1);
    }
}
	
	
	