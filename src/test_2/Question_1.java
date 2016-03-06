package test_2;

import java.util.Scanner;


public class Question_1 {
	public static void main(String[] args) {

		// Set varialbes
		String word, hashed_word, guess; 
		char play_game;
		
		// Create Scanner
		Scanner Scan = new Scanner(System.in);
				
		
		play_game = 'y';
		
		while (play_game == 'y' || play_game == 'Y') {
			
			
			run_game(Scan);
			// Get user input on continue game
			System.out.println("If you would like to continue the game please enter y or Y. Type anything else to exit.");
			play_game = get_user_string_input(Scan);
			
		}	
		
		System.out.println("The game has now finished");
		
		// Close scanner
		if (Scan != null) Scan.close();
		
	}
	
	public static void run_game(Scanner Scan) {
		
		String word, hashed_word,regex_remove,guess_str;
		char guess;
		int count;
		
		// Regex removal list
		regex_remove = "[a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p.q,r,s,t,u,v,w,x.y,z]";
		count = 0;
	
		
		// Generate word from predefined list and generate hashed word using regex replaceAl
		word = "jamaes"; //generate_word();
		hashed_word = word.replaceAll(regex_remove, "*");
		
		while (!word.equals(hashed_word)) {
			// Print statement start of the gamge
			System.out.printf("The word is [%s]. Please guess a letter. Guess no %d \n", hashed_word, count);
			// Take user input convert to lower case and then to string
			guess = Character.toLowerCase(get_user_string_input(Scan));
			guess_str = Character.toString(guess);
			
//			System.out.println(guess_str);
			
			// Remove guessed letter from regex search list using replaceall
			regex_remove = regex_remove.replaceAll(guess_str, "");
			
			// Regenerate hashed word based on letters that have been guessed			
			hashed_word = word.replaceAll(regex_remove, "*");
			
			// Increment count
			count += 1;
			
		}
		
		System.out.printf("Congratulations you have correclty guessed the word %s. This took %d guesses \n", word, count);
		

	}
	
	public static String generate_word() {
		
		// Create variables
		String word_to_find;
		int length, index_choice;
		// Create string array
		String[] word_choice = {"hello", "dog", "cat", "hat", "mouse", "jump", "grass", "play"}; 
		// Generate random number between 0 and length of list
		
		index_choice = (int)(word_choice.length * Math.random());
		
		return word_choice[index_choice];
		
		
	}
	
	
	public static char get_user_string_input(Scanner Scan) {
		
		// Get user input
		char user_guess;
//		System.out.println("Please enter your letter");
		user_guess = Scan.next().charAt(0);
		
		// Return user input
		return user_guess;
	}

		

}
