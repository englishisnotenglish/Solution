package sort;

public class HeapSort {
	public void heapSort(int[] arr) {
		for (int i = arr.length / 2 - 1; i >= 0; i--) 
			heapAdjust(arr, i, arr.length);
		
		int temp;
		for (int i =  arr.length - 1; i > 0; i--) {
			temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapAdjust(arr, 0, i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public void heapAdjust(int[] arr, int index, int len) {
		int temp =  arr[index];
		for (int i = index * 2 + 1; i < len; i = 2 * i + 1) {
			if(i + 1 < len && arr[i] < arr[i + 1])
				i++;
			if(arr[i] > temp) {
				arr[index] = arr[i];
				arr[i] = temp;
			}else
				return;
			temp = arr[i];
			index = i;
		}
	}
	
	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		int[]  arr = {11, 22, 13, 22, 343,1231, 123, 111};
		hs.heapSort(arr);
	}
}
