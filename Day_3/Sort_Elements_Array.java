package Day_3;

import java.util.*;

// Java program to print the sort elements of an array in ascending order

public class Sort_Elements_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int temp = 0;

        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}