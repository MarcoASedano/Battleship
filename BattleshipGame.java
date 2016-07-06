///////////////////////////////////////////////////////////////////////////////
//                   
// Main Class File:  BattleshipGame.java
//
// Main class used to run and start the Battleship game.
// 
//
// Author:           Marco Sedano
//
// Last Date Modified: 07/02/2016
//
///////////////////////////////////////////////////////////////////////////////
import javax.swing.*;
import java.util.Random;

public class BattleshipGame 
{
	public static void main(String[] args) 
	{
		System.out.println("Lets play some Battleship!");
		JOptionPane.showMessageDialog(
			null, 
			"I Want to play a game...", 
			"Lets Begin",
			JOptionPane.PLAIN_MESSAGE);
		initBoard();

	}//end method main

	//initialize playing field as 5x5 board
    //value of -1 represents no shot 
    //value of 0 represents position shot and no ship
    //value of 1 represents position shot and ship hit
	public static int[][] initBoard()
	{
		//size of board
		final int ROWS = 5;
		final int COLUMNS = 5;

        //create 5x5 board
		int board[][] = new int[ROWS][COLUMNS];
        
        //iterate through board array
        for(int x = 0; x < ROWS; x++)
        {
            for(int y = 0; y < COLUMNS; y++)
            {
                //initialize all values to -1
                board[x][y] = -1;
            }//end for loop
        }//end for loop
        
        return board;
	}//end method initBoard
}//end class BattleshipGame