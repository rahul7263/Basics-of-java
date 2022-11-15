package MultiThreading;

public class runnable implements Runnable {
     
	 public void run() {
		 
		 for(int i = 0; i<=5; i++) {
			 
			 System.out.println("my child Thread");		
			 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		runnable r = new runnable();
		
		Thread t = new Thread(r);
		t.start();
		
		
		for(int i = 0; i<=5; i++) {
			 
			 System.out.println("my main"
			 		+ "  Thread");		
			 
		}
		
	}

}
