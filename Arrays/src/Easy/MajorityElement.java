package Easy;

import java.util.HashMap;

public class MajorityElement {

	public int majorityElement(int[] nums) {
		
		int size=nums.length/2;
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], 1+map.get(nums[i]));
				if(map.get(nums[i])>size) {
					return nums[i];
				}
			}else {
				map.put(nums[i], 1);
			}
		}
		return 1;

	}
}
