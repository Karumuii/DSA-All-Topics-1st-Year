package LinkedListt;

public class circularLinkedList {
    
    private Node head;
    private Node tail;
    private int size;
    
    private static class Node { //class node
        int data;
        Node next;
        
        Node (int data) {
            this.data = data;
            this.next = null;
            
        }
    }
    public circularLinkedList () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }             
    public void traverse(){
       if (head == null) {
           return;
       } 
       Node current = head;
       do {
           System.out.print(current.data + " ");
           current = current.next;
         }while (current != head);
        System.out.println();
    }
    public static void main(String[] args) {
         circularLinkedList l = new circularLinkedList();
         
         l.insert(1);
         l.insert(2);
         l.insert(3);
         l.insert(4);
         l.traverse();
         
         l.insertAt(44,3);//value, index
         l.traverse();
         
         l.delete(2);//value
         l.traverse();
         
         l.deleteAt(2);//index
         l.traverse();
         
         System.out.println("length:" + l.length());
    }
    private void insert (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }
    public void insertAt(int data, int position) {

    if (position < 0) {
        position = 0;
    }

    if (position > size) {
        position = size;
    }
    
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        tail = newNode;
    }

    else if (position == 0) {
        newNode.next = head;
        head = newNode;
    }

    else if (position == size) {
        tail.next = newNode;
        tail = newNode;
    }

    else {
        Node current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    size++;
}
  public void delete(int data) {
        if (head == null) {
            return;
        }
        Node current = head;
        Node previous = null;
        
        do {
            if (current.data == data) {
                if (current == head) {
                    if (size == 1) {
                        head = null;
                        tail = null;
                    }
                    else {
                        head = head.next;
                        tail.next= head;
                    }
                }else{
                    previous .next = current.next;
                    if (current == tail) {
                        tail = previous;
                        tail.next= head;
                    }
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }while (current != head);
        System.out.println(data + " not found in the list");
  }
    public void deleteAt(int position) {
     if (head == null || position < 0 || position >= size) {
         System.out.println("invalid [position or empty list");
         return;
     }
     
     if (position == 0) {
         if (size == 1) {
             head = null;
             tail = null;
         }else {
             head = head.next;
             tail.next = head;
         }
     }else{
         Node current = head;
         Node previous = null;
         for (int i = 0; i < position; i++) {
             previous = current;
             current = current.next;
         }
         previous.next = current.next;
         if(current == tail) {
             tail = previous;
             tail.next = head;
         }
     }
    size --;
 }
    public int length() {
        return size;
        }
    
}