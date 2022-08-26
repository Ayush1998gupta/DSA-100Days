package Medium;

import java.util.ArrayList;

public class SubsequencesArray {
	
	public static void sub(ArrayList<Integer> arr, ArrayList<Integer>res,int index){
//		Base Case
		if(index==arr.size()) {
			System.out.println(res);
			return;
		}
		
		res.add(arr.get(index));
		
		sub(arr, res, index+1);
		
		res.remove(arr.get(index));
		
		sub(arr, res, index+1);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(2);
		ArrayList<Integer> res=new ArrayList<>();
		sub(arr, res, 0);
	}

}
