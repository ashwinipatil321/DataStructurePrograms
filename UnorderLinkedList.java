package com.bridgelabz.datastructure;
import java.io.*;
import java.util.*;
public class UnorderLinkedList 
{
	public static void main(String[] args) throws IOException 
	{
		UnorderLinkedList ulist = new UnorderLinkedList();
		ulist.calUnorderLinkedList();
	}
	public void calUnorderLinkedList()
	{
		try {
			File file=new File("/home/bridgeit/file4.txt");
			boolean mark=false;
			BufferedReader buffer=new BufferedReader(new FileReader(file));
			Scanner scanner=new Scanner(System.in);
			String words=buffer.readLine();
			FileWriter pw = new FileWriter("/home/bridgeit/file4.txt");
			String[] str1=words.trim().split(" ");
			for(int i=0;i<str1.length;i++)
			{
				System.out.println(str1[i]);
			}
			LinkedList<String> list=new LinkedList<String>();
			System.out.println("Enter the String to search...");
			String search=scanner.next();
			for(int i=0;i<str1.length;i++)
				list.add(str1[i]);
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).equals(search))
				{
					list.remove(i);
					mark=true;
				}
			}
			if(mark==true)
			{
				for(int i=0;i<list.size();i++)
				{
					String str2=(String)(list.get(i))+" ";
					pw.write(str2);
					pw.flush();
				}
				return;
			}
			if(mark==false)
				list.add(search);         
			for(int i=0;i<list.size();i++) 
			{
				String str11=(String) list.get(i)+" ";
				pw.write(str11);
				pw.flush();
			}
			buffer.close();   
			scanner.close();
			pw.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}


	}
}
