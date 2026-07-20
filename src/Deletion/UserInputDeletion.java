package Deletion;
import java.util.*;
public class UserInputDeletion {
   public static void main(String[] args) {
         
        
        Scanner sn = new Scanner(System.in);

        int num[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(num));

        int newarr[] = new int [num.length - 1];

        System.out.print("Enter what index is your target: ");
        int indextarget = sn.nextInt();

//          j = old array i = new array
        for(int i = 0, j = 0; i < num.length; i++){
            if (i != indextarget){
                newarr[j] = num[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newarr));

    }
}





