package Ì°ÐÄËã·¨;

public class CanCompleteCircuit {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        // write your code here
		int len = gas.length;
		for (int i = 0; i < len; i++) {
			int left = 0;
			int j = i,
				index = 0;
			do{
				index = j++ % len;
				left += gas[index] - cost[index]; 
				if(left < 0) 
					break;
			}while(j % len != i);
			if(left >= 0)
				return i;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		CanCompleteCircuit sb = new CanCompleteCircuit();
		int[] a = {1, 1, 3, 1};
		int[] b = {2, 2, 1, 1};
		System.out.println(sb.canCompleteCircuit(a, b));
	}

}
