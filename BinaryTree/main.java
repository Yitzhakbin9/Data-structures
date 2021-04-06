package BinaryTrees;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree BT = new BinaryTree();
		
//		BT.Add(5);
		
		BT.InorderTraverse(BT.getRoot());
		for (int i = 0; i < 100; i++) {
			int rand = (int)(Math.random() * 100) + 1;
			BT.Add(rand);
		}
		
//		System.out.println("Inorder:");
//		  BT.InorderTraverse(BT.getRoot());
//		System.out.println("\nPost order:" );
//		  BT.PostorderTraverse(BT.getRoot());
//		System.out.println("\nPre order:");
//		  BT.PreorderTraverse(BT.getRoot());
		
		  
		  boolean ans = BT.Contains(15);
		  System.out.println(ans);
		  System.out.println(BT.size);
	}

}
