package com.bridgelabz;
import java. util.*;
public class UC1createLL {
	 Node head;
	    class Node {
	        String data; // initialising data in first location
	        Node next;   // initialising next in node class

	        Node(String data){
	            this.data = data;
	            this.next = null;
	        }
	    }
	    //Adding the data in first position
	    public void addFirst(String data){
	        Node newNode = new Node(data); // Making object of node class
	        if(head == null){              // Checking if linked list is empty
	            head = newNode;
	            return;
	        }
	        newNode.next = head;
	        head = newNode;
	    }

	    public static void main(String[] args) {
	        UC1createLL obj = new UC1createLL();

	        obj.addFirst("56");
	        obj.addFirst("30");
	        obj.addFirst("70");
	    }
	}