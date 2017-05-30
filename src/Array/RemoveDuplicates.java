package Array;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
        // write your code here
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			int start = nums[i];
			for (int j =  i + 1; j < len; j++) {
				System.out.printf("%d %d %d %d\n",start,nums[j],j ,len);
				if(start ==  nums[j]) {
					len--;
					int k = j;
					while(k < len) {
						nums[k] = nums[++k];
					}
					j--;
				}
			}
		}
		return len;
    }

	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		int[] a = {-14,-14,-13,-13,-13,-13,-13,-13,-13,-12,-12,-12,-12,-11,-10,-9,-9,-9,-8,-7,-5,-5,-5,-5,-4,-3,-3,-2,-2,-2,-2,-1,-1,-1,-1,-1,0,1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6,6,6,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,12,13,14,14,14,14,15,16,16,16,18,18,18,19,19,19,19,20,20,20,21,21,21,21,21,21,22,22,22,22,22,23,23,24,25,25};
		System.out.println(rd.removeDuplicates(a));
		
		
	}
}
