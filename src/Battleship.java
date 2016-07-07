/**
 * Represents a battleship that could be hit during gameplay.
 *
 * Bugs: none known
 *
 * @author       Marco Sedano
 * @version      1.0
 * 
 */

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
 				break;
 			case 4:
 				type = 4;
 				size = 4;
 				sunk = 0;
 				break;
			case 3:
				type = 3;
				size = 3;
				sunk = 0;
				break;
			case 2:
				type = 2;
				size = 3;
				sunk = 0;
				break;
			case 1:
				type = 1;
				size = 2;
				sunk = 0;
				break;
			default:
				System.out.println("Invalid ship type!");
 		}
 	}

 }