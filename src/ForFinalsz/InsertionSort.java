package ForFinalsz;

import java.util.Arrays;

public class InsertionSort {
   public static void main(String[] args) {
         
         int numbers[] = {3, 87, -1, 0, 32};
        System.out.println("Orig Array: " + Arrays.toString(numbers));
        
        insertSort ins = new insertSort();
        ins.sort(numbers);
        ins.printArr(numbers);
        
         
    }
   public static class insertSort {
       void sort (int numbers[]){
           int n = numbers.length;
           
           for (int i = 1; i < n; i++){ //index 1 value of 87
               int temp = numbers[i];
               int j = i - 1; // 0
               
               //for loop is used when how many you can iterate
               while (j >= 0 && numbers[j] > temp){ //Response is true when both condition is true if one is false it will not proceed. Opposite with the OR 
                   // Shifting:
                   numbers[j + 1] = numbers[j];
                   j = j - 1; // to backward, 0 - 1 = -1 
               }
               numbers[j + 1] = temp; //to make the j at the 0 index    
           }
       }
       static void printArr(int numbers[]){
           System.out.print("Sorted Array: ");
           for (int arr : numbers){
               System.out.print(arr + " ");
           }
       }
   }
}




