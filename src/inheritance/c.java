package inheritance;

public class c extends b{
	
	public void rem() {
	a=10; b=20;
	
	c=a%b;
	System.out.println("Reminder of two numbers: "+c);
	
	}
	
public static void main(String[]args) {
		
		c C = new c();
		
		C.add(); C.rem(); C.div(); C.multi(); C.sub(); 
	}
	
}