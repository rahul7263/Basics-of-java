package MultiThreading;

public class Static_Synchronization extends Thread {
  
	static int bal = 5000;
	static int withdraw;
	
	Static_Synchronization(int withdraw){
		
		this.withdraw = withdraw;
	}
	
	 public static synchronized void Withdraw() {
		
		String name = Thread.currentThread().getName();
		
		if(withdraw<=bal) {
			
			System.out.println(name+ " withdrawn money");
			bal = bal-withdraw;
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	 
	 public void run() {
		 
		 Withdraw();
	 }
}

class client{
	
	public static void main(String[]args) {
		
		Static_Synchronization bank = new Static_Synchronization(5000);
		
		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(bank);
		
		t1.setName("Ram");
		t2.setName("Raju");
		
		Static_Synchronization bank2 = new Static_Synchronization(5000);
		
		Thread t3 = new Thread(bank2);
		Thread t4 = new Thread(bank2);
		
		t3.setName("Ravi");
		t4.setName("Raj");
		
		t1.start(); t2.start();
		t3.start(); t4.start();
	}
}