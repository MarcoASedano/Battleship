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

public class BattleshipGame {
	public static void main(String[] args) {
		System.out.println("Lets play some Battleship!");
		JOptionPane.showMessageDialog(
			null, 
			"I Want to play a game...", 
			"Lets Begin",
			JOptionPane.PLAIN_MESSAGE);
        
        //TEST CODE>>>>DELETE THIS WHEN DONE
        //
        //
        Gameboard newBoard = new Gameboard();
        newBoard.showBoard();
        //
        //
        //////////////////////////////////////
        
        
	}//end method main
}//end class BattleshipGame