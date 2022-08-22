package Medium;

public class QickSort {

	public static void quickSort(int[] input) {  
		quickSort(input, 0, input.length - 1);  
	}

	public static void quickSort(int[] input, int startIndex, int endInedx) { 
		if(startIndex>=endInedx) {
			return;
		}

		int partitionIndex=partition(input,startIndex,endInedx);

		quickSort(input, startIndex, partitionIndex-1);
		quickSort(input, partitionIndex+1, endInedx);
	}

	private static int partition(int[] input, int startIndex, int endInedx) {

		int pivot=input[startIndex];

		int smallerNumbercount=0;
		for (int i = startIndex+1; i <= endInedx; i++) {
			if(input[i]<pivot) {
				smallerNumbercount++;
			}
		}

		//		swaping with the position
		int temp=input[startIndex+smallerNumbercount];
		input[smallerNumbercount]=pivot;
		input[startIndex]=temp;


		int i=startIndex,j=endInedx;


		while (i<j) { 
			if(input[i]<pivot) {    
				i++;       
			}else if(input[j]>=pivot) {   
				j--;     
			}else {  
//				in this both i and j is not meet the condition than perfect  
//				condition to swap the both i and j
				temp=input[i];  
				input[i]=input[j];   
				input[j]=temp;    
				i++;       
				j--;   
			}       
		}

		return startIndex+smallerNumbercount;
	}     

}


