package Easy;

public class ValidPalindromeII {
	public static boolean validPalindrome(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			boolean res=isPalindrome( s.substring(0, i)+s.substring(i+1));
			if(res) {
				return true;
			}
		}
		return false;
	}

	public static boolean isPalindrome(String str) {

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	public static void main(String[] args) {
		String str= "abc";
		System.out.println(validPalindrome(str));
	}
}
