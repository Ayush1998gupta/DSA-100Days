package Medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if(i==0|| nums[i-1]!=nums[i]) {

			}
		}
		return res;
	}
	public static void twoSumSorted(int i,int j,int [] nums,int target,List<List<Integer>> res) {
		int a1=nums[i-1];
		List<Integer> list=new ArrayList<Integer>();
		while(i<j) {
			if(nums[i]+nums[j]>target) {
				j--;
			}else if(nums[i]+nums[j]<target) {
				i--;
			}else {
				list.add(a1);
				list.add(nums[i]);
				list.add(nums[j]);

				while(i<j && nums[i]==nums[i+1]) {
					i++;
				}
				while(i<j&& nums[j]==nums[j-1]) {
					j--;
				}
			}
			res.add(list);
		}
	}
	
	public static void main(String[] args) {
		int nums[]= {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
		
	}

}
