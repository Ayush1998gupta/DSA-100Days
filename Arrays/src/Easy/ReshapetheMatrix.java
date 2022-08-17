package Easy;
/*
	In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

	You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

	The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

	If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.



	Example 1:


	Input: mat = [[1,2],[3,4]], r = 1, c = 4
	Output: [[1,2,3,4]]
	Example 2:


	Input: mat = [[1,2],[3,4]], r = 2, c = 4
	Output: [[1,2],[3,4]]
 */

public class ReshapetheMatrix {

	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int m = mat.length;
		int n = mat[0].length;

		// Handle being asked to return a larger or smaller matrix.
		// Also, if we're asked to keep the exact same dimensions, just return mat.
		if (m * n != r * c || (m == r && n == c)) {
			return mat;
		}

		// We were asked to return an r x c matrix, so instantiate one
		int[][] reshaped = new int[r][c];

		int i2 = 0;  // row of reshaped
		int j2 = 0;  // column of reshaped

		for (int i1 = 0; i1 < m; i1++) {    // row of mat
			for (int j1 = 0; j1 < n; j1++) {  // column of mat

				// Copy the value from mat to reshaped
				reshaped[i2][j2] = mat[i1][j1];

				// Increment column-pointer for reshaped.  Maybe start a new row.
				if (++j2 == c) {
					j2 = 0;
					i2++;
				}
			}
		}

		return reshaped;
	}

}
