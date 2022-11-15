package Exception;

public class nullpointer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str = null;
		
		try {
			
			System.out.println(str.toUpperCase());
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
