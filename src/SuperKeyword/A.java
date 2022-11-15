package SuperKeyword;

class A {
    
	int a =10;
	
public void show() {
		
		System.out.print("Parent class");
		
	}

   public void A() {
	   
	   System.out.println("Hello Parent Class Constructor");
   }

}
class B extends A{
	
	int a = 20;
	
	public void show() {
		
		super.show();
		System.out.print(a);
		System.out.print(super.a);
	}
	
	 public void B() {
		   
		 
		   System.out.println("Hello Child Class Constructor");
		   
	   }
}

class test{
	
	public static void main(String[]args) {
		
		B b =new B();
		b.show();
	}
}