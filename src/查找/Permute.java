package 查找;

import java.util.ArrayList;
import java.util.List;

public class Permute {
	public List<List<Integer>> permute(int[] nums) {
        // write your code here
		ArrayList<Integer> copy = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> lists = new ArrayList<>();
		for(Integer num : nums) {
			copy.add(num);
		}
		return iterator(copy, list, lists);
    }
	
	public List<List<Integer>> iterator(ArrayList<Integer> copy, 
										ArrayList<Integer> list,
										List<List<Integer>> lists) {
		if(list.size() == copy.size()){
            lists.add(new ArrayList<Integer>(list));
            return lists;
        }
		for (int i = 0; i < copy.size(); i++) {
			if(list.contains(copy.get(i))){
                continue;
            }
			list.add(copy.get(i));
			iterator(copy, list, lists);
			list.remove(list.size() - 1);
		}
		return lists;
	}
	
	public static void main(String[] args) {
		Permute p = new Permute();
		int[] nums = {1, 2, 3};
		System.out.println(p.permute(nums));
	}
}
