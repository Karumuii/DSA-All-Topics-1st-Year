package Insertion_Array;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
      
        /*
        Algorithm or Process
        1. Declare initialized the original array
        2. Print the Original Array
        3. Get the length of the original array
        4. Create a new array with new one xtra space
        5. Assign the value to be inserted
        6. Copy elements from old array to new array
        7. Insert the new value at the last position
        8. print/display
        */
        // old array is reference
        int numbers[] = {1,2,3,4,5};

        System.out.println("The old Array: " + Arrays.toString(numbers));

        int n = numbers.length;
        int newarr[] = new int[n+1]; // +1 because insertion = 6
        // newarr holds the new value

        // value that is gonna be inserted in the array
        int value = 20;

        // for loop = traversal
        for (int i = 0; i < n; i++){
            newarr[i] = numbers[i];
        }
        // last position
        newarr[n] = value;

        System.out.println("The new array: " + Arrays.toString(newarr));

    }
}




