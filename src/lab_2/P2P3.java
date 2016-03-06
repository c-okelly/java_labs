package lab_2;
import java.util.Scanner;

public class P2P3 {
	public static void main(String[] args) {
		
		//Create Scanner
		Scanner S = new Scanner(System.in);
		
		// Take inputs
		double x, y;
		System.out.printf("Please give the two cordinates \n");
		x = S.nextDouble();
		y = S.nextDouble();
		
		// Check if in rectangle
		if ( ((x >= -5) && (x <= 5)) && ( (y >= -2.5) && (y <= 2.5) ) ) {
			System.out.println("The point is within the rectagle:");
			}
		else {
			System.out.println("The point it not within the rectangle");
		}
		
		
		// Close scanner
		if (S != null) {S.close();}
	}
}
