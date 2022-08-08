class eventhread extends Thread
{
   public void run()
   {
	for(int i=1;i<=20;i++)
	{
	   if(i%2==0)
	   {
		System.out.println(" "+i);
	   }
	}
   }
}
class oddthread extends Thread
{
  public void run()
   {
	for(int i=1;i<=20;i++)
	{
	   if(i%2==1)
	   {
		System.out.println("\t"+i);
	   }
	}
   }
}
class ThreadDemo
{
     public static void main(String args[])
     {
      eventhread e1=new eventhread();
      oddthread o1=new oddthread();
      System.out.println(" Even\tOdd");
      e1.start();
      o1.start();
     }
} 