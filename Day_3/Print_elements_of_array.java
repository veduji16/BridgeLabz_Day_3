package Day_3;

import java.util.*;

// Java program to print the elements of an array

public class Print_elements_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}