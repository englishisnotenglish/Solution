package Array;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        int count = A.length;
        for(int i = 0, j = A.length - 1; i < A.length && i < j; i++) {
            if(A[i] == elem) {//ǰָ��������ɾ����Ԫ��
                count --;
                while(i < j ) {//�ҵ���ָ����ָ��ĵ�һ�������Ĳ���ɾ����Ԫ�أ�������A[i]
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
