/**
 * Created by Sam on 8/23/16.
 */

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] List;
        int userInput;
        int count;

        System.out.println("How many numbers would you like in the single dimensional array?");

        userInput = input.nextInt();

        List = new double[userInput];
        for (count = 0; count < List.length; count++) {
            System.out.println("What number would you like at position " + count);
            List[count] = input.nextDouble();
        }

        for (count = 0; count < List.length; count++) {
            System.out.print(List[count] + " ");
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }

    }
}
