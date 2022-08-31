package Medium;

public class ProductofArrayExceptSelf {
	public int[] productExceptSelf1(int[] nums) {
		int n=nums.length;
		int left[]=new int[n];
		int right[]=new int[n];

		//		left
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i]=left[i-1] * nums[i-1];
		}
		//		Right
		right[nums.length - 1] = 1;
		for (int i = n-2; i >= 0; i--) {
			right[i]= right[i+1] * nums[i+1];
		}
		int[] product = new int[nums.length];
		for (int i = 0; i < product.length; i++) {
			product[i] = left[i] * right[i];
		}
		return product;
	}

}
