package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySum {
	public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        int len = nums.length;

        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(0, -1);

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            
            if (map.containsKey(sum)) {
                ans.add(map.get(sum) + 1);
                ans.add(i);
                return ans;
            }

            map.put(sum, i);
        }

        return ans;
    }
	
	public static void main(String[] args) {
		SubarraySum ss = new SubarraySum();
		int[] a = {1,1,1,1,1,1,1,1,1,-19,1,1,1,1,1,1,1,-2,1,1,1,1,1,1,1,1,-2,1,-15,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(ss.subarraySum(a));
	}
}
