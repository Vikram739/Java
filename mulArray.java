import java.util.*;
class mulArray
{
 
 
   int a[][]=new int[3][3];
   int b[][]=new int[3][3];
   int c[][]=new int[3][3];
   int i,j;
   void getdata()
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter First aarray Elements");
   for(i=0;i<3;i++)
   {
	for(j=0;j<3;j++)
	{
		a[i][j]=sc.nextInt();
	}
        System.out.println();
   }
   System.out.println("Enter second aarray Elements");
   for(i=0;i<3;i++)
   {
	for(j=0;j<3;j++)
	{
		b[i][j]=sc.nextInt();
	}
        System.out.println();
   }
  }
   void calculate()
   {
   for(i=0;i<3;i++)
   {
	for(j=0;j<3;j++)
	{
    		c[i][j]=a[i][j]+b[i][j];
	}
        
   }A
   }
   void display()
   {
   System.out.println("***************************************************************Addition of matrix*****************************************************************************");
   for(i=0;i<3;i++)
   {
	for(j=0;j<3;j++)
	{
		System.out.print(c[i][j]+"\t");
	}
        System.out.println();
   }
 }
 public static void main(String args[])
 {
     mulArray m1=new mulArray();
     m1.getdata();
     m1.calculate();
     m1.display();
  }

}






















