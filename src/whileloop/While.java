package whileloop;
import java.util.Scanner;
public class While {
           
	 public static void main(String[]args) {
		 
		 int n;
		 System.out.println("Enter vale for Condition\n");
		 
		 Scanner s  = new Scanner(System.in);
		 
		 n = s.nextInt();
		 
		 while(n<=10) {
			 
			 System.out.println("Hello World");
			 ++n;
		 }
		 
	 }
}
