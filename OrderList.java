package com.bridgelabz.datastructure;
import java.io.*;
import java.util.*;
public class OrderList 
{
	public static void main(String[] args) throws IOException 
	{
		OrderList ol = new OrderList();
		ol.calOrderList();
	}
	public void calOrderList() throws IOException
	{
		LinkedList<String>  list=new LinkedList<String>();
		Scanner scanner =new Scanner(System.in);
		FileReader fr=null;
		File file =new File("/home/bridgeit/file5.txt");
		fr= new FileReader(file);
		String integersArray[]=null;
		BufferedReader bufferedReader = new BufferedReader(fr);
		String s;
		while((s=bufferedReader.readLine())!=null){    	
			integersArray = s.trim().split(" ");
		}
		fr.close();
		FileWriter fileWriter = new FileWriter("/home/bridgeit/file5.txt");
		try 
		{
			System.out.println("Before Sorting");
			for (String numbers: integersArray) 
			{
				list.add(numbers);
				System.out.println(numbers);
			}
			System.out.println("Enter the number to serch in list");
			String search=scanner.nextLine();

			if(list.contains(search)) 
			{
				list.remove(search);
			} 
			else
			{
				list.add(search);

			}
			Collections.sort(list);
			String words="";
			for(String num:list)
			{
				words=words+" "+num;
			}  
			list.sort(null);
			System.out.println(list);
			fileWriter.write(words);
			fileWriter.flush();
			fileWriter.close();
			scanner.close();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}	
}


