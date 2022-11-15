package MultiThreading;

public class Bus implements Runnable {
    
	int seat = 1, passenger;
	
	Bus(int passenger){
		
		this.passenger = passenger;
	}
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		
		String name = Thread.currentThread().getName();
		
		if(seat>=passenger) {
			System.out.println(name+" Resvered Seat..!");
			seat = seat-passenger;
		}
		else {
			System.out.println("Sorry seat not avilable...!");
		}
	}
  
}

class customer {
	
	public static void main(String[]args) {
	
	Bus b = new Bus(1);
	
	Thread t1 = new Thread(b);
	Thread t2 = new Thread(b);
	Thread t3 = new Thread(b);
	
	t1.setName("Ram");
	t2.setName("Sita");
	t3.setName("Hanuman");
	
	t1.start();
	t2.start();
	t3.start();
	
	}
}
