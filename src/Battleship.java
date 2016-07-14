/**
 * Represents a battleship that could be hit during gameplay.
 *
 * Bugs: none known
 *
 * @author       Marco Sedano
 * @version      1.0
 * 
 */
import java.util.Scanner;
 public class Battleship {
 
 	private int size;
 	private int sunk;
 	private int type;
 	private int location[][];

 	// intializes the battleship with correct values based
 	// on the type of ship
 	// 5 = Aircraft carrier	Size: 5
 	// 4 = Battleship Size: 4
 	// 3 = Submarine Size: 3
 	// 2 = Destroyer Size: 3
 	// 1 = Patrol Boat Size: 2
 	public Battleship (int type) {
 		switch (type) {
 			case 5:
 				type = 5;
 				size = 5;
 				sunk = 0;
 				location = new int[5][5];
 				break;
 			case 4:
 				type = 4;
 				size = 4;
 				sunk = 0;
 				location = new int[4][4];
 				break;
			case 3:
				type = 3;
				size = 3;
				sunk = 0;
				location = new int[3][3];
				break;
			case 2:
				type = 2;
				size = 3;
				sunk = 0;
				location = new int[2][2];
				break;
			case 1:
				type = 1;
				size = 2;
				sunk = 0;
				location = new int[2][2];
				break;
			default:
				System.out.println("Invalid ship type!");
 		}//end switch
 	}//end constructor

 	// sets the location for a ship
 	// takes a column (already converted to a number) and a row
 	// checks have to be made to make sure imputed 
 	public void setShipLocation(char column, int row) {
        boolean doesExist = false;
        int adjustedColumn = 0;    
        int adjustedRow = 0;

        adjustedColumn = Gameboard.adjustColumnNumber(column);
        adjustedRow = Gameboard.adjustedRowNumber(row);

        
        ////////////////////////////////////////////
        //location[adjustedColumn][adjustedRow] = 0;
        ////////////////////////////////////////////
        ///////////THIS GIVES NULL EXCEPTION^^^^^^^/
        System.out.println("\nShip created at location " + column + "-" + row + "\n");

 	}//end method setShipLocation
 }//end class Battleship