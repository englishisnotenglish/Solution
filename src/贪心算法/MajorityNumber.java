package Ì°ĞÄËã·¨;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MajorityNumber {
	public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
		int len = nums.size();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < len; i++) {
        	try {
        		int value = nums.get(i);
        		if(map.get(value) == null)
        			map.put(value, 1);
        		else
        			map.put(value, map.get(value) + 1);
			} catch (Exception e) {
				// TODO: handle exception
			}      
        }
        Iterator<Integer> it  = map.keySet().iterator();
        while(it.hasNext()){
        	int key = it.next();
        	if(map.get(key) > len/2) 
        		return key;
        }
        return 0;
    }

}
