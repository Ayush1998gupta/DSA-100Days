package Easy;
/*
	Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

	Each letter in magazine can only be used once in ransomNote.

	Example 1:

	Input: ransomNote = "a", magazine = "b"
	Output: false
	Example 2:

	Input: ransomNote = "aa", magazine = "ab"
	Output: false
	Example 3:

	Input: ransomNote = "aa", magazine = "aab"
	Output: true
 */

public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
		int ans[] = new int[26];

		for(int i = 0; i < magazine.length(); i ++) {
			ans[magazine.charAt(i) - 'a'] ++;
		}

		for(int i = 0; i < ransomNote.length(); i ++) {
			if(-- ans[ransomNote.charAt(i) - 'a'] < 0) 
				return false;
		}
		return true;
	}
	
	
}
