package test_1;
import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) {
		// Create scanner
		Scanner S = new Scanner(System.in);
		
		// Take user name
		System.out.println("Please enter your name");
		String name = S.nextLine();
		
		// Trim input and find where first space is for line break
		name = name.trim();
		int first_space = name.indexOf(" ");
		int middle_tab = name.indexOf('\t');
		
		// Set first
		
		if (first_space == -1 ) {first_space = middle_tab;}
		
		// Check user as enterd two different names
		if (first_space == -1) {
			System.out.println("The user has only entered one name. Now exiting");
		}
		else {
			String first_name, last_name;
				
			// Get and trim first name
			first_name = name.substring(0, first_space);
			first_name = first_name.trim();
			
			// Get and trim last name
			int Start_last_name = (first_space + 1);
			last_name = name.substring(Start_last_name);
			last_name = last_name.trim();
			
			System.out.printf(first_name + last_name);
			
			int check = 1;
			// Check that names are at least 1 character in length
			if (last_name.length() < 1) {check = 0;}
			else if (first_name.length() < 1) {check = 0;}
			
			// Check that only 2 names
			if (last_name.indexOf(" ") != -1) {check = 0;}
			
			
			// Give out put
			
			if (check == 1 ) {
				System.out.println("The name string passes all checks");
				System.out.printf("The name string is %s, %s \n", last_name, first_name);
			}
			else if (check == 0) {
				System.out.println("The name string does not pass all checks");
			}
		}
		
		
		// Close scanner
		if (S != null) S.close();
		
	}
}
