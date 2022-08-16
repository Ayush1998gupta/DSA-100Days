package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDupicates {
	/*
	 217. Contains Duplicate

	Given an integer array nums, return true if any value appears at least 
	twice in the array, and return false if every element is distinct.

	Example 1:

	Input: nums = [1,2,3,1]
	Output: true
	Example 2:

	Input: nums = [1,2,3,4]
	Output: false
	Example 3:

	Input: nums = [1,1,1,3,3,4,3,2,4,2]
	Output: true
	 */

	public boolean containsDuplicate1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==nums[i-1]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsDuplicate3(int[] nums) {
		 HashSet<Integer> set = new HashSet<>();
		 
		 for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		 return false;
	}
	
//	 public static void main(String[] args) {
//	        Set<Integer> evenNumber = new HashSet<>();
//
//	        // Using add() method
//	        evenNumber.add(2);
//	        evenNumber.add(4);
//	        evenNumber.add(6);
//	        evenNumber.add(6);
//	        System.out.println("HashSet: " + evenNumber);
//
//	        HashSet<Integer> numbers = new HashSet<>();
//	        
//	        // Using addAll() method
//	        numbers.addAll(evenNumber);
//	        numbers.add(5);
//	        System.out.println("New HashSet: " + numbers);
//	    }

}
