package MultiThreading;

public class Method_Level_Synchronized {

	public synchronized void printtable(int n) {
		
		for(int i=0; i<=10;i++) {
			System.out.println(n*i);
		}
	}

}

class thread1 extends Thread{
	
	Method_Level_Synchronized t;
	
	thread1(Method_Level_Synchronized t){
		
		this.t=t;
	}
	
	public void run() {
		
		t.printtable(5);
	}

	
}

class thread2  extends Thread{
	

	Method_Level_Synchronized t;
	
	thread2(Method_Level_Synchronized t){
		
		this.t=t;
	}
	
	public void run() {
		
		t.printtable(7);
	}

	
}

class main{
	
	public static void main(String[]args) {
		

		Method_Level_Synchronized obj = new Method_Level_Synchronized() ; // obj has 1 lock
		
		thread1 t1 = new thread1(obj);
		thread2 t2 = new thread2(obj);
		
	    t1.start(); t2.start();
		
	}
}