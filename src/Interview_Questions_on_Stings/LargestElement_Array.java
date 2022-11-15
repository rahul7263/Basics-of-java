package Interview_Questions_on_Stings;

public class LargestElement_Array {
   
	public static void main(String[]args) {
		
		//initialize array
		int arr []  = new int [] {25,11,7,75,56};
		
		//initialize max with first element of array
		
		int max  = arr[0];
		
		//loop through the array
		
		for(int i=0; i<arr.length; i++) {
			
			//comapre element of array with max
			if(arr[i] > max) {
			  	
			   max= arr[i];	
			}			
			
			System.out.println("Largest element present in array"+max);
		}
	}
}
