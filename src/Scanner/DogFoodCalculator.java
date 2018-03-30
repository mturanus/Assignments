package Scanner;

import java.util.Scanner;

public class DogFoodCalculator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("What is the number of dogs?");
		
		
		int numberOfDogs=input.nextInt();
		
		System.out.println("What is the number of days?");
		
		int numberOfDays=input.nextInt();
		
		System.out.println("How many OZ of total veggies?");
		
		int veggies=input.nextInt();
		
		System.out.println("How many OZ of total wet food?");
		
		int totalWetFood=input.nextInt();
		
		System.out.println("How many OZ of total dry food?");
		
		int totalDryFood=input.nextInt();
		
		
		int wetFoodPerDay=totalWetFood/numberOfDays;
		
		int veggiesFoodPerDay=veggies/numberOfDays;
		
		int dryFoodPerDay= totalDryFood/numberOfDays;
		
		int wetFoodAverage= wetFoodPerDay/numberOfDogs;
		
		int dryFoddAverage= dryFoodPerDay/numberOfDogs;
		
		int veggiesAverage= veggiesFoodPerDay/numberOfDogs;
		
		
		System.out.println("Wet food for average dog per day = " +wetFoodAverage+" oz");
		
		System.out.println("Dry food for average dog per day = " +dryFoddAverage+" oz");
		
		System.out.println("Veggies for average dog per day = " +veggiesAverage+" oz");
		
		

	}

}
