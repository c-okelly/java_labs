package test_1;
import java.util.Scanner;

public class Tests {
	public static void main(String[] args) {
		
		// Create Scanner
		Scanner S = new Scanner(System.in);
		
		// Take user input and compare
		
		boolean mode_choosen = false;
		
		
		while (mode_choosen == false) {
			System.out.println("Plase give the mode you would like to run in");
			String user_in = S.next();
			if (user_in.equals("easy")||user_in.equals("hard")){ mode_choosen = true;}
//			else if (user_in.equals("hard")){ mode_choosen = true;}
		}
		
		System.out.println("Success");
		
		
	}
}
