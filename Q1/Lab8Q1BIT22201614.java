import java.util.Scanner;

public class Lab8Q1BIT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        int evenIndex = 0;

        System.out.println("Enter 5 Numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();

            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            }
        }

        System.out.println();
        System.out.println("myArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("evenArray Contents:");

        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
