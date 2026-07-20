package ForFinalsz;

public class BubbleSorterAlternative {
   public static void main(String[] args) {
         
         int array[] = {89, 87, 84, 90, 82, 86};
         System.out.print("Original Array: ");
         for (int o : array){
             System.out.print(o + " ");
         }
         System.out.println();
         BubbleSort(array);
         System.out.print("Sorted Array: ");
         for (int e : array){
             System.out.print(e + " ");
         }
         
         
    }
   public static void BubbleSort (int array[]){
       
       for (int i = 0; i < array.length - 1; i++){
           for (int j = 0; j < array.length - i - 1; j++){
               if (array[j] > array [j + 1]){
                   
                   //Swapping:
                   int temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp; 
               }
           }
       }
       
   }
}