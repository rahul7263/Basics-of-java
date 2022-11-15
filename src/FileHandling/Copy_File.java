package FileHandling;
import java.io.*;
public class Copy_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		FileInputStream r = new FileInputStream("F:\\Software Study\\Software Study\\basics of java\\src\\FileHandling\\Renamed_File.txt");
		FileOutputStream w = new FileOutputStream("F:\\Software Study\\Software Study\\basics of java\\src\\FileHandling\\Renamed_File_1.txt");
		
		int i;
		
		while(( i=r.read()) !=-1 ) {
			
			w.write((char)i);
			
		}
		
		System.out.println("Data Copied Successfully..!");
	}

}
