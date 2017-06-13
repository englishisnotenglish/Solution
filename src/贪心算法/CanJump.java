package 贪心算法;

public class CanJump {
	public boolean canJump(int[] A) {
        // wirte your code here
		return this.fn(0, A);
    }
	
	public boolean fn(int index, int[] arr) {
		int	len = arr.length;
		if(index >= len -1)
			return true;
		int	k = arr[index],
			temp = index;
		for (int i = 1; i <= k; i++) {
			temp += i;
			if(fn(temp, arr) == true){
				return true;
			}
			temp = index;
		}
		return false;
	}
	
	public static void main(String[] args) {
		CanJump cj = new CanJump();
		int[] A = {3,2,1,0,4};
		System.out.println(cj.canJump(A));
	}

}
