package 树;

public class InsertNode {
	public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
		if(root == null)
			return root = node;
		iterator(root, root, node, 0);
		return root;
    }
	
	public void iterator(TreeNode pre, TreeNode root, TreeNode node, int dir) {
		if(root == null){
			if(dir == 0){
				pre.left = node;
				return;
			}else {
				pre.right = node;
				return;
			}
		}
			
		if(node.val > root.val)
			iterator(root, root.right, node, 1);
		else
			iterator(root, root.left, node, 0);
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(2);
		TreeNode b = new TreeNode(1);
		TreeNode c = new TreeNode(3);
//		TreeNode e = new TreeNode(4);
//		TreeNode f = new TreeNode(5);
//		TreeNode g = new TreeNode(6);
		a.left = b;
		InsertNode node = new InsertNode();
		System.out.println(node.insertNode(a, c).right.val);
	}
}
