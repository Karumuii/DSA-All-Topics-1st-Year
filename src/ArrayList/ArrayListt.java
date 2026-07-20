package ArrayList;
import java.util.*;
public class ArrayListt {
   public static void main(String[] args) {
         
        ArrayList<String> names = new ArrayList<>(); // an import
        names.add("Trex");  
        names.add("Trish");
        names.add("Alex");

        names.set(1, "Adonis");

        //   uses index
        System.out.println("Getting an specific name by index: " + names.get(1)); //
        
       // names.remove(1);//remove adonis
        
        System.out.println( names.contains("Adonis")); //checks if adonis is in the list
        System.out.println(names);
            
        /*
        
        add
        set
        remove
        get - uses sout
        contains - uses sout and is a boolean 
        
        */
       
         
         
    }
}




