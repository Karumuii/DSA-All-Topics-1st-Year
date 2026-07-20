package LinkedListt;

public class LinkList {
         static int data;
         
        public static class SinglyLinkedList{
        private Node Head; // pointer
        
        private class Node{
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
            public void printLinkedList(){
                Node current = Head;
                // stops when null
                while (current != null){
                    System.out.println(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("Null");
            }
        }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insertAtBeginning(23);
        list.insertAtBeginning(4);
        list.printLinkedList();

    }
}




