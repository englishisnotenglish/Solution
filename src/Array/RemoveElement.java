package Array;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        int count = A.length;
        for(int i = 0, j = A.length - 1; i < A.length && i < j; i++) {
            if(A[i] == elem) {//前指针遇到需删除的元素
                count --;
                while(i < j ) {//找到后指针所指向的第一个遇到的不该删除的元素，并赋给A[i]
                    if(A[j] != elem) {
                        A[i] = A[j];
                        j--;
                        break;
                    }else {
                        count--;
                        j--;
                    }
                }
            }
        }
        return count;
    }

}
