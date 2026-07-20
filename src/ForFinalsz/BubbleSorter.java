package ForFinalsz;
//1st Topic of Finals
import java.util.Arrays;

public class BubbleSorter {
   public static void main(String[] args) {
         /*
       Comparable:
       Bubble Sort  = Not efficient for large datasets
       
       Dot Sort = dont know how the sort happens
       Bubble Sort = provides more detail process
       
       */
//         int num[] = {21,1,0,2,78,6,54};
//         Arrays.sort(num); // DOT sort
//         
//         System.out.println(Arrays.toString(num));
  
//         int numbers[] = {23,4,5,12,0,256,1};
// Bubble Sort:
           int numbers[] = {23,4,5,12};
           System.out.println("Original Array: " + Arrays.toString(numbers));
         
         BubbleSort sorting = new BubbleSort();
         sorting.sort(numbers);
         
         sorting.printDisplay(numbers);
    }
   public static class BubbleSort{
       //Method = function of class
       void sort(int numbers[]){ //void = return type
           // n = 4 (element value) - 1 = 3 (index value)
           int n = numbers.length; //optional | 
            //       Nag -1 because after the element is sorted para di na sya ma apil
           for (int i = 0; i < n - 1; i++){ //outer loop = passer, loops and checks if it's sorted
               for (int j = 0; j < n - i - 1; j++){ //inner loop = comparing elements, -1 para di  na mag compare sa sorted element
                   if (numbers[j] > numbers[j + 1]){ //Validate, ascending order change it into '<' for descending order 
                       //      0             0 + 1
                       //        23 > 4 = True
                       int temp = numbers[j]; // temp == 23, Temporary Variable
                       //Swapping
                       numbers[j] = numbers[j + 1]; // 23 is in the index 1 and not in the 0 na
                       numbers[j + 1] = temp;
                   }
               }
           }
       }
       void printDisplay(int numbers[]){
           int n = numbers.length;
           System.out.print("Sorted Array (for loop): ");
           for (int i = 0; i < n; i++){ //idk para asa ni diri
               System.out.print(numbers[i] + " "); //my code
           }
           System.out.println();
           System.out.println("Sorted Array (.toString): "+ Arrays.toString(numbers) + " "); //in ani ky sir
            System.out.print("Sorted Array (for each): ");
            for (int num : numbers){                  // while akoa in ani
                System.out.print(num + " ");
            }
       }
   }
}
// Advance Study:
// Insertion and Selection
// Recursive and Binary


// Discussion Friday 4/24/26
//Merge Sort and Quick Sort (Recursive)