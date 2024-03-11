package Day_3;

import java.util.*;
// Java program to print the elements of an array present on even position

public class Print_elements_even_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < length; i = i + 2) {
            System.out.print(arr[i]);
        }
        sc.close();
    }
}