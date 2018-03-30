package Loop;

public class LoopPattern {
	public static void main(String[] args) {
		  
		int n = 7;
			
	        int k = n;
	        
	        int number=0; 
	  
	        for (int i=0; i<n; i+=2)
	        {
	        	number++;
	 
	            for (int j=0; j<k; j++)
	            {
	                System.out.print(" ");
	                
	            }
	  
	            k = k -1;
	  
	       for (int j=0; j<=i; j++)
	            {
	                System.out.print(number);
	            }
	  
	            System.out.println();
		}

	}

}
