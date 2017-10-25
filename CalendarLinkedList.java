package com.bridgelabz.datastructure;

import java.util.LinkedList;

import com.datastructure.utility.Utility;

public class CalendarLinkedList 
{ 
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		Utility utility = new Utility();
		int month,year;
		System.out.println("Enter The Month:");
		month=utility.inputInteger();
		System.out.println("Enet the year:");
		year=utility.inputInteger();
		String[] months = {"","January", "February", "March","April", "May", "June","July", "August", "September",
				"October", "November", "December"};
		int[] days={ 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2 && utility.isLeapYear(year)) days[month] = 29;
		System.out.println("   " + months[month] + " " + year);;
		System.out.println("S  M Tu  W Th  F  S");
		int d = utility.day(month, 1, year);
		for (int i = 0; i <= days[month]; i++) 
		{
			String str=Integer.toString(i);
			list.add(str);
		}

		for (int i = 0; i < d; i++)
			System.out.print("  ");
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[month]))  
			System.out.println();
		}
	}
}


