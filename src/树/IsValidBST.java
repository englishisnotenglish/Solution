package 树;

public class IsValidBST {
	public boolean isValidBST(TreeNode root) {
		return isValid(root, null, null);
	}

	public boolean isValid(TreeNode root, Integer minVal, Integer maxVal) {
		if (root == null)
			return true;
		if ((minVal == null || root.val > minVal) && (maxVal == null || root.val < maxVal)) {
			return isValid(root.left, minVal, root.val) && isValid(root.right, root.val, maxVal);
		}
		return false;
	}
}
