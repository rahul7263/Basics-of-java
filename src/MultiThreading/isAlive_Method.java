package MultiThreading;

public class isAlive_Method extends Thread {
        
	public void run() {
		
		System.out.println("isAlive method program...!");
	}
}

class isAlive_Method2{
	
	public static void main(String[]args) {
		
		isAlive_Method t1 = new isAlive_Method();
		isAlive_Method t2 = new isAlive_Method();
		
		
		System.out.println(t1.isAlive());
		
		t1.start();
		System.out.println(t1.isAlive());
		
		t2.start();
	}
}