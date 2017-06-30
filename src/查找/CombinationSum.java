package 查找;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CombinationSum {
	private HashMap<String, Boolean> map = new HashMap<String, Boolean>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
		int temp;
		for (int i = 0; i < candidates.length - 1; i++) {
			for(int j = i + 1; j < candidates.length; j++) {
				if(candidates[i] > candidates[j]) {
					temp = candidates[i];
					candidates[i] = candidates[j];
					candidates[j] = temp;
				}
			}
		}
		List<List<Integer>> res = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		findTarget(list, res, target, 0, candidates);
		return res;
    }
	
	public void findTarget(ArrayList<Integer> list, 
						   List<List<Integer>> res,
						   int target,
						   int sum,
						   int[] candidates) {
		if(sum == target) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			Iterator<Integer> it = list.iterator();
			
			while(it.hasNext()) {
				int next = it.next();
				try {
					Integer value = map.get(next);
					if(value == null) 
						map.put(next, 1);
					else
						map.put(next, ++value);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			Iterator<Integer> key = map.keySet().iterator();
			String s = "";
			while(key.hasNext()) {
				Integer next = key.next();
				s += next + "" + map.get(next);
			}
			try {
				Boolean bool = this.map.get(s);
				if(bool == null) {
					this.map.put(s, true);
					res.add(new ArrayList<>(list));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		if(sum > target) {
			return;
		}
		
		int len = candidates.length;
		int tempSum = sum;
		for (int i = 0; i < len; i++) {
			tempSum += candidates[i];
			if(tempSum <= target) {
				list.add(candidates[i]);
				findTarget(list, res, target, tempSum, candidates);
				list.remove(list.size() - 1);
				tempSum = sum;
			}else {
				tempSum = sum;
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		CombinationSum cs = new CombinationSum();
		int[] candidates = {2, 3, 6, 7};
		int target = 7;
		System.out.println(cs.combinationSum(candidates, target));
	}
}
