package Deletion;
import java.util.*;
public class Deletion {
   public static void main(String[] args) {
    /*
      1. Create Original Array
      2. Print the Original Array
      3. Create a new array with reduced size
      4. Set the value of the target to delete
      5. Traversal
      6. Validation
      7. Display

        Insertion = e + 1
        Deletion = e - 1

    */
        int num[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(num));

        int newarr[] = new int [num.length - 1];
 
        int indextarget = 2;

   
        for(int i = 0, j = 0; i < num.length; i++){
            if (i != indextarget){
                newarr[j] = num[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newarr));

    }
}





