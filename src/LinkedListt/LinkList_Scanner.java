package LinkedListt;
import java.util.*;
public class LinkList_Scanner {
         static int data; //Global variable = accessable to all method (see line 42)
         
        public static class SinglyLinkedList{
        private Node Head; // pointer

        private class Node{ //METHOD FOR A NODE
            int data;
            Node next; //nextAddress

            Node(int data){
                //First Node
                this.data = data;
                this.next = null;
            }
        }
            public void insertAtBeginning(int data){
                Node newNode = new Node(data);
                newNode.next = Head;
                Head = newNode;
            }
            public void printLinkedList(){ //Print Method
                Node current = Head;
                // stops when null
                while (current != null){
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("Null");
            }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        
        System.out.print("Please Input 5 Data: ");
        
        for (int i  = 0; i < 5; i++){
            list.insertAtBeginning(data = sn.nextInt());
        }
        list.printLinkedList();
        
        /*
        Process:
        
        Stack - LIFO
        Queue - FIFO
        
        1. Create a class to manage all the methods of insertion and print
        2. Starting the Pointer
        3. Create a class node
        4. Create a constructor to set a starting value
        5. Create a method to insert a value at the beginning
            5.5 Create an object for new Node
        
        */
    }
}




