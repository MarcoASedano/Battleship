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
import java.util.Random;

public class BattleshipGame {
	public static void main(String[] args) {
		System.out.println("Lets play some Battleship!");

        //TEST CODE>>>>DELETE THIS WHEN DONE
        //
        //
        
        Gameboard newBoard = new Gameboard();
        newBoard.showBoard();
        
        System.out.println("\nCreating ship1");
        Battleship ship1 = new Battleship(3);
        ship1.setShipLocation('C', 3);
        
        System.out.println("\nCreating ship2");
        Battleship ship2 = new Battleship(50);
        ship2.setShipLocation('X', 22);
        //
        //
        //////////////////////////////////////     
        
	}//end method main
}//end class BattleshipGame