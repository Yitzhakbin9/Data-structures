package BinarySearchTree;

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

	//***********************************************************
	//      Traverse on the tree from the root and print it  
	//***********************************************************


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

	//***********************************************************
	//  			    Adding and element 
	//***********************************************************


	/* Adding new element to the tree using recursive method:
	 * if the new node's value is lower than the current node's, we go to the left child.
	 * if the new node's value is greater than the current node's, we go to the right child.
	 * when the current node is null, we've reached a leaf node and we can insert the new 
	 * node in that position.
	source : https://www.baeldung.com/java-binary-tree
	 */	



	public void Add(double value) {
		this.size++;
		root = addRecursive(root, value);
	}

	private Node addRecursive(Node current, double value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.data) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.data) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			//			System.out.println("This node is already exists");
			return current;
		}
		return current;
	}


	//***********************************************************
	//  		Checking if element exists in the tree
	//***********************************************************

	public boolean Contains(int data) {
		return containsRecursive(root, data);
	}



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


	//***********************************************************
	//  		Checking if element exists in the tree
	//***********************************************************

	public boolean isEqual(BinaryTree t1 , BinaryTree t2) {
		return identicalTrees(t1.root , t2.root);
	}



	boolean identicalTrees(Node n1, Node n2) 
	{
		if (n1 == null && n2 == null)
			return true;

		if (n1 != null && n2 != null) 
			return (n1.data == n2.data
			&& identicalTrees(n1.left, n2.left)
			&& identicalTrees(n1.right, n2.right));

		return false;
	}
















	//	public void delete(int data) {
	//		root = deleteRecursive(root, data);
	//	}
	//
	//	// Deleting function:
	//
	//	private Node deleteRecursive(Node current, int data) {
	//		if (current == null) {
	//			return null;
	//		}
	//
	//		if (data == current.data) {
	//
	//			// Case the Node to delete is a leaf	
	//			if (current.left == null && current.right == null) {
	//				return null;
	//			}
	//			// Case the Node to delete has one child (left or right)	
	//			if (current.right == null) {
	//				return current.left;
	//			}
	//
	//			if (current.left == null) {
	//				return current.right;
	//			}
	//
	//		} 
	//
	//
	//		if (data < current.data) {
	//			current.left = deleteRecursive(current.left, data);
	//			return current;
	//		}
	//		current.right = deleteRecursive(current.right, data);
	//		return current;
	//
	//
	//		if (current.left == null && current.right == null) {
	//			return null;
	//		}
	//
	//
	//

	//***********************************************************
	//  		Checking if  the tree is balanced
	//***********************************************************

	// balanced: the depth of every two leaf differ from the root by at most one.
	// ** solution taken from Cracking the code interview book.


	public static int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public static int minDepth(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	public static boolean isBalanced(Node root){
		return (maxDepth(root) - minDepth(root) <= 1);
	}

}







