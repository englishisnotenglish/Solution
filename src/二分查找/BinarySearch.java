package 二分查找;

public class BinarySearch {
	public int binarySearch(int[] nums, int target) {
        //write your code here
		int start = 0,
			end = nums.length - 1,
			len = nums.length;
		int middle = 0;
		for (int i = 0; i < len; i++) {
			int sum = start + end;
			middle = sum % 2 == 0 ? sum / 2 : sum/2 +1;
			if(nums[middle] != target) {
				if(nums[middle] < target) 
					start = middle;
				else
					end = middle % 2 == 0 ? middle : middle - 1;
			}
		}
		if(nums[middle] != target) {
			return -1;
		}
		try {
			while(nums[middle - 1] == target) {
				middle--;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return middle;
    }
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] nums = {1, 4, 7, 9, 11, 14};
		System.out.println(bs.binarySearch(nums, 4));
	}

}
