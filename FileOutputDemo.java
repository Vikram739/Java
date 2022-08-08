import java.io.*;
class FileOutputDemo
{
   public static void main(String args[])throws IOException
   {
    	File f1=new File("vikram.txt");
	FileOutputStream fos =new FileOutputStream(f1);
	fos.write("Government Polytecnic Awasari Khurd(Pune)".getBytes());
	System.out.println("Data writtern to file successfully!!!!!!!!!!!!!!!!");
	fos.close();
    }
}   	