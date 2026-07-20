package ForFinalsz;
// Detailed Explnation: https://youtu.be/8mJ-OhcfpYg?si=yZNiZybswqCxoLex
public class Insertion_Sort_ME {
   public static void main(String[] args) {
         
         // A simple algorithm that places each element from an unsorted list into its
        // correct position in the sorted part of the list.
        
        // Start with the second element unlike the BubbleSort who starts in the First Element
        //Compare the second element with the first; if it's smaller, swap them

        int arr[] = {3, 5, 6, 8, 9, 2};
        
        System.out.print("Original Array: ");
        for (int o : arr){
            System.out.print(o + " ");
        }
        System.out.println();
        
         insertionsort(arr);
         printArr(arr);
         
         /*
         
         if the user uses public class Insertion:
         insertionsort isort = new insertionsort();
         isort.sort(arr);
         isort.printArr(arr);
         
         */
    
    }
//   public class insertionsort{
    public static void insertionsort(int[] arr) {
//   void sort (int arr[]){
        //in the .length u could use "int n = arr.length;" btw
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            
            
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        
    }
    public static void printArr(int arr[]){ //Kinda Optionl NGL
        System.out.print("Sorted Array: ");
        for (int p : arr){
            System.out.print(p + " ");
        } // if the user uses class for this it has to be inside within that class
    }
}




