package Array2809;

import java.util.Scanner;

public class P04_Reverse_an_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Split the input into an array of strings
        String[] array = input.split(" ");

        // Reverse the array
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Exchange the elements at start and end indices
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle of the array
            start++;
            end--;
        }

        // Print the reversed array
        System.out.print(" ");
        for (String element : array) {
            System.out.print(element + " ");
        }

    }
}
