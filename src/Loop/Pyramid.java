package Loop;

public class Pyramid {
	
	public static void main(String[] args) {
		
		  int n = 7;
		
        int k = 5;
  
        for (int i=0; i<n; i+=2)
        {
 
            for (int j=0; j<k; j++)
            {
                System.out.print(" ");
            }
  
            k = k -1;
  
       for (int j=0; j<=i; j++ )
            {
                System.out.print("*");
            }
  
            System.out.println();
	}

}
}