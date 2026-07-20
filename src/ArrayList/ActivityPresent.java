package ArrayList;

import java.util.ArrayList;

public class ActivityPresent {
   public static void main(String[] args) {
         
         ArrayList<String> studentnames = new ArrayList<>();
         studentnames.add("Alice");
         studentnames.add("Brian");
         studentnames.add("Fred");
         studentnames.add("Carlo");
         
         studentnames.add(1, "Diana");
         studentnames.remove("carlo");
         
         studentnames.remove(1);
         
         studentnames.add("Diana");
         
         studentnames.set(3, "Dianne");
         System.out.println(studentnames);
         
         System.out.println("Max index is equal to 3 and the length is equal to 4");
         
         
    }
}




