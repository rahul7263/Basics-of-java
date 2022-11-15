package constructor;

public class demo {
  
	public demo() {
		
		System.out.println("Defualt Constructor");
	}
	
	public demo(int a) {
		
		System.out.println(a);
	}
	
	public static void main(String []args) {
		
		//demo d = new demo();
		demo d1 = new demo(10);
	}
	
}
