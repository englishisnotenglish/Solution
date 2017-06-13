package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<String, Boolean> mapDup = new HashMap<String, Boolean>();
		int len = numbers.length;
		//建立查询表
		for (int i = 0; i < len; i++) {
			try {
				if(map.get(numbers[i]) == null)
					map.put(numbers[i], 1);
				else
					map.put(numbers[i], map.get(numbers[i]) + 1);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < len; i++) {
			int findKey = 0;
			for (int j = i + 1; j < len; j++) {
				findKey = numbers[i] + numbers[j];
				try {
					if(map.get(-findKey) != null) {
						ArrayList<Integer> temp = new ArrayList<>();
						temp.add(numbers[i]);
						temp.add(numbers[j]);
						if(-findKey == numbers[i] || -findKey == numbers[j])
							if(map.get(-findKey) <= 1)
								continue;
						if(-findKey == numbers[i] && -findKey == numbers[j])
							if(map.get(-findKey) < 3)
								continue;
						temp.add(-findKey);
						temp.sort(null);
						String s = "";
						for(int key : temp) {
							s += key;
						}
						try {
							if(mapDup.get(s) == null)
								mapDup.put(s, true);
							else
								continue;
						} catch (Exception e) {
							// TODO: handle exception
						}
						result.add(temp);
					}	
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		int arrayLen = result.size();
		for (int i = 0; i < arrayLen - 1; i++) {
			for (int j = i + 1; j < arrayLen; j++) {	
				if(result.get(i).get(0) > result.get(j).get(0)) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp = result.get(i);
					result.set(i, result.get(j));
					result.set(j, temp);
				}else if(result.get(i).get(0) - result.get(j).get(0) == 0) {
					if(result.get(i).get(1) > result.get(j).get(1)) {
						ArrayList<Integer> temp = new ArrayList<>();
						temp = result.get(i);
						result.set(i, result.get(j));
						result.set(j, temp);
					}else if (result.get(i).get(1) == result.get(j).get(1)) {
						if(result.get(i).get(2) > result.get(j).get(2)) {
							ArrayList<Integer> temp = new ArrayList<>();
							temp = result.get(i);
							result.set(i, result.get(j));
							result.set(j, temp);
						}
					}
				}
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		ThreeSum ts = new ThreeSum();
		int[] a = {0,0,0,0,92,0,-3002,0,0,0,-10,-19,0,65,0,0,293,0,1,1,1,9,9,9,10,11,1001,2001,-404,201,203,201,999,345,1,1,1,1,1,1,1,-2,1,1,1,1,1,1,1,1,-2,1,1,1,1,1,1,1,1,1,1,-1200,1,1,1,1,1,2,1202,2,2,-4,2,2,2,2,4,5,6,1,1,-11,1,1,1,1,1,1,1,1,101,1,1,1,1,1,-1,1,-6};
		System.out.println(ts.threeSum(a));
	}
}
