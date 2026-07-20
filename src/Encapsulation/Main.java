package Encapsulation;

public class Main {
    public static void main(String[] args) {
         
         Library l = new Library();
         
         l.setID(8978);
         System.out.println("Book ID: " + l.getID());
         
         l.setBookName("Java Book for Everyone");
         System.out.println("Book name: " + l.getBN());
    }
}
