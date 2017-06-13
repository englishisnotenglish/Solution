package Ì°ÐÄËã·¨;

public class DeleteDigits {
	public String deleteDigits(String A, int k) {
        // write your code here
		char[] arr = A.toCharArray();
		int len = arr.length;
		if(len < k)
			return "";
		else if(len == k)
			return A;
		int[] index = new int[len - k + 1];
		
		for (int i = 0; i < len - k + 1; i++) {
			int sum = Integer.parseInt(arr[i] + "");
			for (int j = i + 1; j < i + k; j++) {
				sum +=  Integer.parseInt(arr[j] + "");
			}
			index[i] = sum;
		}
		int max = index[0],
			sub = 0;
		for (int i = 1; i < index.length; i++) {
			if(index[i] > max) {
				sub = i;
				max = index[i];
			}
		}
		return A.replaceAll(A.substring(sub, sub + k), "");
    }
	public static void main(String[] args) {
		DeleteDigits dd = new DeleteDigits();
		String s = "178542";
		System.out.println(dd.deleteDigits(s, 4));
	}

}
