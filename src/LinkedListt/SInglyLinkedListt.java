package LinkedListt;
import java.util.*;
public class SInglyLinkedListt {
    static int data;
    
    public static class SinglyLink{
    private Node Head;
    
    public class Node{
        int data;
        Node next;
       
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtStart(int data){
        Node newNode = new Node(data);
        
        newNode.next = Head;
        Head = newNode;
    }
    public void display (){
        Node current = Head;
        
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
 }   
    
    
   public static void main(String[] args) {
         
         SinglyLink list = new SinglyLink();
         Scanner sn = new Scanner(System.in);
         
       /*  System.out.print("Size: ");
         int size = sn.nextInt(); */
         
         System.out.print("Insert 5 Data: ");
         for (int i  = 0; i < 5; i++){
             list.insertAtStart(data = sn.nextInt());
         }
         list.display();
         
    }
}




