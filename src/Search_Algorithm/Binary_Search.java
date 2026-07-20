package Search_Algorithm;

public class Binary_Search {
   public static void main(String[] args) {
      
        /*
            Binary calculates the Middle Element
            Value = element

            Process:
            1. declare an array
            2. declare a target
            3. create a new method for search
            4. Initialize search boundaries
            5. Traversal
            6. Compute middle index/pos
            7. Validation to check if the middle element is greater than the target.
            8. if true Update End Pointer
            9. Second validation to check if the middle element is smaller than target
            10. if true update start pointer
            11. return the index
            12. return -1 if loops end without finding the target.

         */
        int  num[] = {1,2,3,4,5,6};

        int target = 5; // target element

        System.out.println(search(num, target));

    }
    public static int search(int num[], int target){

        int start = 0;
        int end = num.length - 1; // num has a length of 6 after the -1 the value is 5

        while (start <= end){
            // Steps on calculating
            //           3            1          2
            int midpos = start + (end - start) / 2; // = 2.5 | 5 - 0 = 5, 5 / 2 = 2.5, 2.5 + 0 = 2.5

            // inside the [] is the value/element
            if (num[midpos] > target){
                end = midpos - 1;
            } else if (num[midpos] < target){
                start = midpos + 1; // 3 (3.5) , comes back to while then proceed
            } else { // if the first two is false
                return midpos;
            }

        }


        return -1;
    }
}