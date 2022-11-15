package switchblock;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a=10,b=20,c;
		
		System.out.println("Enter Your Choice...!\n");
		
		Scanner s = new Scanner(System.in);
		
		c=s.nextInt();
		
		switch(c) {
		     
		case 1:System.out.println("sum"+(a+b));
		break;
		case 2:System.out.println("sub"+(a-b));
		break;
		case 3:System.out.println("multi"+(a*b));
		break;
		case 4:System.out.println("div"+(a/b));
		break;
		default:System.out.println("invalid chocie...!");
		
		}
	}

}
