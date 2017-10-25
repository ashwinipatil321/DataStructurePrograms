package com.bridgelabz.datastructure;
public class LinkedListStack
{
	Node head; 
	class Node
	{
		int data;
		Node next;
		Node(int d) 
		{
			data = d; next = null;
		}
	}
	public void addLast(int new_data)
	{
		Node new_node = new Node(new_data);
		if (head == null)
		{
			head = new Node(new_data);
			System.out.println(" "+new_data);
			
		}
		new_node.next = null;
		Node last = head; 
		while (last.next != null)
		{
			last = last.next;
			last.next = new_node;
			System.out.println("while loop"+new_data);
			return;
		}
	}
	public  void display()
	{
		Node tnode = head;
		while (true)
		{
			System.out.print(tnode.data+" ");
			tnode = tnode.next;
		}
	}

	public void removeFirst()
	{
		if (head == null)
		{
			return;
		}
		else {
			head = head.next;
		}
	}

	@Override
	public String toString() {
		return "LinkedListStack [head=" + head + "]";
	}


}



