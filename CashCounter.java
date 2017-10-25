package com.bridgelabz.datastructure;
import java.util.LinkedList;
import java.util.Scanner;
import com.datastructure.utility.Utility;
public class CashCounter {
	static int  amount=10000;
	static int finalBalance=0;
	public static void main(String args[])
	{
		operationCashCounter();
	}	
	public static void operationCashCounter()
	{
		Utility u=new Utility();
		int ch = 0;
		boolean isChoice=true;
		LinkedList<String> linkedList=new LinkedList<String>();
		LinkedList<String>linkedList1=new LinkedList<String>();
		Scanner scanner=new Scanner(System.in);
		while(isChoice)
		{
			System.out.println("you want to queue:");
			String userChoice=scanner.nextLine();
			if(userChoice.equals("y")) {
				System.out.println("Enter your name:");
				String name=scanner.nextLine();
				linkedList.addLast(name+" "+amount);
			} 
			else
			{
				isChoice=false;
			}
		}
		do
		{ 
			if(!linkedList.isEmpty()) {
				System.out.println();
				System.out.println("------------Banking Cash Counter-----------");
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Number of people in the Queue ");
				System.out.println("4.Exit");
				System.out.println();
				System.out.println("Enter your choice: ");
				int choice=u.inputInteger();
				switch (choice) 
				{
				case 1:

					System.out.println("Enter the amount you want to Deposit");
					int money=scanner.nextInt();
					String temp=linkedList.removeFirst();
					String [] valus=temp.split(" ");
					finalBalance=money+Integer.parseInt(valus[1]);
					String user=valus[0]+" "+finalBalance;
					linkedList1.addFirst(user);
					break;
				case 2:
					System.out.println("Enter the amount you want to Withdraw ");
					int money1=scanner.nextInt();
					String temp1=linkedList.removeFirst();
					String [] values=temp1.split(" ");
					finalBalance =	Integer.parseInt(values[1])-money1;
					String user1=values[0]+" "+finalBalance;
					linkedList1.addFirst(user1);
					System.out.println(" Your Available Balance is: "+finalBalance); 
					break;
				case 3:
					int size=linkedList.size();
					System.out.println("The Number of People in Queue is: "+size);			
				case 4:
					System.exit(0);
				default: 
					System.out.println("You entered wrong choice");
					break;
				}            
			}
			else 
			{
				System.out.println("queue is empty: ");
				ch='n';
			}
		}
		while (ch == 'Y'|| ch == 'y'); 
		for(String user:linkedList1)
		{
			System.out.println(user );
		}
		scanner.close();
	}

}




