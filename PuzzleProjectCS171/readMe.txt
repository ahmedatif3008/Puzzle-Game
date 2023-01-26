Project completed by:
Ahmed Chaudhry  - achaud16@u.rochester.edu
Samuel Henderson - shende21@u.rochester.edu

--------------------------------
We created 3 classes - 'Puzzle' which contains methods used by the other two classes such as 
scrambling an array. There is also the class 'Validate' which runs code to collect the required info 
and validates whether the inputed solution works or not. The class 'Interact' runs the 
interactive mode which allows the user to try to solve a random puzzle. 

--------------------------------
Here is how each class works:
Validate.java:
This class extends Puzzle.java.
First it asks the number input from the user, then gets the input of which moves
the user wants to make. After performing the entered moves on the puzzle, the method 'arrayInOrder' 
is called to verify if the array is in the correct order, and the corresponding result is 
displayed to the user. 
Invalid moves are ignored

--------------------------------
Interact.java:
We decided the following for difficulty levels:
easy - 7 moves to scramble
medium - 12 moves to scramble
hard - 20 moves to scramble

First, the program reads input for the difficulty level, accepting either 'easy', 'medium', or 
'hard'. Then the user enters moves, one at a time, until the puzzle is solved. Enter ‘left’, ‘right’, ‘up’, or ‘down’ to move. The program also accepts moves to be entered as a letter, e.g. ‘D’ for down.
The number of moves is counted and displayed to the user upon puzzle completion. 
If the user enters an invalid move, they are informed of this and the move is ignored. 

--------------------------------
Puzzle.java:
This class contains methods such as printArray that are used by both Interact and Validate. 
For example, the method arrayInOrder compares the user's array to predefined correct solutions 
to decide if the puzzle is solved or not.If solved, it returns true. 
The methods for moves up, left, right and down check if the move is possible. The index of 
zero in the array is returned so the caller method knows the updated index of the zero. 
--------------------------------

This is how we split up the work:
Ahmed:
The whole of the Interact class. 
From the Puzzle file:
Methods for moving left, right, up, down.
printArray method

Samuel:
The whole of the Validate file.
From the Puzzle file:
scrambleArray method
arrayInOrder method
