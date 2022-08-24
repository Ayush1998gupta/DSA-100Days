package Medium;

import java.util.ArrayList;

public class AllSubsequences {
	
	public static ArrayList<String> subsequences(String str){
		if(str.length()==0) {
			ArrayList<String> arr=new ArrayList<String>();
			arr.add(str);
			return arr;
		}
		ArrayList<String> smallop=subsequences(str.substring(1));
		
		ArrayList<String> output=  new ArrayList<String>();
		for (int i = 0; i < smallop.size(); i++) {
			output.add(smallop.get(i));
			output.add(str.charAt(0)+smallop.get(i));
			
		}
		return output;
	}
	
	public static void printSubsequences(String str,String sofar){
		if(str.length()==0) {
			System.out.println(sofar);
			return ;
		}
		
		printSubsequences(str.substring(1), sofar);
		printSubsequences(str.substring(1), sofar+str.charAt(0));
	}
	
	
	public static void main(String[] args) {
//		System.out.println(subsequences("abc"));
		printSubsequences("abc", "");
	}

}
