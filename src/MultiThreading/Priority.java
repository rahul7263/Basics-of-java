package MultiThreading;

public class Priority extends Thread {
  
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}
}

class Priority2 {
	
	public static void main(String[]args) {
		
		Priority t1 = new Priority();
		Priority t2 = new Priority();
		Priority t3 = new Priority();
		
		t1.setName("t1 thread");
		t2.setName("t2 Thread");
		t3.setName("t3 thread");
		
		t1.setPriority(2);
		t2.setPriority(6);
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
