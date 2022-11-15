package ifelse;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int n;
		
		System.out.println("Enter Any Number....!");
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
	   if(n>=0) {
		   System.out.println("+ve number");
	   }
	   else {
		  System.out.println("-ve number");
	   }
	  		
	}

}
