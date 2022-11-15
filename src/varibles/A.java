package varibles;

public class A {
	
	
	static int b = 20;//static 
	
	int c = 30;//instance 
	
	static int d = 10;
	
	public void fun() {
		
		int b = 10;
		System.out.println(b+" "+d);
		++d; ++b;
	}
	
	public static void main(String[]args) {
		
		int a = 10;// local 
		
		A ref = new A();
		
		ref.fun();
		ref.fun();
		
		System.out.println(a);
		System.out.println(A.b);
		System.out.println(ref.c);
		
		
		
	}

}
