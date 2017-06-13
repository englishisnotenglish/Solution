package ¶ş·Ö²éÕÒ;

import java.util.HashMap;

public class FastPower {

	public long fastPower(int a, int b, int n) {
        // write your code here
		if(a == 0)
			return 0;
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		HashMap<Integer, Long> mapRes = new HashMap<Integer, Long>();
		
		long first = 1 % b;
		int	 index = 0;
		try {
			while(map.get(first) == null && index <= n) {
				if(map.get(first) == null){
					map.put(first, index++);
					mapRes.put(index - 1, first);
				}
				first = (long)Math.pow(a, index) % b;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(mapRes);
		long res = ((long)n + 1) % index == 0 ? index -1: (((long)n + 1) % index)-1;
		return mapRes.get((int)res);
    }
	
	public static void main(String[] args) {
		FastPower fp = new FastPower();
		System.out.println(fp.fastPower(109, 10000007, 1000001));
		
	}
}
