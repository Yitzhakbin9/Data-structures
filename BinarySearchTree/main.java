package BinarySearchTree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// ****  Testing the functions  ****
		
		BinaryTree BT1 = new BinaryTree();		

		BinaryTree BT2 = new BinaryTree();		

// Add function
//		for (int i = 0; i < 10; i++) {
//		
		BT1.Add(3);
		BT1.Add(2);
		BT1.Add(1);
		
		BT2.Add(1);
		BT2.Add(2);
		BT2.Add(3);
		

		boolean ans = BT1.isEqual(BT1, BT2);
		System.out.println(ans);
		
		//		int rand = (int)(Math.random() * 10) + 1;
//			BT.Add(rand);
//		}
	
// Traverse functions
//		System.out.println("Inorder:");
//		  BT.InorderTraverse(BT.getRoot());
//		System.out.println("\nPost order:" );
//		  BT.PostorderTraverse(BT.getRoot());
//		System.out.println("\nPre order:");
//		  BT.PreorderTraverse(BT.getRoot());
//		System.out.println();
//		  
// Contains
//		  int contain = 15;
//		  boolean ans = BT.Contains(contain);
//		  if(ans == true) System.out.println("The tree contains " + contain);
//		  else System.out.println("The tree does't contains " + contain);
	
// Size , root , balanced 
	
//		  System.out.println("Tree size : " + BT.getSize());
//		  System.out.println("The root of the tree is : " + BT.root.data);
//		  System.out.println("Is the tree balanced? : " + BT.isBalanced(BT.getRoot()));

		  
		
		
		
		
	}

}
