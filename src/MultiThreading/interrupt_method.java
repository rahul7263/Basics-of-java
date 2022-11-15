package MultiThreading;

public class interrupt_method extends Thread {
      
	public void run() {
		
		try {
		for(int i=0; i<=5; i++) {
			
			System.out.println("t1 thread running");
			Thread.sleep(1000);
		}
	  }
	 catch(Exception t) {
		  
		 System.out.println(t);
	   }	
	 }
		
  		
}

class interrupt_method2  {
	
	public static void main(String[]args) {
	
	interrupt_method t1 = new interrupt_method();
	
	      t1.start();
	      t1.interrupt();
   }
	
}