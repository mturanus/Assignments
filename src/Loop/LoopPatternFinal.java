package Loop;

public class LoopPatternFinal {
	
	public static void main(String[] args) {
		int p=5; 
	
        int l =p-1;
        int number=0; 

        for (int i=0; i<p; i++)
        {
        	number++;
            for (int j=0; j<l; j++)
            {   
                System.out.print(".");
            }
          
            l = l - 1;
 
                System.out.println(number);
                
         
	}

}
}