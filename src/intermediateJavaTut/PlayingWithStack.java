package intermediateJavaTut;

import java.util.Stack;

public class PlayingWithStack {
	
	public static void main(String[] args) {
		Stack<String> stack= new Stack<String>();
		stack.push("up");
		printStack(stack);
		stack.push("down");
		printStack(stack);
		stack.push("left");
		printStack(stack);
		stack.push("right");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	private static void printStack(Stack<String>s)
	{
		if(s.empty()) {
		System.out.println("It is already empty bruh!");
		}
		else
			System.out.println(s);
		}
	}
