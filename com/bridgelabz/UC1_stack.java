package com.bridgelabz;

public class UC1_stack {

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
    public void Push(String data){
        Node newNode = new Node(data); // Making object of node class
        if(head == null){              // Checking if linked list is empty
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // deleting the first element
    public void Pop(){
        if(head == null){
            System.out.println(" the list is empty");
            return;
        }
        head = head.next;
    }

    //Printing the code
    void Print() {
        if (head == null) {                                  // Checking f head is empty or not
            System.out.println("stack list is empty...");
            return;
        }
        Node tempNode = head;                                 // Taking temp node
        while (tempNode != null) {                          // Running the temp node throughout the linked list
            System.out.print(tempNode.data + "-");         // Printing temp node data
            tempNode = tempNode.next;                       // Storing next node in temp data
        }
    }

    public static void main(String[] args) {
        UC1_stack ob2 = new UC1_stack();
        ob2.Push("70");
        ob2.Push("30");
        ob2.Push("56");
        ob2.Pop();
        ob2.Print();
    }

	
}
