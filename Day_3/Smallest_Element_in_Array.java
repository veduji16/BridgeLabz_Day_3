package Day_3;

import java.util.*;

// Java program to print the smallest element in the array

public class Smallest_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element of the array: " + min);
        sc.close();
    }
}