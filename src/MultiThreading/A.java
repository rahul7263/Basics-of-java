package MultiThreading;

public class A extends Thread { 
            
	@Override
	public void run() {
		
		for(int i = 0; i<=5; i++) {  
			
			System.out.println("Rahul Kande");
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	

  public static void main(String[]args) {
		
		A t = new A();
		t.start();
		
          for(int i = 0; i<=5; i++) {
			
			System.out.println("Rahul");
		}
				
	}
  

}