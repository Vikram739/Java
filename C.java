import java.util.*;
interface A
{
    
    void addition();
}
class B
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {	
	System.out.println("Enter first value");
	a=sc.nextInt();
	System.out.println("Enter second  value");
	b=sc.nextInt();
    }
}
class C extends B implements A
{
    int c;
    public void addition()
    {
	c=a+b;
    }
    void display()
    {
	System.out.println("Additon="+c);
    }
    public static void main(String args[])
    {
	C c1=new C();
	c1.getdata();
	c1.addition();
	System.out.println("****ADDITION****");
	c1.display();
    }
}
	
   