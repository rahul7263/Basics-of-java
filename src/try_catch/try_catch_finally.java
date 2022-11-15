package try_catch;

public class try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 
		try {
			
			System.out.println("try block-0");
			int a=20, b=2,c;
			c=a/b;
			
			System.out.println(c);
			System.out.println("try block-1");
			
		}
		catch(ArithmeticException a){
		  	 
			System.out.println("Can not devide by zero");
		}
		
		finally
		
		{
			System.out.println("finally block-0");
			
		}
		
		System.out.println("main Method end");
	}

}
