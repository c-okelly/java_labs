package lab_2;
import java.util.Scanner;

// Program to find the square root of a quadratic

public class P2P1 {
	public static void main(String[] args) {
	
		// Create Scanner
		Scanner S = new Scanner(System.in);
		
		// Declare variables as floats
		float a, b, c;
		
		// Take input
		System.out.printf("Please give the three number a, b and c \n");
		a = S.nextFloat();
		b = S.nextFloat();
		c = S.nextFloat();
		
//		System.out.printf("%.2f, %.2f, %.2f", a, b, c);
		
		// Generate results
		double r1, r2, root, discriminant;
		
		discriminant = ((b*b) - (4*a*c));
		root = Math.sqrt(discriminant);
//		System.out.println(discriminant);
		r1 = ((-b)+(root))/(2*a);
		r2 = ((-b)-(root))/(2*a);
		
		// Loop to choose result to print out
		
		if (discriminant > 0) {
			System.out.printf("The roots are %.2f, %.2f", r1, r2);
		}
		else if (discriminant == 0) {
			System.out.printf("The root is %.2f", r1);
		}
		else if (discriminant < 0) {
			System.out.printf("The are no real roots");
		}
		
		// Close scanner
		
		if (S != null){S.close();}
		
	}

}
