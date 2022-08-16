package Easy;

/*
	Example 1:

	Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	Output: [1,2,2,3,5,6]
	Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
	The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	Example 2:

	Input: nums1 = [1], m = 1, nums2 = [], n = 0
	Output: [1]
	Explanation: The arrays we are merging are [1] and [].
	The result of the merge is [1].
 */


public class MergeSort {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
		int j=n-1;
		int k = m + n - 1;

		while(i>=0 && j>=0) {
			if(nums1[i]>nums2[j]) {
				nums1[k]=nums2[j];
				j--;
				k--;
			}else {
				nums1[k]=nums1[i];
				i--;
				k--;
			}
			while(j >= 0) {
				nums1[k--] = nums2[j--];
			}
		}
	}
}
