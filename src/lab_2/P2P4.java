package lab_2;
import java.util.Scanner;

public class P2P4 {
	public static void main(String[] args) {
		
		//Create Scanner
		Scanner S = new Scanner(System.in);
		
		// Take inputs
		double r, area, side, divider;
		System.out.printf("Please give the radius \n");
		r = S.nextDouble();
		
		// Calculate area
		divider = (Math.PI/5); 
		side = 2 * r * Math.sin((divider));
//		System.out.println(side);
		area = (5 * (side * side)) / (4 * (Math.tan((divider))));
		
		// Check if in rectangle
		if (r > 0 ) {
			System.out.printf("The area is %.2f", area);
			}
		else {
			System.out.println("The radius is negative or 0");
		}
		
		
		// Close scanner
		if (S != null) {S.close();}
		
	}
}
