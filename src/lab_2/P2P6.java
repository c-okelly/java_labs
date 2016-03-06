package lab_2;
import java.util.Scanner;

public class P2P6 {
	public static void main(String[] args){
		
		// Create scanner
		Scanner S = new Scanner(System.in);
		
		// Capture character
		System.out.println("Please give the system a character");
		Character c = S.nextLine().charAt(0);
		int conveted = (int) c;
		
		if (conveted < 90 && conveted > 65) {
			System.out.println("The character is a capital letter");
		}
		else {
			System.out.println("The charater not a capital letter");
		}
		
		
		// Close scanner
		if (S != null) S.close();
		
	}

}
