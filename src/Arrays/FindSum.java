package Arrays;

public class FindSum {
	
	
	public static void main(String[] args) {
		
		
		FindSum fSum=new FindSum ();
		
		int[] num = {2,3,5,6,7,8,9,10,1,4} ; 
		
		fSum.sum(num, 5);
		
	}

	public void sum(int[] k, int l) {

		for (int i = 0; i < k.length; i++) {

			for (int j = i + 1; j < k.length; j++) {

				if (k[i] + k[j] == l) {
					
					System.out.println("["+i+","+j+"]");

					break;
				}
			}
		}

	}

}
