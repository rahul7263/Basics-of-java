package inheritance;
interface A{
	
	public void show();
	
}

interface f{
	
	public void fun();
}



public class multiple implements A,f {
     
	@Override
	public void fun() {
		
		System.out.println("Interface f");
	}

	@Override
	public void show() {
		
		System.out.println("interface A");
	}
	
   public static void main(String[]args) {
		
		multiple m = new multiple();
		
		m.show(); m.fun();
		
		
	} 
	 
}
