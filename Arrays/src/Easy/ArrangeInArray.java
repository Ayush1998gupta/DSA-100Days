package Easy;

public class ArrangeInArray {
	/*
	 * You have been given an empty array(ARR) and its size N. 
	 * The only input taken from the user will be N and you need not 
	 * worry about the array. Your task is to populate the array using the 
	 * integer values in the range 1 to N(both inclusive) 
	 * in the order - 1,3,5,.......,6,4,2.
	 */

	public static void arrange(int[] arr, int n) {    
		int count=1;
		int i=0;
		int j=n-1;
		
		while(i<=j) {
			if(count%2==1) {
				arr[i]=count++;
				i++;
			}else {
			arr[j]=count++;
			j--;
			}
		}
	}
}
