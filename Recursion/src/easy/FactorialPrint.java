package easy;

public class FactorialPrint {

	public static void factorial(int num,int ans) {
		if(num==0) {
			System.out.println(ans);
			return;
		}
		ans=ans*num;
		factorial(num-1, ans);
	}
	
	public static void main(String[] args) {
		factorial(6, 1);
	}

}
