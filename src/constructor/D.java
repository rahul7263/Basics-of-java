package constructor;

public class D {
    
	//private constuctor
	
	int a; double b; String c;
	
	private D(){
		
		a=10; b=30.56; c="Rahul";
		System.out.println(a+" "+b+" "+c);
	}
	
	public static void main(String[]args) {
		
		D d = new D();
	}
	
}
