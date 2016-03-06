// Author: Conor O'Kelly

package test_2;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		// Open Scanner
		Scanner Scan = new Scanner(System.in);
		
		// Declare variables
		int no_balls, no_slots, random_path_length;
		String path;
		
		// Run simulation
		System.out.print("Enter the number of balls to drop: ");
		no_balls = Scan.nextInt();
		System.out.print("Enter the number of slots you would like to use. (Minimum 2): ");
		no_slots = Scan.nextInt();
		
		random_path_length = no_slots - 1;
		
		// Craete array to hold all paths
		String[] path_collection = new String[no_balls];
		
		// Create array to hold results
		int[] results = new int[no_slots];
		
		for (int i=0; i < no_balls; i++) {
			path_collection[i] = generate_random_path(no_slots, results);
		}
		
		
//		Didn't read assignment properly. This methods where build into gerenate_random_path()
		// Generate the required number of paths
//		create_list_paths(no_balls,random_path_length,path_collection);
//		
//		
////		System.out.println(Arrays.toString(path_collection));
//
//		
//		// Generate the results from path arrays and update the results array
//		create_int_array_results(no_balls, no_slots, path_collection,results);
		
		// Output results
		System.out.println("\nPaths");
		for (int i=0; i< path_collection.length; i++) {
			System.out.println(path_collection[i]);
		}
		 
		System.out.printf("\nNumber of ball in each slot:\n");
		System.out.println(Arrays.toString(results));
		
		// Close Scanner
		if (Scan != null) Scan.close();
		
	}

	public static String choose_path(int size_path) {
		// Create variables
		String path = "";
		int multipier, choice;
		
		// Gerenate random selection of r and l depending on required length of string
		for (int i=1; i<= size_path; i++) {
			multipier = 2;
			choice = (int)(Math.random() * multipier);
//			System.out.print(choice);
			
			if (choice == 0) {
				path += "r";
			}
			else if (choice == 1){
				path += "l";
			}
		}
		
		return path;
	}
	
	
	public static String generate_random_path(int no_slots, int[] results){
		String path;
		int ball_position;
		char current_letter;
		
		path = choose_path(no_slots);
		
		//Current ball posotion
		ball_position = 0;
//		System.out.println(paths[i]);
		
		// Iterate through items in string
		// Finish at number of slots -1 
		for (int k=0; k < (no_slots - 1); k++) {
			current_letter = path.charAt(k);
			// Check if letter is r or l. If r increase index by 1.
			if (current_letter == 'r') {
				ball_position += 1;
			}
		}
		// Increase slot in index depending where ball ended up
		results[ball_position] += 1;
//		System.out.println(ball_position);
		
		return path;
	}
	
//	public static void create_list_paths(int no_balls, int random_path_length, String[] path_collection) {
//		for (int i=0; i< no_balls; i++) {
//			path_collection[i] = choose_path(random_path_length);
//		}
//		
//		
//	}
//	
//	public static void create_int_array_results(int no_balls, int no_slots, String[] paths,int[] results) {
////		int[] result = new int[no_slots];
//		int ball_position, letter_count;
//		String current_item;
//		char current_letter;
//		
////		System.out.println(Arrays.toString(result));
//		
//		// Iterate first string in path_collection
//		for (int i=0; i < (no_balls); i++) {
//			ball_position = 0;
////			System.out.println(paths[i]);
//			
//			// Iterate through items in string
//			// Finish at number of slots -1 
//			for (int k=0; k < (no_slots - 1); k++) {
//				current_item = paths[i];
//				current_letter = current_item.charAt(k);
//				// Check if letter is r or l. If r increase index by 1.
//				if (current_letter == 'r') {
//					ball_position += 1;
//				}
//			}
//			// Increase slot in index depending where ball ended up
//			results[ball_position] += 1;
////			System.out.println(ball_position);
//		}
//		
////		System.out.print(Arrays.toString(result));
//
//	} 
}
