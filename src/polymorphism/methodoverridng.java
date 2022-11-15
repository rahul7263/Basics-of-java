package polymorphism;

public class methodoverridng {
   
	public void draw() {
		
		System.out.println("infix laptops are great in price");
	}
}

class square extends methodoverridng {
	

	
	public void draw() {
		
		System.out.println("intel i3 10th gen");
	}
}

class test {
	
	public static void main (String []args) {
		
		methodoverridng v = new methodoverridng();
		
		v.draw();
	}
}
