package Day_3;

import java.util.*;

// Java program to print the largest element in an array

public class Largest_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest elemnt in an Array: " + max);
        sc.close();
    }
}