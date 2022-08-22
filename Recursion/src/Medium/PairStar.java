package Medium;

public class PairStar {

	
	public static String addStars(String s) {
		
//		Base case
		if(s.length()==0 || s.length()==1) {
			return s;
		}
		
		String smallo=addStars(s.substring(1));
		
		if(s.charAt(0)==s.charAt(1)) {
			smallo=s.charAt(0)+"*"+ s.charAt(1)+smallo.substring(1);
		}

		else {
			smallo=s.charAt(0)+smallo;
		}
		return smallo;
		

	}
	public static void main(String[] args) {
		System.out.println(addStars("hhellow"));
	}

}
