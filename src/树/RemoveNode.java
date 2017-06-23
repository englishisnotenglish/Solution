package 树;

public class RemoveNode {
	public TreeNode removeNode(TreeNode root, int value) {
        // write your code here
		if (root == null){
            return null;
        }
        if (root.val == value){//当前节点值等于value值
            if (root.left == null && root.right == null){//当前节点没有左右孩子节点
                root = null;
            } else if (root.left == null){//当前节点只有右孩子节点
                root = root.right;
            } else if (root.right == null){//当前节点只有左孩子节点
                root = root.left;
            } else {//当前节点有左右孩子节点
                TreeNode tmp = root;
                tmp = tmp.left;
                while(tmp.right != null){
                    tmp = tmp.right;
                }
                root.val = tmp.val;
                root.left = removeNode(root.left,root.val);
            }
        } else if (value < root.val){//当前节点值大于value
            if (root.left == null){
                return root;
            }
            root.left = removeNode(root.left, value);
        } else {//当前节点值小于value
            if (root.right == null){
                return root;
            }
            root.right = removeNode(root.right,value);
        }
        return root;
    }
	
}
