class ExceptionDemo1
{
    public static void main(String args[])
    {
	int a=10,b=0,c;
	System.out.println("Execution Start");
	try
	{
	    c=a/b;
	    System.out.println("Division="+c);
	}
	catch(Exception e)
	{
	    System.out.println("Divide by zero is invalid");
	}
	
	System.out.println("Execution End");
    }
}  