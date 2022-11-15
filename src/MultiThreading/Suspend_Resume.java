package MultiThreading;

public class Suspend_Resume extends Thread {
	
	public void run() {
		
		String name = Thread.currentThread().getName();
		for(int i=1;i<3; i++) {
			
			System.out.println(name);
			
		}
	}
	
	public void main(String[]args) {
		
		Suspend_Resume t1 = new Suspend_Resume();
		Suspend_Resume t2 = new Suspend_Resume();
		Suspend_Resume t3 = new Suspend_Resume();
		
		t1.setName("Rahul");
		t2.setName("Raj");
		t3.setName("Kshitij");
		
		t1.start();
		t2.start();
		t2.suspend();
		
		t3.start();
		
		t2.resume();
	}

}
