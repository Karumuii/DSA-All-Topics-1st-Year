package Inheritance;
// 2/11/26
public class Main {
    public static void main(String[] args) {
         
         hasAccount acc = new hasAccount();
         Guest g = new Guest();
         
         acc.welcome();
         System.out.println("The user's ID is: " + acc.id);
         
         g.welcome();
         System.out.println("The user's ID is: " + g.id);
         
         
    }
}
