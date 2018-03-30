package Loop;

import java.util.Scanner;

public class FibonacciNumbers {
	
	public static void main(String[] args) {
		
		
		int k, a=1, b=1; 
		
		Scanner input=new Scanner(System.in); 
		
		k=0; 
		
		System.out.println("Enter any number");
		int n=input.nextInt(); 
		System.out.print("1 1 ");
		
		while(k<=n) {
			
			k=a+b; 
			
			System.out.print(k+ " ");
			
			a=b; 
			
			b=k; 
		}
	}

}
