package Easy;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		int i=0,j=i+1;
		
		while(j<nums.length) {
			if(nums[i]==nums[j]) {
				j++;
			}else {
				nums[i+1]=nums[j];
				i++;
			}
		}
		
		return i;
		
	}
}
