package 树;

public class IsBalanced {
	public boolean isBalanced(TreeNode root) {
        // write your code here
		if(root == null)
			return true;
		int i = iterator(root);
		return i == -100 ? false : true;
    }
	
	public int iterator(TreeNode root) {
		if(root == null)
			return 0;
		int ld, rd;
		int left = iterator(root.left),
			right = iterator(root.right);
		if(left != -100)
			ld =  left+ 1;
		else 
			return -100;
		if(right != -100)
			rd =  right+ 1;
		else 
			return -100;
		if(Math.abs(ld - rd)> 1)
			return -100;
		return ld > rd ? ld : rd;
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(20);
		TreeNode c = new TreeNode(15);
		TreeNode e = new TreeNode(7);
//		TreeNode f = new TreeNode(5);
//		TreeNode g = new TreeNode(6);
		a.right = b;
		b.left = c;
		b.right = e;
//		f.right = g;
		IsBalanced ib = new IsBalanced();
		System.out.println(ib.isBalanced(a));
	}
}
