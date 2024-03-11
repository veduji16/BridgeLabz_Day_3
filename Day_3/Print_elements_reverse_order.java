package Day_3;

import java.util.*;

// Java program to print the elements of an array in reverse order

public class Print_elements_reverse_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}