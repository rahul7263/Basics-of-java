package MultiThreading;

public class Thread_Schedular extends Thread {
   
	public void run(){
		
		String n = Thread.currentThread().getName();
		
		for(int i=1; i<=3; i++) {
			
			System.out.println(n);
		}
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Thread_Schedular t1 = new Thread_Schedular();
		Thread_Schedular t2 = new Thread_Schedular();
		Thread_Schedular t3 = new Thread_Schedular();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t3.start();
		t1.start();
		t2.start();	
		
	}
}
	


