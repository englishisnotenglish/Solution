package Array;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
        // write your code here    
		int len = A.length;
		if(len == 0)
			return 1;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if(A[i] > A[j]) {
					A[i] = A[i] + A[j];
					A[j] = A[i] - A[j];
					A[i] = A[i] - A[j];
				}
			}
		}
		if(A[len - 1] < 0 || A[0] > 1)
			return 1;
		if(len == 1) {
			if(A[len-1] == 1)
				return 2;
			else
				return 1;
		}
		for (int i = 0; i < len -1; i++) {
			if(A[i] > 0){
				if(A[i + 1] - A[i] >= 2) {
					return A[i] + 1;
				}
			}
		}
		return A[len -1] + 1;
    }
	
	public static void main(String[] args) {
		FirstMissingPositive fm = new FirstMissingPositive();
		int[]  a = {7, 8, 9};
		System.out.println(fm.firstMissingPositive(a));
	}

}
