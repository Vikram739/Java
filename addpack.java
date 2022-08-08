import let_me_calculate.*;
import java.util.*;
class addpack
{
    public static void main(String args[])
    {
	int a,b,c;
	calculator c1=new calculator();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	c=c1.add(a,b);
	System.out.println("Addition="+c);
    }
}