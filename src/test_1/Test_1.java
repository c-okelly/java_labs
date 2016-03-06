package test_1;
import java.util.Scanner;

public class Test_1 {
	public static void main(String[] args) {
		
		// Create scanner
		Scanner S = new Scanner(System.in);
		
		// Select level
			// Set level string
		int user_input;
		int level = 0;
		
		while (level == 0) { 
			System.out.println("Please select a level. Either 1 for easy or 2 for hard");
			user_input = S.nextInt();
			if (user_input == 1) level = 1;
			else if (user_input == 2) level = 2;
			
			}
		
		// Genreate bound
		int bound, range_length, start_range = 0, max_range = 0, end_range =0;
		
			//Easy so bound between 10 / 50 => range is 40
		if (level == 1) {
			System.out.println("The level choice is easy");
			// length of bound
			range_length = 40;
			bound = (int)(range_length * Math.random());
//			System.out.println(bound);
			// start of range must be at least smaller then range_length
			max_range = 100 - bound;
			start_range = (int) (max_range * Math.random());
//			System.out.println(start_range);
			end_range = (start_range + bound);

			
		}

			// Hard so bound between 20 and 80 => range is 60
		else if (level == 2){
			System.out.println("The level choice is hard");
			range_length = 60;
			bound = (int)(range_length * Math.random());
//			System.out.println(bound);
			// start of range must be at least smaller then range_length
			max_range = 100 - bound;
			start_range = (int) (max_range * Math.random());
//			System.out.println(start_range);
			end_range = (start_range + bound);
			
		}
		
		// Generate random number
		int random_number,random_range,posotion_in_range;
		random_range = (end_range - start_range);
		posotion_in_range = (int)(random_range * Math.random());
		random_number = (posotion_in_range + start_range);
		
		
		// Start statement
		System.out.printf("Guess a number between %d and %d \n", start_range, end_range);
		System.out.println(random_number);
		
		int guess = S.nextInt();
		String high_low = "";
		
		while (guess != random_number) {
			if (guess > random_number) {high_low = "high";}
			else if (guess < random_number) {high_low = "low";}
			System.out.printf("The guess was too %s. Guess a number between %d and %d \n",high_low,start_range, end_range);
			guess = S.nextInt();
		}
		
		System.out.println("You have guessed correctly. The game is now over");
		
		// Close scanner
		if (S != null) S.close();
	}

}
