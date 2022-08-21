package Morris;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		var t = new BinarySearchTree();
		t.morseHardNodeMaker();
		t.morseHardTreeFill();

		final var in = new Scanner(System.in);
		final var out = System.out;
		{

			var done = false;
			while (!done) {
				var text = in.nextLine();
				if (text.equalsIgnoreCase("exit")) {
					break;
				}
				var morseOut = t.move(text);
				if (morseOut == null) {
					out.println("NOT A VALID MORSE CODE INPUT. TYPE *exit* to close the application or try again.");
				} else {
					out.println(">> " + morseOut);
				}
			}
		}
		in.close();

	}

}