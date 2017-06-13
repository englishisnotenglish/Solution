package 二分查找;

public class WoodCut {
	
	public int woodCut(int[] L, int k) {
        long start = 1;
        long end = 0;
        for (int i = 0; i < L.length; i++) 
        {
            end = Math.max(end, L[i]);
        }
        while (start <= end) 
        {
            long mid = (end + start) / 2;
            int count = 0;
            for (int i = 0; i < L.length; i++) 
            {
                count += L[i] / mid;
            }
            start = count >= k ? ++mid : start;
            end = count < k ? --mid : end;
        }
        return (int)end;
    }
	
	public static void main(String[] args) {
		WoodCut wc = new WoodCut();
		int[] L = {24,36,26,23,34,20,13,19,26,12,18,21};
		System.out.println(wc.woodCut(L, 1));	
	}

}
