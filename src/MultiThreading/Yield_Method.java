package MultiThreading;

public class Yield_Method extends Thread {
   
	public void run() {
		
		String name = Thread.currentThread().getName();
	    for(int i =0;i<=3;i++) {
	    	
	    	System.out.println(name);
	    	Thread.yield();
	    }
	}
}
 
class Yield_Method2 extends Thread{
   
	public void run() {
		
		String name = Thread.currentThread().getName();
		for(int i=0; i<=3; i++ ) {
			
		  System.out.println(name);
		}
	}
}

class Yield_Method3 extends Thread {

	public void run() {
		
		String name = Thread.currentThread().getName();
		
		for(int i=0; i<=3; i++) {
          
			System.out.println(name);
		}	 
	}
}

class Yield_Method4 {
	
	public static void main(String[]args) {
		
		Yield_Method y1 = new Yield_Method();
		Yield_Method2 y2 = new Yield_Method2();
		
		y1.start();
		y2.start();
	}
}