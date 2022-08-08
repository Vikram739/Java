import java.io.*;
import java.util.*;
interface Emploee
{
   void get_emp_info();
   void dis_emp_info();
}
class Emploee1 implements Emploee
{
   
    int id;
    String name;
    String desig;
    String city;
    float sal;
   Scanner sc=new Scanner(System.in);
   public void get_emp_info()
   {
    
	System.out.println("Enter Emploee ID:");
	id=sc.nextInt(); 
	System.out.println("Enter Emploee Name:");
	name=sc.next(); 
	System.out.println("Enter Emploee designation:");
	desig=sc.next(); 
	System.out.println("Enter Emploee City:");
	city=sc.next(); 
	System.out.println("Enter Emploee Salary:");
	sal=sc.nextFloat(); 
   }
   
  public void dis_emp_info()
   {
	System.out.println("				"+id+"		"+name+"		"+desig+"		"+city+"		"+sal);
   }
}
class Myprg
{
    public static void main(String args[])throws IOException
    {	
	
	Emploee1 e[]=new Emploee1[3];
        int i;
        for(i=0;i<3;i++)
	{
		e[i]=new Emploee1();
	}
	for(i=0;i<3;i++)
	{
		e[i].get_emp_info();
	}
	
	System.out.println("***********************************EMPLOEE MANAGEMENT SYSTEM***********************************************\n\n\n");
	System.out.println("------------------------------------------------------------------------------------------------------------");
	System.out.println("				ID		NAME		DESIG		CITY		SALARY");
	System.out.println("------------------------------------------------------------------------------------------------------------");
	for(i=0;i<3;i++)
	{
		e[i].dis_emp_info();
	}
   }
}
	
	
	
 