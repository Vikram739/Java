//package vaishali;
import java.util.*;
interface calculate
{
    
    void areaofrect();
    void areaofcircle();
}
class getting
{
    int len,bre,redius;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {	
	System.out.println("Enter length of rectangle:");
	len=sc.nextInt();
	System.out.println("Enter breadth of rectangle:");
	bre=sc.nextInt();
	System.out.println("Enter redius of circle:");
	redius=sc.nextInt();
    }
}
class Area extends getting implements calculate
{
    double c,d;
    final double PI=3.14;
    public void areaofrect()
    {
	c=(len*bre);
    }
    public void areaofcircle()
    {
	d=(double)(PI*redius*redius);
    }
    void display()
    {
	System.out.println("Area of Rectangle="+c);
	
    }
    void display1()
    {
	System.out.println("Area of Circle="+d);
    }
    public static void main(String args[])
    {
	Area a1=new Area();
	a1.getdata();
	a1.areaofrect();
	a1.areaofcircle();
	System.out.println("****AREA OF RECTANGLE****");
	a1.display();
	System.out.println("****AREA OF CIRCLE****");
	a1.display1();
    }
}
	
   