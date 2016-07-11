/**
 * Represent a player in the Battleship game
 *
 * Bugs: none known
 *
 * @author       Marco Sedano
 * @version      1.0
 * 
 */
import java.util.ArrayList;

public class Player {
	

	private ArrayList<Battleship> ships;
	private Gameboard myBoard;
	private int shipCount;

	public Player() {
		ships = new ArrayList<Battleship>(5);
		myBoard = new Gameboard();
		shipCount = 5;
	}

	// these methods will set the battleships based on
    // the locations inputed by the player
    // all locations should be valid already
    public void setShips(ArrayList<Battleship> ships) {

    }

    // shows your board in the terminal
    // shows your ships as well as your opponent's attempts/hits
    // 1(opp hit) shown as X
    // 0(opp no hit) shown as O
    // -1(opp miss) shown as ~
    // your ship shown as S
    public void showMyBoard(ArrayList<Battleship> ships) {

    }
}