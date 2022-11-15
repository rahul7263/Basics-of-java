package Interview_Questions_on_Stings;

import java.util.Scanner;

public class practice {
       
	public static void main(String[]args) {
		
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		
		System.out.println(s.length());
		
		for(int i = s.length(); i>0; --i) {
			
			System.out.print(s.charAt(i-1));
		
			}
		
	}
}
