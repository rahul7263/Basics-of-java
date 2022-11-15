package Strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//java inbuilt two types of memeory scp and heap memeory
		
		String a = "Hello World";//string bilateral stores in string constant pool scp
		System.out.println(a);
		
		String b = new String("Hello Java");// it can be stroe in scp or heap memory
		System.out.println(b);
	}

}
