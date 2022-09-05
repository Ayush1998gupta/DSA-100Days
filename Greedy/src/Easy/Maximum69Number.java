package Easy;



public class Maximum69Number {

	public static int maximum69Number (int num) {
		String s = Integer.toString(num);
		char[] ch = s.toCharArray();
		for(int i=0; i< ch.length; i++) {
			if(ch[i] == '6') {
				ch[i]='9';
				return Integer.parseInt(String.valueOf(ch));
			}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(maximum69Number(69));

	}
}
