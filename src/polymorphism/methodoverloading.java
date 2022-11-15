package polymorphism;

public class methodoverloading {
 
	public int add() {
		
		int a=10; int b=20,c;
		c=a+b;
	   return c;
	}
	
	public void add(int x, int y) {
		
		int c;
		c=x+y;
		System.out.println(c);
		
	}
	
	public void add(int x, double y) {
		
		double c;
		c=x+y;
		System.out.println(c);
	}
	
	public static void main(String[]args) {
		
		methodoverloading m = new methodoverloading();
		
		
		m.add(20, 20.20);
	    m.add(10, 20);
	   int c = m.add();
	   System.out.print(c);
	   
	}
}
