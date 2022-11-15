package Exception;

public class exception_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		
		int a=10,b=0,c;
		
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		System.out.println("main method started");

	}

}
