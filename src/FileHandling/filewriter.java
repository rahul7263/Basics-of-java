package FileHandling;

import java.io.*;

public class filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		try {
			
       FileWriter f = new FileWriter("F:\\Software Study\\Software Study\\basics of java\\src\\FileHandling\\FileWriter.txt"); 
			  
           
           try {
        	   
        	   f.write("Java Programming is the best Language..!");
        	   
           }finally {
        	   
        	   f.close();
           }
           
           System.out.println("Succesfully Data Wrote in file ");
       
			}catch(Exception e){
				
				System.out.println(e);
			}
			
		}

	}

	


