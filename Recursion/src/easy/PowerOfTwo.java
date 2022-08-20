package easy;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		if(n<=0){
			return false;
		}
		if(n==1){
			return true;
		}
		System.out.println(n);
		if(n%2!=0) {
			return false;
		}else {
			return isPowerOfTwo(n/2);
		}
	}

}
