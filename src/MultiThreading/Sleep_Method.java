package MultiThreading;

public class Sleep_Method extends Thread {
	
	public void run() {
		
		String n = Thread.currentThread().getName();
		
		try {
			for(int i=1; i<=3; i++) {
				
				System.out.println(n);
				Thread.sleep(3000);
			
			}
		}catch(Exception e) {
			
			
		}
	}
	
	public static void main(String []args) {
	
	   Sleep_Method b1 = new Sleep_Method();
	   Sleep_Method b2 = new Sleep_Method();
	   Sleep_Method b3 = new Sleep_Method();
	   
	   b1.setName("Thread 1");
       b2.setName("Thread 2");
       b3.setName("Thread 3");
       
       b1.start();
       b2.start();
       b3.start();
	}

}
