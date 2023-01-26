/*Project 2 by:
 * Ahmed Chaudhry - achaud16@u.rochester.edu
 * Samuel Henderson - shende21@u.rochester.edu
 * 11/03/2021
 * Puzzle Game
 */

import java.util.Scanner;
import java.util.Random;

public class Validate extends Puzzle{

	public static void main(String[] args) {
	//index of where 0 is in array
		int index = 0;
	
	Scanner scnr = new Scanner(System.in);
		
	//num elements in array
	final int Num_Elements = 16;
	int[] arr = new int[Num_Elements];
	
	System.out.println("Enter puzzle numbers.");
	
	//get user input for numbers in array
	for (int i = 0; i < Num_Elements; ++i) {
int num = scnr.nextInt();
	
arr[i] = num;

//set index to be where 0 is
if(num == 0)
index = i;
	}
	
	 printArray(arr);
	
	
	//get user input for moves to be made
	System.out.println("Enter moves");
	String moves = scnr.next();
	
	//run moves on array
	for(int i = 0; i < moves.length(); ++i) {
		
	//move up
		if(moves.charAt(i) == 'u' || moves.charAt(i) == 'U') {
	index = up(arr, index);
		}
		//move up
	else if(moves.charAt(i) == 'd' || moves.charAt(i) == 'D') {
	index = down(arr, index);
		}
	//move up
	else if(moves.charAt(i) == 'r' || moves.charAt(i) == 'R') {
	index = right(arr, index);
		}
	//move up
	else if(moves.charAt(i) == 'l' || moves.charAt(i) == 'L') {
		index = left(arr, index);
		}
	//invalid input
	else {
			System.out.println("Invalid input. Please only enter 'u','d','r', or 'l'");
		break;
		}
		
	}
	
	//check if puzzle is solved and output appropriate message
	if (arrayInOrder(arr)) {
		System.out.println("Success! Puzzle was solved.");
	}
	else {
		System.out.println("Failed! Puzzle was not solved.");
		printArray(arr);
	}
		
	}

}
