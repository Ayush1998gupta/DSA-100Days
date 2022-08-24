package Medium;

import java.util.ArrayList;
import java.util.List;


public class Keypad {

	public static List<String> keypad(int num){
		List<String> output=new ArrayList<String>();

		if(num==0) {
			output.add("");
			return output;
		}

		List<String> smallop=keypad(num/10);

		switch (num%10) {
		case 2:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'a');
				output.add(smallop.get(i)+'b');
				output.add(smallop.get(i)+'c');
			}
			break;
		case 3:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'d');
				output.add(smallop.get(i)+'e');
				output.add(smallop.get(i)+'f');
			}
			break;
		case 4:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'g');
				output.add(smallop.get(i)+'h');
				output.add(smallop.get(i)+'i');
			}
			break;
		case 5:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'j');
				output.add(smallop.get(i)+'k');
				output.add(smallop.get(i)+'l');
			}
			break;
		case 6:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'m');
				output.add(smallop.get(i)+'m');
				output.add(smallop.get(i)+'o');
			}
			break;
		case 7:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'p');
				output.add(smallop.get(i)+'q');
				output.add(smallop.get(i)+'r');
				output.add(smallop.get(i)+'s');
			}
			break;
		case 8:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'t');
				output.add(smallop.get(i)+'u');
				output.add(smallop.get(i)+'v');
			}
			break;
		case 9:	
			for (int i = 0; i < smallop.size(); i++) {
				output.add(smallop.get(i)+'w');
				output.add(smallop.get(i)+'x');
				output.add(smallop.get(i)+'y');
				output.add(smallop.get(i)+'z');
			}
			break;
		default:
			break;
		}
		return output;
	}

}




