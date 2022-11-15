package elseif;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Your grade");
		int grade = s.nextInt();
		
		if(grade<35) {
			
			System.out.println("fail");
		}
		
		else if(grade>=35 && grade<65) {
			
		    System.out.println("Frist Class");
		}
		
		else if(grade>=65 && grade<=100) {
			
			System.out.println("Distingtion");
		}
		
		else {
		     System.out.println("Invalid input plase enter valid marks");
		}
	}
	

}
