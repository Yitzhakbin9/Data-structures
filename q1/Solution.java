package q1;


public class Solution {
	public boolean isValidBST(TreeNode root) {
		if (root != null)  {
		isValidBST(root.left);
		if(root.left == null && root.right == null) return true;
		if(root.left == null && root.right.val < root.val) return false;
		if(root.right == null && root.left.val > root.val) return false;
		if(root.left.val >= root.val  ||  root.right.val <= root.val) return false;
		
		isValidBST(root.right);
		}
		return true;

	}
}
