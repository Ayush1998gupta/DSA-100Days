package TopQuestions;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public  static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> ds =new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        recPermute(nums, ds, ans, freq);
        return ans;
    }
    
    public static void recPermute(int[] nums,List<Integer> ds,List<List<Integer>> ans, boolean [] freq) {
    	if(ds.size()==nums.length) {
    		ans.add(new ArrayList<>(ds));
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
			if(!freq[i]) {
				freq[i]=true;
				ds.add(nums[i]);
				recPermute(nums, ds, ans, freq);
				ds.remove(ds.size()-1);
				freq[i]=false;
			}
		}
    }
	
}
 