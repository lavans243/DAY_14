package com.bridgelabz;

public class UC8Insert {
	
	class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	

	Node head;
	
	public void addFirst(int data) 
	{
		Node newnode = new Node(data);

		if(head == null)
		{
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	
	public void addLast(int data)
	{
		Node newnode = new Node(data);
		Node tempnode = head;

		if(head == null)
		{
			head = newnode;
			return;
		}
		
		while(tempnode.next != null)
		{
			tempnode = tempnode.next;
		}
		tempnode.next = newnode;
	}
	
	public void add(int data,int index)
	{
		int i = 1;
		Node newnode = new Node(data);
		Node prevnode = head;
		Node tempnode = head.next;
		
		if(head == null) {
			addFirst(data);
			return;
		}

		while(tempnode != null)
		{
			if(i == index)
			{
				prevnode.next = newnode;
				newnode.next = tempnode;
				return;
			}
			else
			{
				i++;
				prevnode = prevnode.next;
				tempnode = tempnode.next;
			}
		}
		
		addLast(data);
	}
	
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List empty nothing to remove!");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("List empty nothing to remove!");
		}
		Node secondLast = head;
		Node last = head.next;
		
		while(last.next != null)
		{
			secondLast = secondLast.next;
			last = last.next;
		}
		secondLast.next = null;
	}
	
	public int search(int data)
	{
		if(head == null)
		{
			System.out.println("List is empty!");
			return 0;
		}
		Node tempnode = head;
		int i=1;
		while(tempnode != null)
		{
			if(tempnode.data == data)
			{
				System.out.println(data + " present in linked list");
				return i;
			}
			else {
				tempnode = tempnode.next;
				i++;
			}
		}
		System.out.println(data + " element is not present!");
		return 0;
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Linked List ie ");
		}
		Node tempnode = head;
		
		while(tempnode.next != null)
		{
			System.out.print(tempnode.data + "=>");
			tempnode = tempnode.next;
		}
		System.out.println(tempnode.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UC8Insert li = new UC8Insert();

		li.addLast(56);
		li.addLast(70);
		li.display();
		li.add(30, 1);
		li.display();
		int ind = li.search(30);
		li.add(40, ind);
		li.display();
	}

}
