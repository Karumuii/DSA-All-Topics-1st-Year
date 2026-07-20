package MultiDimensional_Array;
import java.util.*;
public class MultiD_arr_withVAlue {
   public static void main(String[] args) {
       // Single Dimensional Array
        int a[] = {45,56,67};
        System.out.println(a[2]);
         
        // Multi-Dimentional Array
        int num[][] = {{1,2,3}, {4,5,6}};
          
        System.out.println(num[0][1]);
        System.out.println(Arrays.deepToString(num)); //used for MultiDimension

        System.out.println(num[1][0] + num[0][0]); // 5

         
         
    }
}




