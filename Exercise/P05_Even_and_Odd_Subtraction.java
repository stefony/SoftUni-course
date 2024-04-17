package Array2809;

import java.util.Arrays;
import java.util.Scanner;

public class P05_Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int even = 0;
        int odd = 0;

        for (int element: number) {
            if ( element % 2 == 0){
            even+=element;
            }else {
                odd+=element;
            }
        }

        System.out.println(even-odd);
    }
}
