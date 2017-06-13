package 二分查找;

public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
		int rows = matrix.length;
		if(rows == 0)
			return false;
		int	column = matrix[0].length,
			index = 0;
		int[] map = new int[rows];
		for (int i = 0; i < rows; i++) {
			map[i] = matrix[i][column-1];
		}
		for (int i = 0; i < rows; i++) {
			if(target <= map[i]) {
				index = i;
				break;
			}	
		}
		for (int i = 0; i < column; i++) {
			if(matrix[index][i] == target)
				return true;
		}
		return false;
    }
	public static void main(String[] args) {
		SearchMatrix s = new SearchMatrix();
		int[][] matrix = {
		                  {1, 3, 5, 7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}
		                  };
		System.out.println(s.searchMatrix(matrix, 7));
		
	}
}
