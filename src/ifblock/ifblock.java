package ifblock;
import java.util.Scanner;
public class ifblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int age;
		
		System.out.println("enter your age");
		
		Scanner s = new Scanner(System.in);
		
		age =s.nextInt();
		
		if(age>=18) {
			
			System.out.println("Eligible for votes....!");
		}
		
		System.out.println("Thank You...!");
		
	}

}
