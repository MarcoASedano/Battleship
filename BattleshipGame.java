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

public class BattleshipGame.java 
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
	public static void initBoard()
	{
		//size of board
		final int ROWS = 5;
		final int COLUMNS = 5;

		int board[][] = new int[ROWS][COLUMNS];
	}//end method initBoard
}//end class BattleshipGame