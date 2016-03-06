package lab_1;
import java.util.Scanner;

public class P1P4{
	public static void main(String[] args)
	{
		//Create scanner
		Scanner S = new Scanner(System.in);
		
		//Take input
		float input, base_population, pop_estimate, year_seconds, increase_per_year, extra_years;
		System.out.print("Please give a year that you would like a population estiamte for.\n");
		input = S.nextInt();
		
		// Calculate population increases
		base_population = 312032486;
		year_seconds = 60 * 60 * 24 * 365;
		float birth_year, death_year, imigrants;
		
		birth_year = (year_seconds / 7);
		death_year = (year_seconds / 13);
		imigrants = (year_seconds / 45);
		
		increase_per_year =  (birth_year + imigrants - death_year);
		
		// Calculate current population
		if (input > 2016){
			extra_years = input - 2016;
			pop_estimate = (extra_years * increase_per_year) + base_population;
			// Print answer
			System.out.printf("The estimated pop will be %f \n", pop_estimate);
		;}
		else {
			System.out.printf("Please enter a year in the future");
		}
	
		
		// Close scanner
		if (S != null){S.close();}
	}
	
}




/*
The U.S. Census Bureau projects population based on the following assumptions:
- One birth every 7 seconds,
- One death every 13 seconds, and
- One new immigrant every 45 seconds.
Write a program to prompt the user to enter a number of years and displays the population after this
number of years. Assume the current population is 312,032,486 and one year has 365 days
*/