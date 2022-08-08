import java.io.*;
class FileInputStreamDemo
{
	public static void main(String args[])throws IOException
	{
		File f1=new File("vikram.txt");
		FileInputStream fis=new FileInputStream(f1);
		int x;
		while((x=fis.read())!=-1)
		{
			System.out.print((char)x);
		}
		fis.close();
	}
}	
