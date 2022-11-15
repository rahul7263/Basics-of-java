package constructor;

public class A {
    
	int a; String n;
	
	//default constructor 
	
	A(){
		
		a=10; n="Rahul Kande";
	}
	
	public void fun() {
		
		System.out.println(a+" "+n);
    
    }
	
	
	public static void main(String []args) {
		
		
		A a = new A();
		
		a.fun();
		
		
	}
}
