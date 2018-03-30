package Arrays;

public class WordsLengthFour {
	
	public static void main(String[] args) {
		
		String names [] ={"Erick", "Lisa", "Hose", "Roger", "Nina", "Ekaterina", "Peter", "Sara"};
		
		
		for(int i=0; i<names.length;i++) {
			
			if(names[i].length()==4) {
				
				String [] namesLengthFour= {names[i]};
				
				for(String n:namesLengthFour ) {
					
					System.out.println(n);
				}
				
			}
		}
		
		
	}

}
