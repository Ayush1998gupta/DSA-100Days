package easy;

public class findMinimum {
	public static void printMin(int [] a,int startindex,int minSofar) {
		if(startindex==a.length) {
			System.out.println(minSofar);
			return;
		}
		
		if(a[startindex]<minSofar) {
			minSofar=a[startindex];
		}
		
		printMin(a, startindex+1, minSofar);
		
	}

}
