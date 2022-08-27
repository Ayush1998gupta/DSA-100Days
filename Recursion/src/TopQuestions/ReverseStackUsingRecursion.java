package TopQuestions;

import java.util.Stack;

public class ReverseStackUsingRecursion {

	private static void insertAtBottom(Stack<Integer> stack, int ele) { 
		if (stack.isEmpty()) { 
			stack.push(ele); 
			return; 
		}    
		int top = stack.pop(); 
		insertAtBottom(stack, ele);  
		stack.push(top); 
	}

	public static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty()) { 
			return;  
		}     
		int top = stack.pop();  
		reverseStack(stack);  
		insertAtBottom(stack, top);
	}

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();

		stack.add(1);
		stack.add(2);
		stack.add(3);
		System.out.println(stack);
		reverseStack(stack);
		System.out.println(stack);
	}

}
