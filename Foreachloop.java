import java.util.*;
class Foreachloop
{
   public static void main(String args[])
   {
	int a[]=new int[5];
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter arrray elements:");
	for(i=0;i<5;i++)
	{
	   	a[i]=sc.nextInt();
	}
	System.out.print("Your arrray elements:");
	for(int ele:a)
	{
	   	System.out.print(ele+" ");
	}
   }
}