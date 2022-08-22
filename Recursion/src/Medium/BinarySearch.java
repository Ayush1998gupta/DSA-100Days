package Medium;

public class BinarySearch {
	public static int binarySearch(int arr[] ,int x,int start,int end) {
		if(start>end) {
			return -1;
		}

		int mid = start + (end-start)/2;

		if(arr[mid]==x) {
			return mid;
		}

		if(arr[mid]<x) {
			return binarySearch(arr, x, mid+1, end);
		}else {
			return binarySearch(arr, x, start, mid-1);
		}
	}

}
