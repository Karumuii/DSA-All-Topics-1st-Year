package ForFinalsz;
// Explained: https://youtu.be/EwjnF7rFLns
import java.util.Arrays;

public class SelectionSort_Me {
   public static void main(String[] args) {
         
         /* Selection sort = search through array and keep track of the minimum
            value during each iteration. At the end of each iteration, we swap variables
         
            small datasets = okay
            large datasets = bad 
         */
         
         int arr[] = {2, 1, 6, 9, 4, 3, 5};
         
         
         System.out.println("Original : " + Arrays.toString(arr));
         
         selectionsort(arr);
         
         System.out.println("Sorted: " + Arrays.toString(arr));
         
         
         //selectionsort = ob = new selectionsort();
         //ob.printArr(arr);
    }
       // Public class selectionsort {
       public static void selectionsort (int arr[]){
           // void sort (int arr[]) {

           for (int i = 0; i < arr.length - 1; i++){
               int min = i; //Find the minimum in the unsorted Array
               for (int j = i + 1; j < arr.length; j++){
                   if (arr[min] > arr[j]){ // change the '>' to make it into a descending order
                       min = j;
                   }
               }
               // Swapping the found element with the first element
               int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
           }

       }
       void printArr (int arr[]){ // Kinda Optional, use this if only the sort is a class
           System.out.print("Sorted Array: ");
           for (int p : arr){ //for each 
               System.out.println(p + " ");
           }
           
           /* for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
                System.out.println();
           */
       }
}




