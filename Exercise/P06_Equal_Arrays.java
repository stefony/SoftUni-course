package Array2809;


import java.util.Arrays;
import java.util.Scanner;

public class P06_Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int diff = 0;
        boolean isIdent = true;

        for (int i = 0; i < firstArr.length ; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];

            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                diff = i;
                isIdent = false;
                break;
            }
        }
            if (isIdent){
                System.out.printf("Arrays are identical. Sum: %d",sum);
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.",diff);
            }

            }
}
