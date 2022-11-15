package Interview_Questions_on_Stings;

import java.util.Scanner;

public class ReverseString_Without_Using_Reverse_Function {
     
	public static void main(String[]args) {
		
		String s;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		
		s = sc.nextLine();
		System.out.println("After reverse string is: ");
		
		for(int i = s.length(); i>0 ; --i) {
			
			System.out.print(s.charAt(i-1));
		}
		
	}
}
