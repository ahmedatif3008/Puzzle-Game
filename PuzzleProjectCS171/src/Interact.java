/*Project 2 by:
 * Ahmed Chaudhry - achaud16@u.rochester.edu
 * Samuel Henderson - shende21@u.rochester.edu
 * 11/03/2021
 * Puzzle Game
 */

import java.util.Random;
import java.util.Scanner;

public class Interact extends Puzzle{
	
	public static void main(String[] args) {
	int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};//sets up an array in the solved format

	//index of 0 in the array
	int index = 0;
	
	//number of moves made by user
	int numMoves = 0;
	
	Scanner scnr = new Scanner(System.in);
	
	String difficulty;
	
	System.out.println("Enter difficulty (easy, medium or hard)");
	difficulty = scnr.nextLine();

	if(difficulty.equals("easy") || difficulty.equals("Easy"))
	index = scrambleArray(arr, index, 7); //makes 7 randomly generated moves in easy mode
	else if(difficulty.equals("medium") || difficulty.equals("Medium"))
	index = scrambleArray(arr, index, 12);//makes 12 randomly generated moves in medium mode
	else if(difficulty.equals("hard") || difficulty.equals("Hard"))
	index = scrambleArray(arr, index, 20);//makes 20 randomly generated moves in hard mode
		
		while(arrayInOrder(arr) == false)//The loop runs as long as the user does not solve the puzzle 
		{
			System.out.println("What move would you like to run: left, up, down or right? ");
			printArray(arr); //prints the layout of the puzzle at the start as well as after each move
			String moveVar = scnr.next();
		

		if (moveVar.equals("left") ||moveVar.equals("Left") || moveVar.equals("L") || moveVar.equals("l")) {//moves left
			if(index != 0 && index != 4 && index != 8 && index != 12) {//the move 'left' should not be made when 0 is in the leftmost column
				index = left(arr, index);//method to move 0 left				
			
				//the counter for the moves increments each time a move is made
				numMoves++;
		}
			else {
				System.out.println("Invalid move");
			}
			}
		else if (moveVar.equals("right") ||moveVar.equals("Right") || moveVar.equals("R") || moveVar.equals("r")) {//moves right
			if(index != 3 && index != 7 && index != 11 && index != 15) {//the move 'right' should not be made when 0 is in the rightmost column
				index = right(arr, index);//method to move 0 right
				numMoves++;
	}	
			else {
				System.out.println("Invalid move");
			}
			}
		else if (moveVar.equals("up") || moveVar.equals("Up") || moveVar.equals("U") || moveVar.equals("u")) {//moves up
			if(index != 0 && index != 1 && index != 2 && index != 3) {//the move 'up' should not be made when 0 is in the uppermost row
				index = up(arr, index);//method to move 0 up
				numMoves++;
			}
			//invalid input
			else {
				System.out.println("Invalid move");
			}

		}
		
		else if (moveVar.equals("down") ||moveVar.equals("Down") || moveVar.equals("d") || moveVar.equals("D")){ //moves down 
			if(index != 12 && index != 13 && index != 14 && index != 15) {//the move 'down' should not be made when 0 is in the lowermmost row
				index = down(arr, index);//method to move 0 down
				numMoves++;
}
			else {
				System.out.println("Invalid move");
			}
		}
		
		//message shown after incorrect input
		else {
			System.out.println("Invalid input. Please only enter: 'left', 'right', 'up' or 'down'.");
			System.out.println();
		}
	}
		//message shown after solving a puzzle
		System.out.println("Success");
		System.out.println("You solved a " + difficulty + " difficulty puzzle in " + numMoves + " moves");
		printArray(arr);
		
	}
	
	
}
