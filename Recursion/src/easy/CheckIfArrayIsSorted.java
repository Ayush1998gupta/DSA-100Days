package easy;

public class CheckIfArrayIsSorted {
	public static boolean isSorted(int arr[] ,int index) {
		if(arr.length-1==index) {
			return true;
		}

		boolean smallop=isSorted(arr,index+1);

		if(arr[index]<arr[index+1] && smallop) {
			return true;
		}
		return false;
	}

}
