package Easy;

public class FindPivotIndex {

	public int pivotIndex(int[] nums) {
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}

		int leftSum=0;
		int rightSum=sum-nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(leftSum==rightSum) {
				return i;
			}
			leftSum+=nums[i];
			if(i==nums.length-1) {
				rightSum-=nums[i+1];
			}else {
				rightSum=0;
			}
		}

		return -1;
	}
}
