/*
 * Author: Brittanie Pham
 */
package module2Test;

/**
 * public class named Puzzle that implements the interface Solvable
 * @author Brittanie Pham
 *
 */
public abstract class Puzzle implements Solvable {

	/**
	 * Overridden solve method from the interface Solvable that prints what puzzle it is solving
	 */
	@Override
	public void solve() {
		System.out.println("Solving the " + getClass().getSimpleName() + " puzzle");
	}

}
