package Easy;

import java.util.HashMap;

/*
		Example 1:

		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		Example 2:

		Input: nums = [3,2,4], target = 6
		Output: [1,2]
		Example 3:

		Input: nums = [3,3], target = 6
		Output: [0,1] 
 */
public class TwoSum {

	public int[] twoSum1(int[] nums, int target) {
		int res[]=new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					res[0]=i;
					res[1]=j;
				}
			}
		}
		return res;
	}

	public static int[] twoSum2(int[] nums, int target) {
		int res[]=new int[2];

		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				res[1]=i;
				res[0]=map.get(target-nums[i]);
			}
			map.put(nums[i], i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int nums[]= {2,11,15,7,5};
		int res[]=twoSum2(nums,9);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
