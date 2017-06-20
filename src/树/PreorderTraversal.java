package 树;

import java.util.ArrayList;

public class PreorderTraversal {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
		if(root == null)
			return null;
		list.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		return list;
    }
	
	public static void main(String[] args) {
		PreorderTraversal pt =  new PreorderTraversal();
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(5);
		TreeNode g = new TreeNode(6);
		a.left = b;
		a.right = c;
		c.left = e;
		c.right = f;
		f.right = g;
		System.out.println(pt.preorderTraversal(a));
	}
}
