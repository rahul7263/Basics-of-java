package encapsulation;

public class A {
     
	private int a;// data hiding
	
	public void setValue(int x) {
		
		a=x;
	}
	
	
	public int getValue() {
		
	 	return a;
	}
}

class B{
	
	public static void main(String []args) {
	  	
		A r = new A();
		r.setValue(100);
		System.out.println(r.getValue());
		
	}
}