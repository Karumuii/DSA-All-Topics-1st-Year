package Insertion_Array;

import java.util.Arrays;

public class insertion_specific {
     public static void main(String[] args) {
   /*
        1. declare and initialize the original array
        2. Print the Original Array
        3. Get the length of the original array
        4. Set the index value
        5. Create a new array with extra one space
        6. Initialize Helper variable = initialize variable for index of original array
        7. Traversal = for each element
        8. Validation
     */

        int number[] = {2,3,4,8,10};

        System.out.println(Arrays.toString(number));
        int element = number.length;

        // Index where u want to insert the number
        int index = 0;

        int newarr [] = new int [element + 1];
        // Original Array representation
        int help = 0;

        // i = new array
        for(int i = 0; i < newarr.length; i++){
            if (i == index){
                newarr[i] = 81;
            } else { //transmit original to new
                newarr[i] = number[help];
                help++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    /* Search Algorithm
        Liner search
                Binary Search */


    }
}



