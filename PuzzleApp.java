/*
 * Author: Brittanie Pham
 */
package module2Test;

import java.util.ArrayList;

/**
 * public class that is named PuzzleApp
 * that runs the main method
 * @author taylorwu
 *
 */
public class PuzzleApp {
	/**
	 * main method to run the app
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * puzzles is an ArrayList of type Puzzle
		 */
		ArrayList<Puzzle> puzzles = new ArrayList<Puzzle>();
		
		RubiksCube cube2x2 = new RubiksCube();
		RubiksCube cube3x3 = new RubiksCube();
		RubiksCube cube4x4 = new RubiksCube();
		RubiksCube cube5x5 = new RubiksCube();
		
		Pyramid pyramida = new Pyramid();
		Pyramid pyramidb = new Pyramid();
		Pyramid pyramidc = new Pyramid();
		Pyramid pyramidd = new Pyramid();
		
		puzzles.add(cube2x2);
		puzzles.add(cube3x3);
		puzzles.add(cube4x4);
		puzzles.add(cube5x5);
		
		puzzles.add(pyramida);
		puzzles.add(pyramidb);
		puzzles.add(pyramidc);
		puzzles.add(pyramidd);
		
		for(Puzzle p : puzzles) {
			p.solve();
			if(p instanceof Pyramid) {
				((Pyramid) p).skill();
			}
			System.out.println();
		}
	}
}
