package Medium;

import java.util.PriorityQueue;

/*
	Given an integer array nums and an integer k, return the kth largest element in the array.

	Note that it is the kth largest element in the sorted order, not the kth distinct element.

	You must solve it in O(n) time complexity.



	Example 1:

	Input: nums = [3,2,1,5,6,4], k = 2
	Output: 5
	Example 2:

	Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
	Output: 4
 */

public class KthLargestElementinanArray {
	public int findKthLargest(int[] nums, int k) {
		// Making a min PQ   
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();  
		//The size of PQ will be k   
		for (int i = 0; i < k; i++) {    
			minHeap.add(nums[i]);   
		}   
		for (int i = k; i < nums.length; i++) { 
			if (nums[i] > minHeap.peek()) {  
				minHeap.poll();     
				minHeap.add(nums[i]);  
			}  
		}   return minHeap.peek();
	}
}
