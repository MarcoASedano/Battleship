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

 public class Gameboard {

 	private static FINAL int BOARD_SIZE = 100;
 	private static FINAL int ROWS = 10;
 	private static FINAL int COLUMNS = 10;
 	private int board[COLUMNS][ROWS];

 	// initialize a game board with all of it's values equal to 0
 	// 1 means a hit
 	// 0 means empty (not touched yet)
 	// -1 means a miss
 	public Gameboard() {
 		board = {0};
 	}

 	// returns the status of space located at column x row
 	// throws exception if column/row specified are out of bounds
 	public int getStatus(int column, int row) throws Exception {
 		if (column > 10 || column < 1) && (row > 10 || row < 1) {
 			throw Exception("Your column and row entered are out of bounds!");
 		}
 		else if (column > 10 || column < 1) {
 			throw Exception("Your column is out of bounds!");
 		}
 		else if (row > 10 || row < 1) {
 			throw Exception("Your row is out of bounds!");
 		}

 		returns board[column][row];
 	}

 	// returns the associated column number (ex. A = 0, B = 1, etc)
 	// also adjusts for array indexing being 1 less
 	// public int adjustColumnNumber(String column)

 	// returns the associated row number
 	// adjusts for array indexing being 1 less
 	//public int adjustedRowNumber(int row)
 
 }