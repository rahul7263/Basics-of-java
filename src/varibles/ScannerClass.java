package varibles;

import java.util.Scanner;

public class ScannerClass {

	 
	public static void main(String[]args) {
		
		int a;
		
		System.out.print("Enter Number");
		
		//Scanner class Object
		
		Scanner obj = new Scanner(System.in);
		
		a = obj.nextInt();
		
	  System.out.println("Get Your Number"+a);
		
		
	}
}
