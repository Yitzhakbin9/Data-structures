package BinaryTrees;

public class BinaryTree {


	Node root;
	int size;

	//	public BinaryTree(int data) {
	//		this.root = new Node(data);
	//		this.size = 1;
	//	}

	// Empty constructor
	public BinaryTree() {
		this.root = null;
		this.size = 0;
	}





	public Node getRoot() {
		return root;
	}

	public int getSize() {
		return size;
	}


	// Traverse on the tree from the root and print it:


	// Preorder Traverse : parent , left , right
	public void PreorderTraverse(Node root) {
		if (root != null) {
			System.out.print(root.data + " -> ");
			PreorderTraverse(root.left); 
			PreorderTraverse(root.right); 
		}
	}

	// Inorder Traverse: left , parent , right
	public void InorderTraverse(Node root) {
		if (root != null) {
			InorderTraverse(root.left);
			System.out.print(root.data + " -> ");
			InorderTraverse(root.right);

		}
	}

	// Postorder Traverse : left , right , parent
	public void PostorderTraverse(Node root) {
		if (root != null) {
			PostorderTraverse (root.left);
			PostorderTraverse (root.right);
			System.out.print(root.data + " -> ");

		}
	}


	/* Adding new element to the tree using recursive method:
	 * if the new node's value is lower than the current node's, we go to the left child
	 * if the new node's value is greater than the current node's, we go to the right child
	 * when the current node is null, we've reached a leaf node and we can insert the new node in that position
	source : https://www.baeldung.com/java-binary-tree
	 */	



	public void Add(int value) {
		this.size++;
		root = addRecursive(root, value);
	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.data) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.data) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public boolean Contains(int data) {
		return containsRecursive(root, data);
	}

	
// Check if the tree contains specific item:
	
	private boolean containsRecursive(Node current, int data) {
		if (current == null) {
			return false;
		} 
		if (data == current.data) {
			return true;
		} 

		if (data < current.data) {
			return containsRecursive(current.left , data);
		}
		else return containsRecursive(current.right , data);

	}
}

	
