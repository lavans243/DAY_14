package com.bridgelabz;

public class UC4_Dequeue_pop {
	
	 Node head;
	    public class Node {
	        String data; // initialising data in first location
	        Node next;   // initialising next in node class

	        Node(String data){
	            this.data = data;
	            this.next = null;
	        }
	    }
	    //Adding the data in first position
	    public void enQueu(String data){
	        Node newNode = new Node(data); // Making object of node class
	        if(head == null){              // Checking if linked list is empty
	            head = newNode;
	            return;
	        }
	        newNode.next = head;
	        head = newNode;
	    }

	    // Deleting the last element
	    public void deQueue(){
	        if(head == null){
	            System.out.println(" the list is empty");
	            return;
	        }
	        if(head.next == null){
	            head= null;
	            return;
	        }
	        Node secoundLast = head;
	        Node lastNode = head.next;
	        while(lastNode.next != null){
	            lastNode = lastNode.next;
	            secoundLast = secoundLast.next;
	        }
	        secoundLast.next= null;
	    }

	    //Printing the code
	    void Print() {
	        if (head == null) {                                  // Checking f head is empty or not
	            System.out.println("Linked list is empty...");
	            return;
	        }
	        Node tempNode = head;                                 // Taking temp node
	        while (tempNode != null) {                          // Running the temp node throughout the linked list
	            System.out.print(tempNode.data + "-");         // Printing temp node data
	            tempNode = tempNode.next;                       // Storing next node in temp data
	        }
	    }

	    public static void main(String[] args) {
	        UC4_Dequeue_pop ob2 = new UC4_Dequeue_pop();
	        ob2.enQueu("70");
	        ob2.enQueu("30");
	        ob2.enQueu("56");
	        ob2.deQueue();
	        ob2.Print();
	    }
	}


