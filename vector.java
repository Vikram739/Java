import java.util.*;
class vector
{
    public static void main(String args[])
    {
	Vector v1=new Vector();
	System.out.println("size of vector="+v1.size());
	System.out.println("size of vector="+v1.capacity());
        
        v1.addElement(10);
	v1.addElement(20);
	v1.addElement(30.5f);
	v1.addElement("Vikram");
	
	System.out.println(" after adding size of vector="+v1.size());
	System.out.println("after adding capacity of vector="+v1.capacity());
	System.out.print("Vector Elements are:"+v1);
    }
}