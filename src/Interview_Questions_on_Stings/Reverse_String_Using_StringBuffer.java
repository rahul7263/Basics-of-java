package Interview_Questions_on_Stings;

public class Reverse_String_Using_StringBuffer {
 
	public static void main(String[]args) {
		
		String srt = "Rahul";
		
		//convertion from string object to stringbuffer
		
		StringBuffer sbr = new StringBuffer(srt);
		
		//to reverse string 
		sbr.reverse();
		
		System.out.println(sbr);
		
	}
}
