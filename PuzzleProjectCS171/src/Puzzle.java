/*Project 2 by:
 * Ahmed Chaudhry - achaud16@u.rochester.edu
 * Samuel Henderson - shende21@u.rochester.edu
 * 11/03/2021
 * Puzzle Game
 */

import java.util.Random;
import java.util.Scanner;

public class Puzzle {
	Scanner scnr = new Scanner(System.in);
	
	//array user will be modifying
	int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	
	//index storing current position of 0 in the array
	int index = 0;
	
	//checks if array is in order
	static boolean arrayInOrder(int[] arr) {
		//possible solutions
		int[] arrSolved = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] arrSolved2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
		
		boolean inOrder = true;
 
		//compare user array to possible solutions to tell if solved
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] != arrSolved[i]) {
				inOrder = false;
			}
		}
		
		//return true if array is in order
		if(inOrder)
			return true;
		
		inOrder = true;
		
		//check user array against alternative solution
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] != arrSolved2[i]) {
				inOrder = false;
			}
		}
		
		//return true if array is in order. Otherwise, return false
	if(inOrder)
			return true;
		else 
		return false;
		
	}
	
	//prints array to screen
	static void printArray(int[] arrPrint) {
		int digitsOnLine = 0;
		
	//leave appropriate whitespace to make table appear neat
		for(int i = 0; i < arrPrint.length; ++i) {
			if(arrPrint[i] >= 10)
		System.out.print(arrPrint[i] + "  ");
			else
		System.out.print(arrPrint[i] + "   ");
	
	digitsOnLine++;
	
	//line break if 4 digits currently on line
	if(digitsOnLine >= 4) {
		System.out.println();
		digitsOnLine = 0;
	}
}
System.out.println();
}
	
	//moves 0 left
	static int left(int[] arr, int index) {
		int temp = arr[index];
	
		//invalid move
		if(index == 0 || index == 4 || index == 8 || index == 12) {
		return index;
		}
		//valid move
	else {
			arr[index] = arr[index - 1];
			arr[index - 1] = temp;
			
			//return new index of where 0 is in array
			return index - 1;	
		}
	}
	
	//moves 0 right
static int right(int[] arr, int index) {
		int temp = arr[index];
		
		//invalid move
	if(index == 3 || index == 7 || index == 11 || index == 15) {
		return index;
		}
	//valid move
else {
			arr[index] = arr[index + 1];
			arr[index + 1] = temp;
		
			return index + 1;	
		}
	}
	
//moves 0 up
static int up(int[] arr, int index) {
		int temp = arr[index];
		
		
		//invalid move
	if(index == 0 || index == 1 || index == 2 || index == 3) {
		return index;
		}
	//valid move
else {
			arr[index] = arr[index - 4];
			arr[index - 4] = temp;
			
			return index - 4;	
		}
}
	
//moves 0 down
static int down(int[] arr, int index) {	
	//invalid move
if(index == 12 || index == 13 || index == 14 || index == 15) {
		return index;
		}
//valid move
		else {
			int temp = arr[index];
arr[index] = arr[index + 4];
			arr[index + 4] = temp;
		
			return index + 4;	
		}
	}

	

	//scrambles array for interactive mode
		static int scrambleArray(int[] arr, int index, int numMoves) {
			Random rand = new Random();

		//stores whether random move is possible
			boolean possible = false;
		
			//random number generated that will be equated to a move direction
			int num = 0;
			
			for(int i = 0; i < numMoves; ++i) {
				possible = false;

				//keep running until a valid move is found
				while(possible == false) {
					 num = rand.nextInt(4);

					//move left
				if(num == 0) {
					//move impossible
				if(index == 0 || index == 4 || index == 8 || index == 12) {
					possible = false;
					
				}
				//move possible
				else {
					possible = true;
					index = left(arr, index);	
		}
				}
				//move right
				else if (num == 1) {
					//move impossible
					if(index == 3 || index == 7 || index == 11 || index == 15) {
						possible = false;
					}
					//move possible
					else {
						possible = true;
			index = right(arr, index);	
					}
					}
				//move up
				else if (num == 2) {
					//move impossible
					if(index == 0 || index == 1 || index == 2 || index == 3) {
						possible = false;
					}
					//move possible
					else {
						possible = true;
						index = up(arr, index);	
					}
					}
				//move down
				else if (num == 3) {
					//move impossible
					if(index == 12 || index == 13 || index == 14 || index == 15) {
						possible = false;
					}
					//move possible
					else {
						possible = true;
		index = down(arr, index);	
					}
					}
			}
						
			}
			
			return index;
		}
	
}


