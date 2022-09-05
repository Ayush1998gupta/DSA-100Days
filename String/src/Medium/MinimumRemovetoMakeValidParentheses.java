package Medium;

import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
	public static String minRemoveToMakeValid(String s) {

		Stack<Integer> stack=new Stack<>();
		char[] ch = s.toCharArray();
		
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='(') {
				stack.push(i);
			}else if(ch[i]==')') {
				if(stack.size()==0) {
					ch[i]='.';
				}else {
					
					stack.pop();
				}
			}
		}
		
		while(stack.size()>0) {
			ch[stack.pop()]='.';
		}
		
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='.') {
				sb.append(ch[i]);
			}
		}

		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
	}
}
