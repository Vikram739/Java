package lep;

import static java.lang.System.in;
import java.util.Scanner;

public class employee 
{

    private static void employee_menu() {
        Scanner in = new Scanner(System.in);
        int employee_menu_choice;
 System.out.println("\n"+"\n"
  +"\n"+"\n"+"\n"
  +"\t  *******************************************************"+"\n"
  +"\t  **                                                   **"+"\n"
  +"\t  **                   You Are In                      **"+"\n"
  +"\t  **                                                   **"+"\n"
  +"\t  **                  Employee Menu                    **"+"\n"
  +"\t  **                                                   **"+"\n"
  +"\t  *******************************************************"+"\n"
  +"\n");
 loop_of_employee_menu:
 
        System.out.println("\t\t  What do you want to do for employee  "      +"\n"
        +"\t\t  ==================================="      +"\n"
        +"\n"
        +     "\n\n\t 1  =>  Add employee  "
        +     "\n\n\t 2  =>  Employee menu Exit \n"
        +         "\t===     ------------------ "+"\n"
        +"\t\t\t\tYou Select : ");

        employee_menu_choice=in.nextInt();
        if (employee_menu_choice>0)
        {
                switch (employee_menu_choice)
                {
                    case 1:
                    {
                        add_employee();//Function
                        break ;
                    }
                    case 2:
                    {
                        return;
                    }
                    default :
                    {
                        return;
                    }
                }//end switch
        }//end if
        else
        {
            clearConsole();
        }//end else
        return;
    
    }

    private static void add_employee() {
        clearConsole();
        Scanner in = new Scanner(System.in);
        System.out.println("\n"+"\n"+"\n"
        +"\n"+"\n"+"\n"
        +" \t  *******************************************************"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  **                  Adding Employee                  **"+"\n"
        +"\t  **                                                   **"+"\n"
        +"\t  *******************************************************"+"\n");

 System.out.println("\n"
  +"\t\tCOLLECTING DATA FOR EMPLOYEE NO : "+(Integer.toString(size))
                +"\n"
  +    "\n\tEnter name : ");

 name=in.nextLine();//taking name

 System.out.println(    "\n\tEnter Address  : ");
 Address=in.nextLine();//taking Address
 
 System.out.println(    "\n\tEnter Phone Number : ");
 phoneNum=in.nextLine();
 
 System.out.println(    "\n\tEnter Status  : ");
 status=in.nextLine();
 
 
 System.out.println(    "\n\tEnter Salary : ");
 salary=in.nextInt();

 System.out.println(    "\n\tEnter Grade  : ");
 Scanner in1 = new Scanner(System.in);
        grade=in1.nextLine();
 
 id = size;//settind customer id

 System.out.println("\n"           
  +"Customer added with following data"          +"\n"
  +"\n"
  +"Name : "+name    +"\n"
  +"Adress : "+Address    +"\n"
  +"Phone Number : "+phoneNum    +"\n"
  +"Grade : "+ grade    +"\n"
  +"Salary : "+salary    +"\n"
  +"Status : "+status    +"\n"
  +"ID : "+ (Integer.toString(id))       +"\n");

 size++;

    }
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    static String name;
    static int id;
    static String Address;
    static String phoneNum;
    static String statusString ;
    static int salary;
    static String grade;
    static String status;
    
    static int size=0;
    public static void main(String args[]) {
        System.out.println("\n\n\n"
  +"\t*******************************************************\n"
  +"\t**                                                   **\n"
  +"\t**                   Welcome To                      **\n"
  +"\t**                                                   **\n"
  +"\t**       Employee ARRAY and STRUCTURES Demo          **\n"
  +"\t**                                                   **\n"
  +"\t*******************************************************\n");
        System.out.println("\t\t\t");
        employee_menu();
    }
    
}
