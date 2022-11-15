package MultiThreading;

public class Join_Method_2 extends Thread {
     
	public void run() {
		
		String n = Thread.currentThread().getName();
		
		for(int i =1; i<=3; i++) {
			
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Join_Method_2 j1 = new Join_Method_2();
		Join_Method_2 j2 = new Join_Method_2();
		Join_Method_2 j3 = new Join_Method_2();
		
		j1.setName("Thread 1");
		j2.setName("Thread 2");
		j3.setName("Thread 3");
		
		j2.start();
		
		try {
			j2.join();
		}catch (Exception e) {
			
		}
		
		j1.start();
		j3.start();
		
    String n = Thread.currentThread().getName();
		
		for(int i =1; i<=3; i++) {
			
			System.out.println(n);
		}
		
	}

}


