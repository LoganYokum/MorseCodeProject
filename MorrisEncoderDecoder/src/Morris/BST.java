package Morris;

public interface BST {

	/**
	 * @param String input
	 * @return char
	 *
	 *         Given input of a morris string, the move method traverses the BST
	 *         character at a time (dots/dashes) to find its relevant character to
	 *         return
	 *
	 */
	public Object move(String input);

	/**
	 * @param none
	 * @return void
	 *
	 *         Creates all nodes on the BST for Morse Code
	 *
	 */
	public void morseNodeMaker();

	/**
	 * @param none
	 * @return void
	 *
	 *         Fills all nodes on the BST with their corresponding characters for
	 *         Morse Code
	 *
	 */
	public void morseTreeFill();

}