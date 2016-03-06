package lab_2;
import java.util.Scanner;

public class P2P7 {
	public static void main(String[] args){
		// Crate scanner
		Scanner S = new Scanner(System.in);
		
		double x = Math.random();
		System.out.println(x);
		
		String phrase;
		
		phrase = "dog"; //S.nextLine();
		
		//System.out.println(phrase.trim());
		
		// Close scanner
		if (S != null) S.close();
		
		String month = phrase;
		
		String result = phrase.substring(0, 1) + phrase.substring(1).toLowerCase();
//		System.out.println(result);
//		System.out.println(phrase.toLowerCase().indexOf("e"));
		
		// Randomly select a letter and print it out => range 97 - 122
		int point_in_range, range, multiplier;
		range = 122 - 97;
		multiplier = (int) (range * Math.random());
		System.out.println(multiplier);
		char a = (char) (multiplier + 97);
		System.out.println(a);
		
		
		
		
		
		
		
	}

}
