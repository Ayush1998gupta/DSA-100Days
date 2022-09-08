package Medium;

public class Sort012 {
	public void sortColors(int[] nums) {

		int zeroIndex = 0, twoIndex = nums.length - 1, mid = 0;
		while( mid <= twoIndex ) {
			if( nums[mid] == 0 ) 
				swap(nums, zeroIndex++, mid++);
			else if( nums[mid] == 2)
				swap(nums, twoIndex--, mid);    
			else
				mid++;
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}



}
