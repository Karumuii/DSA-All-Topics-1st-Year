package LinkedListt;
public class doublyLinkedList {
    
    private Node head;
    private Node tail;
    public int size;
    
    private static class Node { //class node
        int data;
        Node prev;
        Node next;
        
        Node (int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
            
        }
    }
    public doublyLinkedList (){//constractor
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public static void main(String[] args) {
      doublyLinkedList l = new doublyLinkedList();  
      
      l.insertAtBeginning(34);
      l.insertAtBeginning(56);
      l.insertAtBeginning(11);
      l.insertAtBeginning(88);
      
      l.dislayForward();
      l.displayBackward();
      
      l.delete(56);
      l.dislayForward();
      
      l.insertAtEnd(1);
      l.insertAtEnd(2);
      l.insertAtEnd(3);
      l.dislayForward();
      
      l.deleteAt(0);//index
      l.dislayForward();
      
      l.insertAfter(2, 245);
      l.dislayForward();
      l.displayBackward();
      
      System.out.println("length: " + l.length());
      
      
    }
    public void insertAtBeginning (int data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next= head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }    
    public void dislayForward() {
        Node current = head;
        if(current == null) {
            System.out.println("LIST IS EMPTY.");
            return;
        }
        System.out.println("Doubly Linked List (forward) :");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public void displayBackward () {
        Node current = tail;
        if (current == null) {
            System.out.println("list is empty.");
            return;
        }
        System.out.println("Doubly Linked list (backward) :");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    public void delete(int data){
        Node current = head;
        
        if (head == null) {
            return;
        }
        
        if (head.data == data) {
            head = head.next;
            if(head != null) {
                head.prev = null;
            }
            else {
                tail = null;
            }
            size--;
            return;
        }
        
        while (current != null) {
            if (current.data == data) {
                if (current.next == null) {
                    tail = current.prev;
                    tail.next = null;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
        System.out.println(data + " not found in the list. ");
    }
    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    private void deleteAt (int position) {
        if (position < 0 || position >= size || head == null) {
            System.out.println("Invalid position or empty list");
            return;
        }
        
        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            else {
                tail = null;
            }
        }
        else {
            Node current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            if(current.next==null) {
                tail = current.prev;
                tail.next=null;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size --;
    }
    public int length() {
        return size++;
    }
    private void insertAfter (int prevData, int data) {
        if (head == null) {
            System.out.println("list is empty. Cannot insert.");
            return;
        }
        
        Node current = head;
        while (current != null){
            if (current.data == prevData) {
                Node newNode = new Node(data);
                newNode.prev = current;
                newNode.next = current.next;
               
            if (current.next !=null) {
                current.next.prev = newNode;
            }else{
                tail = newNode ;
            }
            current.next = newNode;
            return;
            }
            current = current.next;
        }
        size++;
        System.out.println("Node with data " + prevData + "not found.");
    }
    
}
