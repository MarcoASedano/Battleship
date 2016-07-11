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
        boolean columnValid = false;
        boolean rowValid = false;
        boolean doesExist = false;
        int adjustedColumn = 0;    
        int adjustedRow = 0;
        int counter = 0;
        
        try {
            //try to set ship column
            char columnToUpper = Character.toUpperCase(column);
            if(columnToUpper >= 'A' && columnToUpper <= 'J') {
                System.out.println("Column is Valid!");
                for(char letter = 'A'; letter <= 'J'; letter++) {
                    if(columnToUpper == letter) {
                        adjustedColumn = counter;
                        break;
                    }//end if
                    else {
                        counter++;
                    }//end else
                }//end for loop
                rowValid = true;
            }//end if
            else {
                while(columnValid == false) {
                    //prompt user for new column
                    System.out.println("Column not recognized! Please enter a "+
                                       "letter between A and J");
                    Scanner userInput = new Scanner(System.in);
                    char newInput = userInput.next().charAt(0);

                    //re-evaluate input
                    columnToUpper = Character.toUpperCase(newInput);
                    if(columnToUpper >= 'A' && columnToUpper <= 'J') {
                        System.out.println("Column is Valid");
                        for(char letter = 'A'; letter <= 'J'; letter++) {
                            if(columnToUpper == letter) {
                                adjustedColumn = counter;
                                break;
                            }//end if
                            else {
                                counter++;
                            }//end else
                        }//end for loop
                        columnValid = true;
                    }//end if
                }//end while
            }//end else

            //try to set ship row
            adjustedRow = row - 1;
            if(adjustedRow >= 0 && adjustedRow <= 9) {
                System.out.println("Row is Valid!");
                rowValid = true;
            }//end if   
            else
            {
                while(rowValid == false)
                {
                    //prompt user for new row
                    System.out.println("Row not recognized! Please enter a "+
                                       "number between 1 and 10");
                    Scanner userInput = new Scanner(System.in);
                    int newInput = userInput.nextInt();

                    //re-validate input
                    adjustedRow = newInput - 1;
                    if(adjustedRow >= 0 && adjustedRow <= 9) {
                        System.out.println("Row is Valid!");
                        rowValid = true;
                    }//end if   
                }//end while
            }//end else

            location[adjustedColumn][adjustedRow] = 0;
            System.out.println("Ship created at location " + column + "-" + row);
        }//end try
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException Caught!");
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException Caught");
        }
 	}//end method setShipLocation
 }//end class Battleship