package com.bridgelabz.datastructure;
import java.util.ArrayDeque;
import java.util.Deque;
import com.datastructure.utility.Utility;
public class PalindromChecker
{
	public static void main(String[] args) 
	{
		PalindromChecker pc = new PalindromChecker();
		pc.calPalindromChecker();
	}
	public void calPalindromChecker()
	{
		Deque deque = new ArrayDeque();
		Utility utility = new Utility();
		System.out.print("Enter any string:");
		String inputString = utility.inputString();
		for (int i = inputString.length()-1; i >=0; i--) 
		{
			deque.addFirst(inputString.charAt(i));
		}

		String reverseString = "";

		while (!deque.isEmpty()) {
			reverseString = reverseString+deque.removeLast();
		}
		System.out.println("Reverse String is:"+ reverseString);
		if (inputString.equals(reverseString))
		{
			System.out.println("The input String is a palindrome.");
		}
		else
		{
			System.out.println("The input String is not a palindrome.");
		}

	}

}


