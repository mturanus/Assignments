package Scanner;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		

		System.out.println("Please enter degree in Fahrenheit:");
		
		
		int Fh=input.nextInt();
		
		double Cl=(Fh-32)/1.8;
			
	
		System.out.println(Fh+ " degrees in Fahrenheit is equivalent to "+Cl+" degrees in Celsius.");
			
			
	}

}
