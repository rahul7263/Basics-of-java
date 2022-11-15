package NewKeyword;

import java.util.Scanner;

public class newKeyword {
         
	  //int a =10; //instance of class
	  
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int size;
		
		System.out.println("Enter array size");
		
		Scanner s = new Scanner(System.in);
		
		size = s.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter array Elements");
		
		for(int i=0; i<size; i++ ) {
			
			a[i] = s.nextInt();
		}
		
		System.out.println("Array Elemetns: ");
		for(int m : a) {
			
			System.out.print(m+" ");
		}
	}

}
