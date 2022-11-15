package MultiThreading;

public class Stop_Method extends Thread {
 
	public void run() {
		
		String name = Thread.currentThread().getName();
		for(int i =1; i<=3; i++) {
			
			System.out.println(name);
		}
	}
}

class Stop_Method2 {
 	
  public static void main(String[]args) {
	  
	  Stop_Method t1 = new Stop_Method();
	  Stop_Method t2 = new Stop_Method();
	  Stop_Method t3 = new Stop_Method();
	  
	  t1.setName("t1 Thread");
	  t2.setName("t2 Thread");
	  t3.setName("t3 Thread");
	  
	  t1.start();
	  t2.start();
	  t3.start();
	  
	  t2.stop();
	  
  }	
}
