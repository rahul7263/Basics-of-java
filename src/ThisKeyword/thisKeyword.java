package ThisKeyword;

public class thisKeyword {
	
	
	int a;
	
	
	thisKeyword(){
		
		System.out.println("call from this keyword");
	}
	
	thisKeyword(int a){
		
		
		this();
		this.a =a;
	}
	
	public void show() {
		
		System.out.println(this);
		System.out.println(a);
	}
	
	public static void main(String[]args) {
		
		thisKeyword t = new thisKeyword(100);
		
		System.out.println(t);
		
		t.show();
	}

}
