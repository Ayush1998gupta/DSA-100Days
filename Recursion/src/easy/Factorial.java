package easy;

public class Factorial {

	public static int factorial(int n) {
		//		base case
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);	
	}

}
