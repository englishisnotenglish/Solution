package sort;

public class InsertSort {
	public int[] insertSort(int[] a){
		int check, j;
		for (int i = 1; i < a.length; i++) {
			if(a[i] < a[i - 1]) {
				check = a[i];
				for(j = i - 1; j >= 0 && a[j] > check; j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = check;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {11, 22, 13, 22, 343,1231, 123, 111};
		InsertSort is = new InsertSort();
		is.insertSort(a);
	}
}
