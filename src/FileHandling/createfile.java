package FileHandling;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         
		File f = new File("F:\\Software Study\\Software Study\\basics of java\\src\\FileHandling\\FileHandlingDemo.txt");
		
		if(f.createNewFile()) {
			
			System.out.println("File Successfully Created...!");
			
		}else {
			
			System.out.println("File Already Exists...!");
		}
		
		if(f.exists()) {
			
			System.out.println("File Name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File Wriatble: "+f.canWrite());
			System.out.println("File Readbale: "+f.canRead());
			System.out.println("File Size: "+f.length());
			//System.out.println("File Delete: "+f.delete());
			
		}else {
			
			System.out.println("File does not Exists");
		}
	}

}
