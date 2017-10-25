package com.bridgelabz.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses
{
	static String exp;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Expression :");
		exp=scanner.next();
		checkBalance(exp);
		scanner.close();
		System.out.println(BalancedParentheses.checkBalance(exp));
	}
	public static String checkBalance(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') 
			{
				stack.push(ch);
			}
			else if ((ch == ']' || ch == '}' || ch == ')') && (!stack.isEmpty())) 
			{
				if (((char) stack.peek() == '(' && ch == ')')
						|| ((char) stack.peek() == '{' && ch == '}')
						|| ((char) stack.peek() == '[' && ch == ']')) {
					stack.pop();
				} 
				else
				{
					return "Not Balanced";
				}
			}
			else 
			{
				if ((ch == ']' || ch == '}' || ch == ')')) {
					return "Not Balanced";
				}
			}
		}
		if (stack.isEmpty())
		{
			return "Balanced Parenthisis";
		}
		else
		{
			return "Not Balanced";
		}
	}

}





