package lab_4;

import java.util.Scanner;
import java.util.Arrays;

public class P1 {
	public static void main(String[] args) {
		// Create scanner
		Scanner Scan = new Scanner(System.in); 
		// Create double array
		double[] numbers = new double[3];
		
		// Scan in 10 doubles
		System.out.println("Enter 10 numbers");
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = Scan.nextDouble();
		}
//		System.out.print(Arrays.toString(find_mean));
		
		double mean = mean(numbers);
		
		System.out.printf("The mean is %.2f",mean);
		
		double standard_d = deviation(numbers, mean);
		
		System.out.printf("\nThe standard deviation is %.5f", standard_d);
		
		
		
		// Close scanner
		if (Scan != null) {Scan.close();}
		
	}
	
	public static double mean(double[] list) {
		// Declare varialbes
		double total = 0.0;
		double result = 0.0;
		int no_items = 0;
		
		for (int i=0; i<list.length; i++) {
			total = (total + list[i]);
			
		no_items = list.length;
		result = (double)(total / no_items);
		
		}
		return result;
		
	}
	

	public static double deviation(double[] list, double mean) {
		// Declare varialbes
		double total = 0.0;
		double square_x_minus_mean,x_minus_mean;
		double standard_d = 0.0;
		int no_items = list.length;
		
		System.out.print(mean);
		
		for (int i=0; i<list.length; i++) {
			x_minus_mean = list[i] - mean;
			square_x_minus_mean = Math.pow(x_minus_mean, 2);
			total = (total + square_x_minus_mean);
		}
		no_items = list.length;
		standard_d = (double)(total / (no_items -1));
		standard_d = Math.sqrt(standard_d);
		return standard_d;
	}
}
