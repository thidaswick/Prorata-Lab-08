
import java.util.Scanner;

public class Lab8Q3IT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {

            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = number;
                count++;
            }
        }

        int maximum = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println();
        System.out.println("Array Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + maximum);
    }
}
