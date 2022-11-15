package try_catch;

public class NFE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String str = "Rahul";
		
		try {
		int a = Integer.parseInt(str);
		System.out.println(a);
		
		
		}catch(Exception e) {
			
			System.out.println("String "+str+" Can not be converted in interger");
		}
		System.out.println("end of String Number Format exception");
	}

}
