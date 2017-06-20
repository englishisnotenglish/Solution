package 树;

import java.util.ArrayList;

public class LevelOrder {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        
        if (root == null) {
            return results;
        }
        
        int maxLevel = 0;
        while (true) {
            ArrayList<Integer> level = new ArrayList<Integer>();
            iterator(root, level, 0, maxLevel);
            if (level.size() == 0) {
                break;
            }
            
            results.add(level);
            maxLevel++;
        }
        
        return results;
    }
    
    private void iterator(TreeNode root,
                     ArrayList<Integer> level,
                     int curtLevel,
                     int maxLevel) {
        if (root == null || curtLevel > maxLevel) {
            return;
        }
        
        if (curtLevel == maxLevel) {
            level.add(root.val);
            return;
        }
        
        iterator(root.left, level, curtLevel + 1, maxLevel);
        iterator(root.right, level, curtLevel + 1, maxLevel);
    }

	
	public static void main(String[] args) {
		LevelOrder lo = new LevelOrder();
		System.out.println(lo.levelOrder(null));
	}
}
