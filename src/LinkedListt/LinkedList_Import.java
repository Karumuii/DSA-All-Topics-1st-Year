package LinkedListt;

import java.util.LinkedList;
//From IntelliJ
public class LinkedList_Import {
   public static void main(String[] args) {
         
         //  LinkedList<String> list2 = new LinkedList<>(); // Specific
        LinkedList list = new LinkedList(); //Not Specify
        LinkedList listt = new LinkedList();

     //   list.add("list");
     //   list.add(1);

        list.push("try");
        list.push("fry");
        list.push("Jack");
        System.out.println(list); // Stack - LIFO

        listt.offer("try");
        listt.offer("fry");
        listt.offer("Jack");
        System.out.println(listt); //Queue - FIFO

        

    }
}




