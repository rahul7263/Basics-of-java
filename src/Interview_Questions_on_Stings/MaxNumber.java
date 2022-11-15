package Interview_Questions_on_Stings;

public class MaxNumber {
   
	public static int max(int[] a){
		int n = a.length;
		int temp;
		for (int i = 0; i < n; i++) 
		        {
		            for (int j = i + 1; j < n; j++) 
		            {
		                if (a[i]<a[j]) 
		                {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }
		       return a[0];
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int a[]={1,2,5,6,3,2};
		System.out.println("Smallest: "+max(a));
		
		}
     }

