package FileHandling;
import java.io.*;

public class Rename_Fiile {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   
		File f = new File("F:\\Software Study\\Software Study\\basics of java\\src\\FileHandling\\Rename.txt");
		File f1 = new File("F:\\Software Study\\Software Study\\basics of java\\src\\FileHandling\\Renamed_File.txt");
	 
		if(f.exists()) {
			
			System.out.println(f.renameTo(f1));
			
		}else {
			
			System.out.println("File does not exits");
		}
	}

}
