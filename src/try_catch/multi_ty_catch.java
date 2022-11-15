package try_catch;

public class multi_ty_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		try {
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		
		}catch(ArithmeticException a) {
			
			System.out.println("Can't devide by zero");
		}
		
		try {
			int a[] = {10,20,30,40,};
			System.out.println(a[5]);
		
		}catch(ArrayIndexOutOfBoundsException b) {
			
		    System.out.println("byeond the array limit");	
		}
	}

}
