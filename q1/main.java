package q1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TreeNode tr1 = new TreeNode(2);
		TreeNode tr2 = new TreeNode(1);
		TreeNode tr3 = new TreeNode(1);

		TreeNode tr1 = new TreeNode(1 , tr2 , tr3);
		
		System.out.println(isValidBST(tr1));
		
	}
	public static boolean isValidBST(TreeNode root) {
		boolean ans = true;
		if (root != null)  {
		ans = isValidBST(root.left); //t
		if(root.left == null && root.right == null) ans = true;
		else if(root.left == null && root.right.val < root.val) return false;
		else if(root.right == null && root.left.val > root.val) return false;
		else if(root.left.val >= root.val  ||  root.right.val <= root.val) return false;
		ans = isValidBST(root.right);
		}
		return ans;

	}
}
