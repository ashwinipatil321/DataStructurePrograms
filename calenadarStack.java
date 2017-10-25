package com.bridgelabz.datastructure;

import com.datastructure.utility.Utility;

public class calenadarStack
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		int i; 
		int month,year;
		LinkedListStack list = new  LinkedListStack();
		System.out.println("Enter The Month:");
		month=utility.inputInteger();
		System.out.println("Enter the year:");
		year=utility.inputInteger();
		String[] months = {"January", "February", "March","April", "May", "June","July", "August", "September",
				"October", "November", "December"};
		int[] days={ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2 && utility.isLeapYear(year)) days[month] = 29;
		System.out.println("   " + months[month] + " " + year);;
		System.out.println(" S  M Tu  W Th  F  S");
		int d = utility.day(month, 1, year);

		for (i = 1; i <= days[month]; i++)
		{
			list.addLast(i);
			//System.out.println(i);
			
		}
		
		list.display();
	}


}
