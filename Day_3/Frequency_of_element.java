package Day_3;

import java.util.*;

// Java program to find the frequency of each element in the array

public class Frequency_of_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] frequency = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited)
                frequency[i] = count;
        }

        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frequency[i]);
        }
        System.out.println("----------------------------------------");
        sc.close();
    }
}
