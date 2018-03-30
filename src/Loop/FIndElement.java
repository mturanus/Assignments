package Loop;

public class FIndElement {
public static void main(String[] args) {
	
	FIndElement el=new FIndElement (); 
	
	el.findElement("Black");
	
	
	
	
	
	
	
}

 public int findElement (String element) {
	 
	 String [] colors= {"Red", "Blue", "Black", "Green", "Orange", "Brown"};

		for(String nn: colors) {
			
			if(nn.equals(element)) {
				System.out.println(nn.indexOf(element));
				return nn.indexOf(element);
				
			}
		
			
}
		return -1;
}
 }
