/**
 * Represents the board that the battleships will be placed on,
 * as well as tracking the hits/misses for each player
 *
 * A Standard board has columns from A-J, and Rows numbered from 1-10
 * The total size of the board is 10x10, or 100 squares
 *
 * @author       Marco Sedano
 * @version      1.0
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

 public class Gameboard {

 	private static final int BOARD_SIZE = 100;
 	private static final int ROWS = 10;
 	private static final int COLUMNS = 10;
 	private int board[][];


 	// initialize a game board with all of it's values equal to 0
 	// 1 means a hit
 	// 0 means empty (not touched yet)
 	// -1 means a miss
 	public Gameboard() {
 		board = new int[COLUMNS][ROWS];

 		for (int i = 0; i < COLUMNS; i++) {
 			for (int j = 0; j < ROWS; j++) {
 				board[i][j] = 0;
 			}
 		}
 	}

 	// returns the status of space located at column x row
 	// throws exception if column/row specified are out of bounds
 	public int getStatus(int column, int row) throws Exception {
 		if ((column > 10 || column < 1) && (row > 10 || row < 1)) {
 			throw new Exception("Your column and row entered are out of bounds!");
 		}
 		else if ((column > 10 || column < 1)) {
 			throw new Exception("Your column is out of bounds!");
 		}
 		else if ((row > 10 || row < 1)) {
 			throw new Exception("Your row is out of bounds!");
 		}

 		return board[column][row];
 	}

 	// returns the associated column number (ex. A = 0, B = 1, etc)
 	// also adjusts for array indexing being 1 less
 	public static int adjustColumnNumber(char column) {
        char columnToUpper = Character.toUpperCase(column);
        int adjustedColumn = 0;
        int counter = 0;
        boolean isValid = false;
        
        //if column is valid, loop through characters and use
        //counter to set adjusted value
        //otherwise, keep prompting for new input until valid
        if(columnToUpper >= 'A' && columnToUpper <= 'J') {
            for(char letter = 'A'; letter <= 'J'; letter++) {
                if(columnToUpper == letter) {
                    adjustedColumn = counter;
                    break;
                }//end if
                else {
                    counter++;
                }//end else
            }//end for
        }//end if
        else {
            while(isValid == false)
            {
                System.out.println("Column not recognized!"+
                               "Please Enter a letter between A and J");
                Scanner userInput = new Scanner(System.in);
                char newInput = userInput.next(".").charAt(0);
                columnToUpper = Character.toUpperCase(newInput);

                if(columnToUpper >= 'A' && columnToUpper <= 'J') {
                    for(char letter = 'A'; letter <= 'J'; letter++) {
                        if(columnToUpper == letter) {
                            adjustedColumn = counter;
                            isValid = true;
                        }//end if
                        else {
                            counter++;
                        }//end else
                    }//end for
                }//end if
            }//end while
        }//end else
        return adjustedColumn;
    }//end method adjustColumnNumber

 	// returns the associated row number
 	// adjusts for array indexing being 1 less
 	public static int adjustedRowNumber(int row) {
        boolean isValid = false;
        int adjustedRow = 0; 
        
        adjustedRow = row - 1;
        
        //if adjustedRow is out of bounds, keep prompting
        //until row is valid
        if((adjustedRow >= 0 && adjustedRow <= 9) == false) {
            while(isValid == false) {
                System.out.println("Row not recognized!\n"+
                               "Please enter a number between 1 and 10");
                Scanner userInput = new Scanner(System.in);
                int newInput = userInput.nextInt();
                adjustedRow = newInput - 1;

                if(adjustedRow >=0 && adjustedRow <= 9 ) {
                    isValid = true;
                }//end if
            }//end while    
        }//end if
        return adjustedRow;
    }//end method adjustedRowNumber
    
    //updates board in terminal
    //1(hit) shown as X
    //0(not hit) shown as O
    //-1(miss) shown as ~
    public void showBoard() {
        System.out.println("\tA \tB \tC \tD \tE \tF \t G \tH \tI \tJ");
        System.out.println();
        
        for(int x = 0; x < ROWS; x++) {
            System.out.print((x + 1)+"");
            for(int y = 0; y < COLUMNS; y++) {
                if(board[x][y] == 1) {
                    System.out.print("\t" + "X");    
                }
                else if(board[x][y] == 0) {
                    System.out.print("\t" + "O");
                }
                else if(board[x][y] == -1) {
                    System.out.print("\t" + "~");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

 }