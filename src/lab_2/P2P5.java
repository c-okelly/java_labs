package lab_2;
import java.util.Scanner;

public class P2P5 {
	public static void main(String[] args){
		
		// Create scanner
		Scanner S = new Scanner(System.in);
		
		// Get ASCII code from user
		System.out.println("Please give ASCII code to have the correct letter returned");
		int character = S.nextInt();
		
		Character conv = (char)character;
		
		//
		if (character >= 0 && character < 128)
			System.out.printf("The character for ASCII code %d is %c",character, conv);
		else 
			System.out.printf("The number givien it not wihtin range");
		
		
		// Close scanner
		if (S != null) S.close();
		
	}
}

