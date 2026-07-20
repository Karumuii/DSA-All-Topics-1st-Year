package ForFinalsz;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorter_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // Ask user for number of elements
//        System.out.print("Enter number of elements: ");
//        int n = sc.nextInt();
//
//        // Create array and take input
//        int numbers[] = new int[n];
//        System.out.println("Enter " + n + " integers:");
//        for (int i = 0; i < n; i++) {
//            numbers[i] = sc.nextInt();
//        }
        int numbers[] = new int[4];
        System.out.println("Enter 4 numbers: ");
        for (int i = 0; i < 4; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(numbers));

        BubbleSort sorting = new BubbleSort();
        sorting.sort(numbers);

        sorting.printDisplay(numbers);
    }

    public static class BubbleSort {
        void sort(int numbers[]) {
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) { 
                for (int j = 0; j < n - i - 1; j++) { 
                    if (numbers[j] > numbers[j + 1]) { 
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
        }

        void printDisplay(int numbers[]) {
            System.out.print("Sorted Array: " + Arrays.toString(numbers));
        }
    }
}