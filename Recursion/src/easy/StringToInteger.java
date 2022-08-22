package easy;

public class StringToInteger {

	public static int convertStringToInt(String str){
		if(str.length()==1) {
			return str.charAt(0)-'0';
		}
		
		int smallop=convertStringToInt(str.substring(1));
		
		int strlength=str.length()-1;
		
		int ans=(int) ((Math.pow(10, strlength)*(str.charAt(0)-'0'))+smallop);
		
		return ans;

	}

	public static void main(String[] args) {
		int p=convertStringToInt("00123");
		System.out.println(p);
	}
}
