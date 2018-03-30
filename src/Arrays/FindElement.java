package Arrays;

import java.util.*;

public class FindElement {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter color");
		
		String color=input.nextLine();
	
	
	String[] colors = {"red", "Blue", "Black", "Green", "Brown" } ; 
	
	
	for(int i=0; i<colors.length; i++) {
		
		
		if(!color.equalsIgnoreCase(colors[i].toString())) {
			
			System.out.println(-1);
			continue;
		
		}else if(color.equalsIgnoreCase(colors[i].toString())) {
			
			System.out.println(i);
			
			break;
		
		}
		
		
		
	}
}
}
