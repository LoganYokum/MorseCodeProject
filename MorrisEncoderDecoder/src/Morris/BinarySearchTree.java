package Morris;

public class BinarySearchTree implements BST {
	class Node {
		Object key;
		Node left, right;

		public Node() {
			key = null;
			left = right = null;
		}
	}

	public Node root = new Node();

	@Override
	public Object move(String input) {
		var string = new StringBuilder("Morse String: ");
		var curr = root;
		char c;
		for (var i = 0; i < input.length(); i++) {

			c = input.charAt(i);

			// if dots and dashes goes to a empty or non-existing node
			if (curr == null) {
				return null;
			}

			if (c == '-') {
				curr = curr.right;
			} 
			else if (c == '.') {
				curr = curr.left;
			} 
			else if (input.charAt(i) == ' '&& input.charAt(i+1) == ' ') {//bugged
				string.append(curr.key).append(" ");
//				curr = root;
			} 
			else if (c == ' ' && input.charAt(i+1) != ' ') { //bugged
				string.append(curr.key);
				curr = root;
			}
			else if (c == '/') {//bugged
				string.append(curr.key).append(".");
				curr = root;
			} 
			else {
				System.out.println("INVALID CHARACTER: " + c);
				return null;
			}
		}
			string.append(curr.key);
		return string.toString();
	}

	@Override
	public void morseNodeMaker() {
		for (var i = 0; i < 64; i++)
			root = search_Recursive(root);
	}

// recursive insert function
	Node search_Recursive(Node root) {

		if (root == null) {
			root = new Node();
			root.key = null;
			return root;
		}

		if (root.left == null) {
			root.left = new Node();
			return search_Recursive(root.left);
		} else {
			root.right = new Node();
			return search_Recursive(root.right);
		}
	}

	@Override
	public void morseTreeFill() {
// TODO Auto-generated method stub
	}

	public void morseHardNodeMaker() {
		root.left = new Node();
		root.left.left = new Node();
		root.left.left.left = new Node();
		root.left.left.left.left = new Node();
		root.left.left.left.left.left = new Node();
		root.left.left.left.left.right = new Node();
		root.left.right = new Node();
		root.left.left.left.right = new Node();
		root.left.left.left.right.right = new Node();
		root.left.left.right = new Node();
		root.left.left.right.left = new Node();
		root.left.left.right.right = new Node();
		root.left.left.right.right.right = new Node();
		root.left.right.right = new Node();
		root.left.right.right.right = new Node();
		root.left.right.right.right.right = new Node();
		root.left.right.right.left = new Node();
		root.left.right.left = new Node();
		root.left.right.left.left = new Node();
		root.left.right.left.right = new Node();
		root.left.right.left.right.left = new Node();
		root.right = new Node();
		root.right.right = new Node();
		root.right.right.right = new Node();
		root.right.right.right.right = new Node();
		root.right.right.right.right.right = new Node();
		root.right.right.right.right.left = new Node();
		root.right.right.left = new Node();
		root.right.right.left.left = new Node();
		root.right.right.left.left = new Node();
		root.right.right.left.left.left = new Node();
		root.right.right.left.right = new Node();
		root.right.left = new Node();
		root.right.left.left = new Node();
		root.right.left.left.left = new Node();
		root.right.left.left.left.left = new Node();
		root.right.left.left.left.right = new Node();
		root.right.left.left.right = new Node();
		root.right.left.left.right.left = new Node();
		root.right.left.right = new Node();
		root.right.left.right.left = new Node();
		root.right.left.right.right = new Node();
	}

	public void morseHardTreeFill() {
		root.left.key = 'e';
		root.left.left.key = 'i';
		root.left.left.left.key = 's';
		root.left.left.left.left.key = 'h';
		root.left.left.left.left.left.key = '5';
		root.left.left.left.left.right.key = '4';
		root.left.right.key = 'a';
		root.left.left.left.right.key = 'v';
		root.left.left.left.right.right.key = '3';
		root.left.left.right.key = 'u';
		root.left.left.right.left.key = 'f';
		root.left.left.right.right.right.key = '2';
		root.left.right.right.key = 'w';
		root.left.right.right.right.key = 'j';
		root.left.right.right.right.right.key = '1';
		root.left.right.right.left.key = 'p';
		root.left.right.left.key = 'r';
		root.left.right.left.left.key = 'l';
		root.left.right.left.right.left.key = '+';
		root.right.key = 't';
		root.right.right.key = 'm';
		root.right.right.right.key = 'o';
		root.right.right.right.right.right.key = '0';
		root.right.right.right.right.left.key = '9';
		root.right.right.left.key = 'g';
		root.right.right.left.left.key = 'z';
		root.right.right.left.left.key = 'z';
		root.right.right.left.left.left.key = '7';
		root.right.right.left.right.key = 'q';
		root.right.left.key = 'n';
		root.right.left.left.key = 'd';
		root.right.left.left.left.key = 'b';
		root.right.left.left.left.left.key = '6';
		root.right.left.left.left.right.key = '=';
		root.right.left.left.right.key = 'x';
		root.right.left.left.right.left.key = '/';
		root.right.left.right.key = 'k';
		root.right.left.right.left.key = 'c';
		root.right.left.right.right.key = 'y';
	}

}