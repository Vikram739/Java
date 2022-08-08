import java.util.*;
class emp
{
  public String name;
  public int id,sal;
  public void get()
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter The Name: ");
    name=s.next();
    System.out.print("Enter The id: ");
    id=s.nextInt();
    System.out.print("Enter The sal: ");
    sal=s.nextInt();
    s.close();
  }
  public void disp()
  {
     System.out.println("The Name of the employee is "+name+" having id: "+id+"and a salary worth to: "+sal);
  }
}
class MainClass extends emp
{
  public static void main(String []arg)
  {
    Scanner s=new Scanner(System.in);
    int cnt=0,i=0;
    System.out.print("Enter The number of Employees: ");
    cnt=s.nextInt();
    emp e[] = new emp[cnt];
    for(i=0;i<cnt;i++)
    {
      e[i]= new emp();
      e[i].get();
    }
    for(i=0;i<cnt;i++)
    {
      e[i].disp();
    }
    s.close();
  }
}    

