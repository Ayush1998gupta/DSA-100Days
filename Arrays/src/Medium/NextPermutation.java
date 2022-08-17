package Medium;
/*
	 A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

	For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
	The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

	For example, the next permutation of arr = [1,2,3] is [1,3,2].
	Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
	While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
	Given an array of integers nums, find the next permutation of nums.

	The replacement must be in place and use only constant extra memory.
	Example 1:

	Input: nums = [1,2,3]
	Output: [1,3,2]
	Example 2:

	Input: nums = [3,2,1]
	Output: [1,2,3]
	Example 3:

	Input: nums = [1,1,5]
	Output: [1,5,1]

	link= https://www.youtube.com/watch?v=6qXO72FkqwM
 */
public class NextPermutation {
	public void nextPermutation(int[] A) {

		if(A == null || A.length <= 1) return;
		int i = A.length - 2;
		while(i >= 0 && A[i] >= A[i + 1]) i--; // Find 1st id i that breaks descending order
		if(i >= 0) {                           // If not entirely descending
			int j = A.length - 1;              // Start from the end
			while(A[j] <= A[i]) j--;           // Find rightmost first larger id j
			swap(A, i, j);                     // Switch i and j
		}
		reverse(A, i + 1, A.length - 1);       // Reverse the descending sequence
	}

	public void swap(int[] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	public void reverse(int[] A, int i, int j) {
		while(i < j) swap(A, i++, j--);
	}

}
