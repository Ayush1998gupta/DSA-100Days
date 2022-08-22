package Medium;

public class MergeSort {


	public static void mergeSort(int [] arr) {
		if(arr.length <= 1){
			return;  
		}
		int smallArray1 []=new int[arr.length / 2 ];
		int smallArray2[]=new int[arr.length-smallArray1.length];


		for (int i = 0; i < arr.length/2; i++) {
			smallArray1[i]=arr[i];
		}
		for (int i = arr.length/2; i < arr.length; i++) {
			smallArray2[i-arr.length/2]=arr[i];
		}

		mergeSort(smallArray1);
		mergeSort(smallArray2);

		mergeArray(smallArray1, smallArray2, arr);


	}
	public static void mergeArray(int arr1[],int[] arr2,int [] arr) { 
		int n=arr1.length;  
		int m=arr2.length;  
		int i=0,j=0,k=0;     
		while (i<n&&j<m) {    
			if(arr1[i]<=arr2[j]) {  
				arr[k]=arr1[i];   
				i++;            
				k++;            
			}         
			else {   
				arr[k]=arr2[j];  
				j++;            
				k++;            
			}       
		}      
		while(i<n) {  
			arr[k]=arr1[i];  
			i++;        
			k++;      
		}       
		while(j<m) {  
			arr[k]=arr2[j];  
			j++;           
			k++;      
		}      
	}
}
