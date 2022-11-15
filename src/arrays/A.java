package arrays;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int size,i;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of arrays");
		
		size = s.nextInt();
		
		int a[] = new int [size];
		
		for(i=0; i<size; i++) {
			
			a[i] = s.nextInt();
		}
		System.out.println("Printed Array Elemetns ");
		
		for(int b:a) {
			
			System.out.println(b);
		}
	}

}
