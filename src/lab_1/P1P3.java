package lab_1;
import java.util.Scanner;

public class P1P3 {
	public static void main(String[] args)
	{
		// Create scanner
		Scanner S = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Please give an integer between 0 and 999");
		
		
		// Take in int
		int input = S.nextInt();
		
		// Check that input is between 0 and 999
		if (input >= 0 && input <= 999){
			for(int i=1; i<=input; i++){
				sum += i;
			}
			System.out.printf("The sum is %d", sum);	
		}
		else{
			System.out.println("The number entered is not within the desierd range");
		}
		
		if (S != null){S.close();}
		
		
	}
}