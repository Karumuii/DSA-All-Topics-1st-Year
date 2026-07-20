package Search_Algorithm;

public class Linear_Search {
   public static void main(String[] args) {
       /*
         Linear | Binary
         Linear = straight

        Linear search starts with 0

        Start = 0; End = 5;
        1 2 3 4 5 6 - Elements
        0 1 2 3 4 5 - Index

        Mid Pos 2 (index) - 3 (element)
        Mid Pos = Middle of the element where u count
        target 5 =

        1. Declaration of an array
        2. Initialize target value
        3. Create a new method for search
        4. Traversal
        5. Compare each element
        6. Call the search
        7. If the target is not found return -1

       
        Basically search lets you search the index of an element that u put in
       ex: targetElement = 3 the output will be '2'
        */

        int numbers[] = {1,2,3,4,5};
        int target = 3; // = index of 2, Output will be 2
                        // value in the array 

        System.out.println(Search(numbers, target));
    }
       
    public static int Search(int numbers[], int target){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                return i; // used when there is no 'void'
            }
        }
        return - 1; //if u don't find the one ur searching it will output -1
    }
}


