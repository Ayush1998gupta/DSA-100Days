package Medium;

import java.util.HashMap;

public class SubarraySumEqualsK {
	public static int subarraySum1(int[] nums, int k) {
		return subArraySum(nums, k, 0);
	}

	public static int subArraySum(int [] nums, int k,int index) {
		if(index==nums.length) {
			if(k==0) {
				return 1;
			}else {
				return 0;
			}
		}
		if(k==0) {
			return 1;
		}
		int p=nums[index];
		int sop1=subArraySum(nums, k-p, index+1);
		int sop2=subArraySum(nums, k, index+1);

		return sop1+sop2;
	}

	public int subarraySum(int[] nums, int k) {
		int count=0,sum=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);

		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(map.containsKey(sum-k)){
				count+=map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return count;
	}

	public static void main(String[] args) {
	
		
	}
}
