import java.util.*;
class throwsDemo
{
   void vali_num(int num)throws ArithmeticException
   {
      if(num==1)
      {
   	throw new ArithmeticException("number is equal to 1");
      }
      else
      {
	throw new ArithmeticException("number is  not equal to 1");
      }
   }
   public static void main(String args[])
   {
     	throwsDemo d1= new throwsDemo();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	try
        {
	  d1.vali_num(n);
        }catch(Exception e)
	 {
	    System.out.println(e);
	 }
    }
}

 