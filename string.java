import java.util.*;
class string
{
   public static void main(String args[])
   {
	String a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any String:");
	a=sc.next();
	String str=new String(a);
	System.out.println("original string:"+str);
	System.out.println("character at position 3 :"+str.charAt(2));
	System.out.println("Length of string:"+str.length());
	System.out.println("String is equal to vikram:"+str.equals("vikram"));
	int i=str.indexOf('r');
	i=i+1;
	System.out.println("Index of character );
	System.out.println("concanicated string:"+str.concat("markali"));
	System.out.println("string in upper case:"+str.toUpperCase());
	System.out.println("Trimed string:"+str.trim());
    }
}