package ¶ş·Ö²éÕÒ;

public class SearchRange {
	public int[] searchRange(int[] A, int target) {
        // write your code here
		int len = A.length;
		int[] a = {-1, -1};
		if(len == 0) return a;
		int start = 0, 
			end = len -1;
		for (int i = 0; i < len; i++) {
			int middle = (start + end)/2;
			if(A[middle] < target)
				start = ++middle;
			else if(A[middle] > target)
				end = --middle;
			else {
				int temp = middle,
					aStart = middle - 1,
					aEnd = middle + 1;
				while(middle >= 0 || temp <= len - 1) {
					if(temp <= len -1 && A[temp++] == target)
						aEnd = temp - 1;
					if(middle >= 0 && A[middle--] == target)
						aStart = middle + 1;
				}
				if(aEnd - aStart == 0) {
					a = new int[2];
					a[0] = aStart;
					a[1] = aStart;
					return a;
				}
				a[0] = aStart;
				a[1] = aEnd;
				break;
			}
		}
		return a;
    }
	
	public static void main(String[] args) {
		SearchRange sr = new SearchRange();
		int[] a = {5, 7, 7, 8, 8, 10};
		System.out.println(sr.searchRange(a, 8));
	}

}
