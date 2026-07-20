package MultiDimensional_Array;

import java.util.*;

public class MultiD_Arr_UserInput {
   public static void main(String[] args) {
         
        Scanner sn = new Scanner(System.in);

        System.out.print("Input Row Size: ");
        int rowsize = sn.nextInt();

        System.out.print("Enter the Column Size: ");
        int colsize = sn.nextInt();
        sn.nextLine();

        int num[][] = new int [rowsize][colsize];

        System.out.println(Arrays.deepToString(num));

        // Nested Loop Here
        // My style:
        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {
                System.out.print("Enter value for row " + i + ", column " + j + ": ");
                num[i][j] = sn.nextInt();
            }
        }

        // Print the final array
        System.out.println("Final array:");
        System.out.println(Arrays.deepToString(num));

         
         
    }
}




