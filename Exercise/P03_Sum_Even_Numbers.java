package Array2809;

import java.util.Arrays;
import java.util.Scanner;

public class P03_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current % 2 == 0){
                sum+=current;
            }


        }
        System.out.println(sum);
    }
}
