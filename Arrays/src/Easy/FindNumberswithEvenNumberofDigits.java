package Easy;

/*
	Input: nums = [12,345,2,6,7896]
	Output: 2
	Explanation: 
	12 contains 2 digits (even number of digits). 
	345 contains 3 digits (odd number of digits). 
	2 contains 1 digit (odd number of digits). 
	6 contains 1 digit (odd number of digits). 
	7896 contains 4 digits (even number of digits). 
	Therefore only 12 and 7896 contain an even number of digits.
 */

public class FindNumberswithEvenNumberofDigits {

	public static int countDigit(long n)
	{
		return (int)Math.floor(Math.log10(n) + 1);
	}
	public int findNumbers(int[] nums) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			int n=countDigit(nums[i]);

			if ((n | 1) > n) {
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		System.out.println(countDigit(55));
	}
}
