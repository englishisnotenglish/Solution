package 树;

public class MaxDepth {
	public int maxDepth(TreeNode root) {
        // write your code here
		if(root==null)
			return 0;
		return this.iterator(root);
    }
	
	public int iterator(TreeNode root) {
		if(root == null)
			return 0;
		int ld, rd;
		ld =  iterator(root.left) + 1;
		rd =  iterator(root.right) + 1;
		return ld > rd ? ld : rd;
	}

	public static void main(String[] args) {
		MaxDepth md = new MaxDepth();
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
		System.out.println(md.maxDepth(a));
	}
}
