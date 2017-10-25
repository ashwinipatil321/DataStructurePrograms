package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class HasingFunction {
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		BufferedReader br=null;
		FileReader fread = null;
		String str=null;
		File file = new File("/home/bridgeit/file6.txt");
		fread = new FileReader(file);
		br = new BufferedReader(fread);
		str=br.readLine();
			String stringArray[]=str.trim().split(" ");
		try {
			for (String stg: stringArray) {
				list.add(Integer.parseInt(stg));
				System.out.println(".........."+stg);
	   }
		}
		catch (NumberFormatException e){
			e.printStackTrace();
	       System.out.println(""); 
	   } 
		HashMap<Integer, LinkedList<Integer>> hashMap = new HashMap<Integer, LinkedList<Integer>>();
		for (Integer intg : list) {
			int rmdr = intg % 11;
			 System.out.println(rmdr);
			LinkedList<Integer> linkedList2 = hashMap.get(rmdr);
			if(linkedList2==null)
			{
				linkedList2=new LinkedList<Integer>();
				hashMap.put(rmdr, linkedList2);
			}
			linkedList2.add(intg);
		}
		br.close();
		fread.close();
		
	}
}
		
	
	


 
