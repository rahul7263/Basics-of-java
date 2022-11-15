package inheritance;

public class b extends multilevel{
	
	
	public void multi() {
		
		a=10; b=20;
		
		c=a*b;
		
		System.out.println("Multiplication of two numbers"+c);
	}
	
	public void div() {
		
		a=50; b=5;
		c=a/b;
		System.out.println("Division of two numbers: "+c);
	}
	
}