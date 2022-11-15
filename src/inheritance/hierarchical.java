package inheritance;

public class hierarchical {
 
  public void input () {
		
		System.out.print("Enter Your Name");
	}
}

class x extends hierarchical {
	
public void disp() {
		
		System.out.print("Rahul");
	}
}

class y extends hierarchical {
	
	
	public void show() {
		
		System.out.println("Kande");
		
	}
	
}

class demo{
	
	public static void main(String []args) {
		
		x X = new x();
		y Y = new y();
		
		X.input(); X.disp();
		Y.input(); Y.show(); 
		
		
	}
}