package FileHandling;
import java.io.*;

public class filerReader {
   
	public static void main(String[]args) {
		
		try {
			
			FileReader r  = new FileReader("F:\\\\Software Study\\\\Software Study\\\\basics of java\\\\src\\\\FileHandling\\\\FileWriter.txt");
			
			try {
				
				int i;
				while((i=r.read()) !=-1){
					
					System.out.print((char)i);
				}
				
			}finally {
				
				r.close();
				System.out.println("\n File closed");
			}
			
		}catch(Exception e){
			
			System.out.println(e);			
		}
	}
}
