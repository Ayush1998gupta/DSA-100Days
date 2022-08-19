package Easy;

import java.util.HashMap;

/*
	Given a string s, find the first non-repeating character in it 
	and return its index. If it does not exist, return -1.

	Example 1:

	Input: s = "leetcode"
	Output: 0
	Example 2:

	Input: s = "loveleetcode"
	Output: 2
	Example 3:

	Input: s = "aabb"
	Output: -1

 */
public class FirstUniqueCharacterinaString {
	
	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
       
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
     
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
	}
	
	public static void main(String[] args) {
		firstUniqChar("loveleetcode");
	}
}
