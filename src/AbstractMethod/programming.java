package AbstractMethod;

public abstract class programming {
 
	public abstract void Developer();
    public abstract void Rank();
	
}

 class HTML extends programming {
	
	@Override
	public void Developer() {
		
		System.out.println("Rahul Kande");
	}
	@Override
	public void Rank() {
		
	}

	
}

 class Java extends programming {
	
	@Override
	public void Developer() {
		
		System.out.println("Akash Shinde");
	}
	
	@Override
	public void Rank() {
		
	}
}
 class main{
	
	public static void main(String[]args) {
		
		programming h = new HTML();
		h.Developer(); h.Rank();
		
		programming j = new Java();
		j.Developer();
	}
}