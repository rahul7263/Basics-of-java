package MultiThreading;

public class Block_Level_Synchronization {
         
	// think 100s line of code writen here and we want tu just execute 1 simple code above of all
	
	public void show(String name) {
	
	synchronized(this) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Execution of block level Synchronition....!"+name);
		 }
	  }
	
	// think 100s line of code writen here and we want tu just execute 1 simple code above of all
   
   }
}

class ourthread extends Thread{
	
	Block_Level_Synchronization b;
	String name;
	
	ourthread(Block_Level_Synchronization b, String name){
		
		this.b=b;
		this.name=name;
	}
	
	
	public void run() {
	  
		b.show(name);
	}
}

class SyncBlock{
	
	public static void main(String[]args) {
		
		Block_Level_Synchronization b = new Block_Level_Synchronization();
		
		ourthread t1 = new ourthread(b,"Rahul");
		ourthread t2 = new ourthread(b,"Ram");
		
		t1.start(); t2.start();
	}
}
