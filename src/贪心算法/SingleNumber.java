package 贪心算法;

import java.util.HashMap;
import java.util.Iterator;


public class SingleNumber {
	public int singleNumber(int[] A) {
        // Write your code here
		int len = A.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		try {
			for (int i = 0; i < len; i++) {
				int num = A[i];
				if(map.get(num) == null) {
					map.put(num, 1);
				}else 
					map.remove(num);
			}
			Iterator<Integer> it = map.keySet().iterator();
			while(it.hasNext()) {
				return it.next();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return  0;
    }
	
	public static void main(String[] args) {
		SingleNumber sb = new SingleNumber();
		int[] a = {1, 1, 2};
		System.out.println(sb.singleNumber(a));
	}
	
}
