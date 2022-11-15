package interface_Type;
import java.util.Scanner;
public class Raju implements client {

	String name; double sal;
	
	public void input () {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username: ");
		name = s.nextLine();
		
		System.out.println("Enter Salary: ");
		sal = s.nextDouble();
		
		
	}
	
	public void output() {
		
	 System.out.println(name+" "+sal);
	}
 
	 public static void main(String[]args) {
		 
		 client c = new Raju();
		 c.input(); c.output();
	 }
}
