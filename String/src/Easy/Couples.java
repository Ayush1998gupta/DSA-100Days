package Easy;

import java.util.*;


public class Couples {
	public static int couples(int n ,String line) {
		if (n==0 || n==1) {
			return 0;
		}
		if(n>line.length()) {
			n=line.length();
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('B', 0);
		map.put('G', 0);
		
		int max=0;
		for (int i = 0; i <n; i++) {
			if(line.charAt(i)=='B') {
				if(map.get('G')>0) {
					max++;
					map.put('G', map.get('G')-1);
				}
			}else {
				map.put('G', map.get('G')+1);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(couples(6, "GBGB"));
	}

}
