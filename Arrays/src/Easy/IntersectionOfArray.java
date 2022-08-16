package Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfArray {
	/*
	Example 1:

		Input: nums1 = [1,2,2,1], nums2 = [2,2]
		Output: [2,2]
		Example 2:

		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
		Output: [4,9]
		Explanation: [9,4] is also accepted.
	 */
	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			if(map.containsKey(nums1[i])) {
				map.put(nums1[i], 1+map.get(nums1[i]));
			}else {
				map.put(nums1[i], 1);
			}
		}


		for (int i = 0; i < nums2.length; i++) {
			if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
			{
				arr.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i])-1);
			}
		}

		int[] res = new int[arr.size()];

		for(int i = 0; i < arr.size(); i++){
			res[i] = arr.get(i);
		}

		return res;
	}
}
