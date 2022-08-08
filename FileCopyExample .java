import java.io.BufferedReader;
import java.io.*;
 
class FileCopyExample 
{
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("output.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("file copied successsfully!!!!!!!!!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}