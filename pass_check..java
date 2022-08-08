import java.util.*;
class pass_check
{
    void varify(String p)
    {
       if(p.equals("hello"))
       {
	  System.out.println("password successfully entered!!!!!!!!!!!!");
       }
       else
       {
         try
         {
		throw new ArithmeticException("Authentication Failure");

	}catch( Exception e) 
	 {
	        System.out.println("Authentication Failure!!!!!!!!!!!!");  
	 }
       }
     }

    public static void main(String args[])
    {
   	String password;
	pass_check p1=new pass_check();
 	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a PASSWORD"); 
	password=sc.next();
	p1.varify(password);
    }
}
	
	
	