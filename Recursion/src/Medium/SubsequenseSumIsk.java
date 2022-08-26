package Medium;


import java.util.*;


public class SubsequenseSumIsk {

	public static void sumOfK(ArrayList<Integer> arr,ArrayList<Integer> res, int index,int sumation,int k) {

		if(index==arr.size()) {
			if(sumation==k) {
				System.out.println(res);
			}
			return;
		}
		res.add(arr.get(index));
		sumation+=arr.get(index);
		sumOfK(arr, res, index+1, sumation, k);

		res.remove(arr.get(index));
		sumation-=arr.get(index);
		sumOfK(arr, res, index+1, sumation, k);

	}

	//	only to print one ans
	public static boolean sumOfKbool(ArrayList<Integer> arr,ArrayList<Integer> res, int index,int sumation,int k) {

		if(index==arr.size()) {
			if(sumation==k) {
				System.out.println(res);
				return true;
			}
			return false;
		}
		res.add(arr.get(index));
		sumation+=arr.get(index);
		if((sumOfKbool(arr, res, index+1, sumation, k))==true) {
			return true;
		}

		res.remove(arr.get(index));
		sumation-=arr.get(index);
		if((sumOfKbool(arr, res, index+1, sumation, k))==true) {
			return true;
		}

		return false;

	}


	//	Leetcode
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans =new ArrayList<>();
		findcombinationSum(0, candidates, target, new ArrayList<>(), ans);
		return ans;

	}

	public void findcombinationSum(int index,int[] candidates, int target,List<Integer> ds,List<List<Integer>> ans) {


		if(index==candidates.length){
			if(index==0) {
				ans.add(new ArrayList<>(ds));
			}
			return;
		}
		if(candidates[index]<= target) {
			ds.add(candidates[index]);
			findcombinationSum(index, candidates, target-candidates[index], ds, ans);
			ds.remove(ds.size()-1);
		}
		
		findcombinationSum(index+1, candidates, target, ds, ans);
	}



	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		ArrayList<Integer> res=new ArrayList<>();
		sumOfKbool(arr, res, 0, 0, 2);

	}

}
