package lab_2;
import java.util.Scanner;

public class P2P2 {
	public static void main(String[] args) {
		
		//Create Scanner
		Scanner S = new Scanner(System.in);
		
		// Take inputs
		double a, b, c;
		System.out.printf("Please give the three side of the triangle \n");
		a = S.nextDouble();
		b = S.nextDouble();
		c = S.nextDouble();
		
//		System.out.printf("%.2f, %.2f, %.2f", a,b,c);
		
		// Calculate perimeter
		double perimiter = a + b + c;
		
		// Check if input valid
		if ( ((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			System.out.printf("The perimeter is equal to %.2f", perimiter);
		}
		else {
			System.out.println("The input was not valid");
		}
		// Output results
		
		
		// Close scanner
		if (S != null) {S.close();}
		
	}
}
