class ExceptionDemo  
{
   public static void main(String args[])     
{
      int a,b,c;
      a=10;
      b=0;
      try     
  {
      c=a/b;
      System.out.println("division="+c);
} 
     catch(Exception e)      
    {
      System.out.println("Divide by zero can't possible");
    }
      finally
 {
     System.out.println("Thanks for visiting");  
    } 
  } 
}
