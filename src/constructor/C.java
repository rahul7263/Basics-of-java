package constructor;

public class C {
	
	//copy constructor
	
	int a; String b;
	
	public C() {
		
		a=10; b="Rahul";
		System.out.println(a+" "+b);
	}
    
	public C(C ref) {
		
		a =ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
	
	public static void main(String[]args) {
		
		C c = new C();
		C c2 = new C(c);
	}
}
